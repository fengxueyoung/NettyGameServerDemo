package com.fxy.game.sever.bootstrap;

import com.fxy.game.message.Wrapper;
import com.fxy.game.sever.handler.*;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;

/**
 * @author FengXueyang
 * @Title GameServerHandlerChain
 * @Date 2025/6/24 14:23
 **/
public class GameServerHandlerChain extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) {
        ch.pipeline()
                .addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, 4, 0, 4))
                .addLast(new ProtobufDecoder(Wrapper.getDefaultInstance()))
                .addLast(new LengthFieldPrepender(4))
                .addLast(new ProtobufEncoder())
                .addLast(
                        new AuthHandler(),
                        new ChatHandler(),
                        new GameHandler(),
                        new MailHandler(),
                        new RoleHandler(),
                        new ShopHandler(),
                        new GlobalExceptionHandler()
                );
    }
}
