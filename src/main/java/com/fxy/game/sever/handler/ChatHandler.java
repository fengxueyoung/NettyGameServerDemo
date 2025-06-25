package com.fxy.game.sever.handler;

import com.fxy.game.core.SessionManager;
import com.fxy.game.message.ChatRequest;
import com.fxy.game.message.ChatResponse;
import com.fxy.game.message.Wrapper;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.Timestamp;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @author FengXueyang
 * @Title ChatHandler
 * @Date 2025/6/23 17:15
 **/
public class ChatHandler extends AbstractRequestHandler {

    private static final ChannelGroup CHANNEL_GROUP = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        CHANNEL_GROUP.add(ctx.channel());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        CHANNEL_GROUP.remove(ctx.channel());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Wrapper msg) throws Exception {
        Wrapper.MsgCase msgCase = msg.getMsgCase();
        if (msgCase == Wrapper.MsgCase.CHATREQUEST) {
            ChatRequest request = msg.getChatRequest();
            String username = ctx.channel().attr(SessionManager.USER_KEY).get();
            String sessionId = request.getSessionId();
            if (!SessionManager.validateSession(username, sessionId)) {
                sendRequestFail(ctx, "无效会话!");
                return;
            }
            String text = request.getText();
            ProtocolStringList toList = request.getToList();
            if (toList.isEmpty()) {
                // 群聊
                CHANNEL_GROUP.writeAndFlush(
                        Wrapper.newBuilder()
                                .setChatResponse(ChatResponse.newBuilder()
                                        .setFrom(username)
                                        .setText(text)
                                        .setTimestamp(Timestamp.newBuilder()
                                                .setSeconds(System.currentTimeMillis() / 1000).build()).build()).build()
                );
            } else {
                for (String toUserName : toList) {
                    sendPrivateCharMsg(SessionManager.getChannel(toUserName), username, text);
                }
            }
        }
    }

    private void sendPrivateCharMsg(Channel destCh, String fromUserName, String text) {
        if (destCh != null && destCh.isActive()) {
            destCh.writeAndFlush(
                    Wrapper.newBuilder()
                            .setChatResponse(ChatResponse.newBuilder()
                                    .setFrom(fromUserName)
                                    .setText(text)
                                    .setTimestamp(Timestamp.newBuilder()
                                            .setSeconds(System.currentTimeMillis() / 1000).build()).build()).build()
            );
        }
    }

    @Override
    void sendRequestFail(ChannelHandlerContext ctx, String msg) {
        ctx.writeAndFlush(Wrapper.newBuilder()
                .setChatResponse(ChatResponse.newBuilder()
                        .setFrom("server")
                        .setText(msg)
                        .setTimestamp(Timestamp.newBuilder()
                                .setSeconds(System.currentTimeMillis() / 1000).build()).build()).build());
        ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
