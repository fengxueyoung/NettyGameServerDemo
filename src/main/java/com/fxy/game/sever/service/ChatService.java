package com.fxy.game.sever.service;

import com.fxy.game.message.Wrapper;

/**
 * @author FengXueyang
 * @Title ChatService
 * @Date 2025/6/25 17:16
 **/
public class ChatService {
    private static volatile ChatService chatService = null;

    public ChatService getInstance() {
        if (chatService == null) {
            synchronized (ChatService.class) {
                if (chatService == null) {
                    chatService = new ChatService();
                }
                return chatService;
            }
        } else {
            return chatService;
        }
    }

//    public Wrapper handleChat
}
