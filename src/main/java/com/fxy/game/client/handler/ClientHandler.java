package com.fxy.game.client.handler;

import com.fxy.game.message.AuthRequest;
import com.fxy.game.message.AuthResponse;
import com.fxy.game.message.Wrapper;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author FengXueyang
 * @Title ClientHandler
 * @Date 2025/6/24 14:55
 **/
public class ClientHandler extends SimpleChannelInboundHandler<Wrapper> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Wrapper msg) throws Exception {
        if (msg.hasAuthResponse()) {
            AuthResponse response = msg.getAuthResponse();
            boolean success = response.getSuccess();
            String message = response.getMessage();
            String sessionId = response.getSessionId();
            System.out.println("register:" + success + ";msg:" + message + ";sessionId:" + sessionId);
        }
        ctx.close();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // 测试服务器功能，通道激活后立刻发送
        ctx.writeAndFlush(Wrapper.newBuilder()
                .setAuthRequest(AuthRequest.newBuilder()
                        .setType(AuthRequest.OperationType.REGISTER)
                        .setUsername("test")
                        .setPassword("test").build()).build());
    }
}
