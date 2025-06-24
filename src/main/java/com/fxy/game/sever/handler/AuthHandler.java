package com.fxy.game.sever.handler;

import com.fxy.game.core.DataStore;
import com.fxy.game.core.SessionManager;
import com.fxy.game.message.AuthRequest;
import com.fxy.game.message.AuthResponse;
import com.fxy.game.message.Wrapper;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author FengXueyang
 * @Title AuthHandler
 * @Date 2025/6/23 17:15
 **/
public class AuthHandler extends SimpleChannelInboundHandler<Wrapper> {


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Wrapper msg) throws Exception {
        Wrapper.MsgCase msgCase = msg.getMsgCase();
        if (msgCase == Wrapper.MsgCase.AUTHREQUEST) {
            AuthRequest request = msg.getAuthRequest();
            switch (request.getType()) {
                case REGISTER -> {
                    handlerRegister(ctx, request);
                }
                case LOGIN -> {
                    handlerLogin(ctx, request);
                }
                default -> {
                    sendAuthFail(ctx, "未知操作!");
                }
            }
        } else {
            sendAuthFail(ctx, "请先登录!");
        }
    }

    private void handlerRegister(ChannelHandlerContext ctx, AuthRequest request) {
        if (!DataStore.exists(request.getUsername())) {
            DataStore.create(request.getUsername(), request.getPassword());
            sendAuthSuccess(ctx, request.getUsername());
        } else {
            sendAuthFail(ctx, "用户名已存在!");
        }
    }

    private void handlerLogin(ChannelHandlerContext ctx, AuthRequest request) {
        if (!DataStore.exists(request.getUsername())) {
            sendAuthFail(ctx, "用户不存在!");
        } else {
            if (DataStore.verify(request.getUsername(), request.getPassword())) {
                sendAuthSuccess(ctx, request.getUsername());
            } else {
                sendAuthFail(ctx, "用户名或密码错误!");
            }
        }

    }

    private void sendAuthFail(ChannelHandlerContext ctx, String msg) {
        ctx.writeAndFlush(Wrapper.newBuilder()
                .setAuthResponse(AuthResponse.newBuilder()
                        .setSuccess(false)
                        .setMessage(msg)
                        .build()));
    }

    private void sendAuthSuccess(ChannelHandlerContext ctx, String username) {
        ctx.writeAndFlush(Wrapper.newBuilder()
                .setAuthResponse(AuthResponse.newBuilder()
                        .setSessionId(SessionManager.createSession(username, ctx.channel()))
                        .setSuccess(true)
                        .setMessage("登录成功!")
                        .build()));
        ctx.pipeline().remove(this);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
