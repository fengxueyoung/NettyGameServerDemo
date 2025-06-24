package com.fxy.game.sever.handler;

import com.fxy.game.message.Wrapper;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author FengXueyang
 * @Title GameHandler
 * @Date 2025/6/23 17:16
 **/
public class GameHandler extends SimpleChannelInboundHandler<Wrapper> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Wrapper msg) throws Exception {

    }
}
