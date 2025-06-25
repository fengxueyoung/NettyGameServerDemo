package com.fxy.game.sever.handler;

import com.fxy.game.message.Wrapper;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author FengXueyang
 * @Title AbstractRequestHandler
 * @Date 2025/6/25 10:01
 **/
public abstract class AbstractRequestHandler extends SimpleChannelInboundHandler<Wrapper> {

    abstract void sendRequestFail(ChannelHandlerContext ctx, String msg);

}
