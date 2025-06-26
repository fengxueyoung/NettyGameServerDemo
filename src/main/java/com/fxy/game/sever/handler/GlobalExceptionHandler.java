package com.fxy.game.sever.handler;

import com.fxy.game.message.Wrapper;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author FengXueyang
 * @Title GlobalExceptionHandler
 * @Date 2025/6/26 08:54
 **/
public class GlobalExceptionHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
