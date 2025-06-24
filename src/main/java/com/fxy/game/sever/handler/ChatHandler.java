package com.fxy.game.sever.handler;

import com.fxy.game.message.ChatRequest;
import com.fxy.game.message.Wrapper;
import com.google.protobuf.ProtocolStringList;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author FengXueyang
 * @Title ChatHandler
 * @Date 2025/6/23 17:15
 **/
public class ChatHandler extends SimpleChannelInboundHandler<Wrapper> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Wrapper msg) throws Exception {
        Wrapper.MsgCase msgCase = msg.getMsgCase();
        if (msgCase == Wrapper.MsgCase.CHATREQUEST) {
            ChatRequest request = msg.getChatRequest();
            String sessionId = request.getSessionId();
            String text = request.getText();
            ProtocolStringList toList = request.getToList();
            if (toList.isEmpty()) {
                // 群聊
            } else {

            }
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
