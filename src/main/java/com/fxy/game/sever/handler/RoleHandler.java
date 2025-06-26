package com.fxy.game.sever.handler;

import com.fxy.game.message.Wrapper;
import com.fxy.game.sever.service.RoleService;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author FengXueyang
 * @Title RoleHandlker
 * @Date 2025/6/23 17:16
 **/
public class RoleHandler extends SimpleChannelInboundHandler<Wrapper> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Wrapper msg) throws Exception {
        if(msg.getMsgCase() == Wrapper.MsgCase.ROLEREQUEST) {
            Wrapper wrapper = RoleService.getInstance().handleRole(ctx, msg.getRoleRequest());
            ctx.writeAndFlush(wrapper);
        }
    }
}
