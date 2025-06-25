package com.fxy.game.sever.service;

import com.fxy.game.core.DataStore;
import com.fxy.game.core.SessionManager;
import com.fxy.game.message.AuthRequest;
import com.fxy.game.message.AuthResponse;
import com.fxy.game.message.Wrapper;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author FengXueyang
 * @Title AuthService
 * @Date 2025/6/25 16:37
 **/
public class AuthService {

    private static volatile AuthService authService = null;

    public static AuthService getInstance() {
        if (authService == null) {
            synchronized (AuthService.class) {
                if (authService == null) {
                    authService = new AuthService();
                }
                return authService;
            }
        } else {
            return authService;
        }
    }

    public Wrapper handleAuth(ChannelHandlerContext ctx, AuthRequest request) {
        switch (request.getType()) {
            case REGISTER -> {
                return handlerRegister(ctx, request);
            }
            case LOGIN -> {
                return handlerLogin(ctx, request);
            }
            default -> {
                return sendAuthFail("未知操作!");
            }
        }
    }


    private Wrapper handlerRegister(ChannelHandlerContext ctx, AuthRequest request) {
        if (!DataStore.exists(request.getUsername())) {
            DataStore.create(request.getUsername(), request.getPassword());
            return sendAuthSuccess(ctx, request.getUsername());
        } else {
            return sendAuthFail("用户名已存在!");
        }
    }

    private Wrapper handlerLogin(ChannelHandlerContext ctx, AuthRequest request) {
        if (!DataStore.exists(request.getUsername())) {
            return sendAuthFail("用户不存在!");
        } else {
            if (DataStore.verify(request.getUsername(), request.getPassword())) {
                return sendAuthSuccess(ctx, request.getUsername());
            } else {
                return sendAuthFail("用户名或密码错误!");
            }
        }

    }

    private Wrapper sendAuthFail(String msg) {
        return Wrapper.newBuilder()
                .setAuthResponse(AuthResponse.newBuilder()
                        .setSuccess(false)
                        .setMessage(msg)
                        .build()).build();
    }

    private Wrapper sendAuthSuccess(ChannelHandlerContext ctx, String username) {
        return Wrapper.newBuilder()
                .setAuthResponse(AuthResponse.newBuilder()
                        .setSessionId(SessionManager.createSession(username, ctx.channel()))
                        .setSuccess(true)
                        .setMessage("登录成功!")
                        .build()).build();
    }
}
