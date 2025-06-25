package com.fxy.game.client.handler;

import com.fxy.game.client.util.SessionHolder;
import com.fxy.game.message.AuthResponse;
import com.fxy.game.message.Wrapper;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author FengXueyang
 * @Title AuthResponseHandler
 * @Date 2025/6/25 15:27
 **/
public class AuthResponseHandler extends SimpleChannelInboundHandler<Wrapper> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Wrapper msg) throws Exception {
        if (msg.getMsgCase() == Wrapper.MsgCase.AUTHRESPONSE) {
            AuthResponse response = msg.getAuthResponse();
            boolean success = response.getSuccess();
            String message = response.getMessage();
            String sessionId = response.getSessionId();
            System.out.println("register:" + success + ";msg:" + message);
            if (success) {
                SessionHolder.setSessionId(sessionId);
                ctx.pipeline().remove(this);
            }
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
