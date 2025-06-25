package com.fxy.game.core;

import io.netty.channel.Channel;
import io.netty.util.AttributeKey;

import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author FengXueyang
 * @Title SessionManager
 * @Date 2025/6/23 17:17
 **/
public class SessionManager {
    public static final AttributeKey<String> USER_KEY = AttributeKey.newInstance("USER_KEY");
    public static final AttributeKey<String> USER_TOKEN = AttributeKey.newInstance("USER_TOKEN");
    private static final Map<String, String> SESSIONS = new ConcurrentHashMap<>();
    private static final Map<String, Channel> SESSION_CHANNELS = new ConcurrentHashMap<>();
    private static final SecureRandom RND = new SecureRandom();

    public static String createSession(String user, Channel ch) {
        String token = Long.toHexString(RND.nextLong());
        SESSIONS.put(token, user);
        SESSION_CHANNELS.put(user, ch);
        ch.attr(USER_KEY).set(user);
        ch.attr(USER_TOKEN).set(token);
        return token;
    }

    public static Channel getChannel(String username) {
        return SESSION_CHANNELS.get(username);
    }

    public static String getUserName(String token) {
        return SESSIONS.get(token);
    }

    public static boolean validateSession(String username, String token) {
        return SESSIONS.get(token).equals(username);
    }
}
