package com.fxy.game.core;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author FengXueyang
 * @Title DataStore
 * @Date 2025/6/23 17:18
 **/
public class DataStore {

    /**
     * mock database
     */
    private static final Map<String, String> USERS = new ConcurrentHashMap<>();

    /**
     * 检查用户名是否存在
     *
     * @param username 用户名
     * @return 该用户是否存在
     */
    public static boolean exists(String username) {
        return USERS.containsKey(username);
    }

    /**
     * 创建一个用户
     *
     * @param username 用户名
     * @param password 密码
     * @return 是否创建成功
     */
    public static boolean create(String username, String password) {
        USERS.put(username, password);
        return true;
    }

    /**
     * 验证用户名密码是否正确
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户名密码是否正确
     */
    public static boolean verify(String username, String password) {
        return USERS.get(username).equals(password);
    }

}
