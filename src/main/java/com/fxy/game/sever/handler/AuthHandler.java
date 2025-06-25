package com.fxy.game.sever.handler;

import com.fxy.game.message.Wrapper;
import com.fxy.game.sever.service.AuthService;
import com.fxy.game.util.ServerUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.net.InetSocketAddress;

/**
 * @author FengXueyang
 * @Title AuthHandler
 * @Date 2025/6/23 17:15
 **/
public class AuthHandler extends SimpleChannelInboundHandler<Wrapper> {


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        InetSocketAddress address = (InetSocketAddress) ctx.channel().remoteAddress();
        ServerUtil.print("有新的客户端连接 host[{}] port[{}]", address.getHostString(), address.getPort());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Wrapper msg) {
        Wrapper wrapper = AuthService.getInstance().handleAuth(ctx, msg);
        ctx.writeAndFlush(wrapper);
        if (wrapper.getAuthResponse().getSuccess()) {
            ctx.pipeline().remove(this);
        }
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
