package com.fxy.game.client.util;

/**
 * @author FengXueyang
 * @Title SessionHolder
 * @Date 2025/6/25 15:46
 **/
public class SessionHolder {
    private static String sessionId;

    public static void setSessionId(String sessionId) {
        SessionHolder.sessionId = sessionId;
    }

    public static String getSessionId() {
        return sessionId;
    }
}
