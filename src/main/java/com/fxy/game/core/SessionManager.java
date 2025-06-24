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
    private static final AttributeKey<String> USER_KEY = AttributeKey.newInstance("USER_KEY");
    private static final Map<String, Channel> SESSIONS = new ConcurrentHashMap<>();
    private static final SecureRandom RND = new SecureRandom();

    public static String createSession(String user, Channel ch) {
        String token = Long.toHexString(RND.nextLong());
        SESSIONS.put(token, ch);
        ch.attr(USER_KEY).set(user);
        return token;
    }

    public static Channel getChannel(String token) {
        return SESSIONS.get(token);
    }

    public static String getUserName(String token) {
        return SESSIONS.get(token).attr(USER_KEY).get();
    }
}
