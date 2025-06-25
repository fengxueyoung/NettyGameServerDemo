package com.fxy.game.client.core;

import com.fxy.game.client.handler.AuthResponseHandler;
import com.fxy.game.client.handler.ChatResponseHandler;
import com.fxy.game.client.util.SessionHolder;
import com.fxy.game.message.AuthRequest;
import com.fxy.game.message.ChatRequest;
import com.fxy.game.message.Wrapper;
import com.fxy.game.util.ServerUtil;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioIoHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author FengXueyang
 * @Title Client
 * @Date 2025/6/24 14:55
 **/
public class Client {
    private Channel channel;

    public static void main(String[] args) throws InterruptedException {
        Client client = new Client();
        client.run();
        InputReader reader = new InputReader(client);
        ServerUtil.submit(reader);
    }

    private void run() throws InterruptedException {
        String host = "localhost";
        int port = 8080;

        EventLoopGroup group = new MultiThreadIoEventLoopGroup(NioIoHandler.newFactory());
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline()
                                .addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, 4, 0, 4))
                                .addLast(new ProtobufDecoder(Wrapper.getDefaultInstance()))
                                .addLast(new LengthFieldPrepender(4))
                                .addLast(new ProtobufEncoder())
                                .addLast(new AuthResponseHandler(),
                                        new ChatResponseHandler());
                    }
                })
                .channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true);
        ChannelFuture f = bootstrap.connect(host, port).sync();
        channel = f.channel();
    }

    private void sendMessage(String cmdMessage) {
        String[] params = cmdMessage.split(" ");

        switch (params[0]) {
            case "help" -> {
                System.out.println("help: register login chat exit ...");
            }
            case "register" -> {
                channel.writeAndFlush(Wrapper.newBuilder()
                        .setAuthRequest(AuthRequest.newBuilder()
                                .setType(AuthRequest.OperationType.REGISTER)
                                .setUsername(params[1])
                                .setPassword(params[2]).build()).build());
            }
            case "login" -> {
                channel.writeAndFlush(Wrapper.newBuilder()
                        .setAuthRequest(AuthRequest.newBuilder()
                                .setType(AuthRequest.OperationType.LOGIN)
                                .setUsername(params[1])
                                .setPassword(params[2]).build()).build());
            }
            case "chat" -> {
                if (params[1].startsWith("/")) {
                    sendChatRequest(channel, SessionHolder.getSessionId(), params[2], params[1].substring(1));
                } else {
                    sendChatRequest(channel, SessionHolder.getSessionId(), params[1]);
                }
            }
            case "exit" -> {
                channel.close();
                System.exit(0);
            }
            default -> {
                System.out.println("unknown command:" + params[0]);
            }
        }

    }

    private void sendChatRequest(Channel channel, String sessionId, String text, String... toUserName) {
        if (toUserName.length == 0) {
            channel.writeAndFlush(Wrapper.newBuilder()
                    .setChatRequest(ChatRequest.newBuilder()
                            .setSessionId(sessionId)
                            .setText(text).build()).build());

        } else {
            ChatRequest.Builder builder = ChatRequest.newBuilder()
                    .setSessionId(sessionId)
                    .setText(text);
            for (String s : toUserName) {
                builder.addTo(s);
            }
            channel.writeAndFlush(Wrapper.newBuilder()
                    .setChatRequest(builder.build()).build());

        }
    }


    private static class InputReader implements Runnable {

        private Client client;

        public InputReader(Client client) {
            this.client = client;
        }

        @Override
        public void run() {
            try (BufferedReader reader =
                         new BufferedReader(new InputStreamReader(System.in));) {
                while (true) {
                    String line = "";
                    try {
                        line = reader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                        break;
                    }
                    try {
                        client.sendMessage(line);
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


