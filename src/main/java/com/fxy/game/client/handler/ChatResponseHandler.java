package com.fxy.game.client.handler;

import com.fxy.game.message.ChatResponse;
import com.fxy.game.message.Wrapper;
import com.google.protobuf.Timestamp;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author FengXueyang
 * @Title ChatResponseHandler
 * @Date 2025/6/25 11:39
 **/
public class ChatResponseHandler extends SimpleChannelInboundHandler<Wrapper> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Wrapper msg) throws Exception {
        if (msg.getMsgCase() == Wrapper.MsgCase.CHATRESPONSE) {
            ChatResponse response = msg.getChatResponse();
            String fromUser = response.getFrom();
            String message = response.getText();
            Timestamp timestamp = response.getTimestamp();
            System.out.println("from:" + fromUser + "\nmessage:" + message + "\ntime:" + timestamp.getSeconds());
        }
    }
}
