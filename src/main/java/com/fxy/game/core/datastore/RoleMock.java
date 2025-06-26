package com.fxy.game.core.datastore;

import com.fxy.game.message.Role;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author FengXueyang
 * @Title RoleMock
 * @Date 2025/6/26 10:08
 **/
public class RoleMock {
    private static final Map<String, Role> ROLE_MAP = new ConcurrentHashMap<>();

    public static Role createRole(String username, String roleName) {
        Role role = Role.newBuilder()
                .setRoleName(roleName)
                .setLevel(0)
                .setExp(0).build();
        ROLE_MAP.put(username, role);
        return role;
    }

    public static Role getRole(String username) {
        return ROLE_MAP.get(username);
    }

    public static void removeRole(String username) {
        ROLE_MAP.remove(username);
    }

    public static void clearRoles() {
        ROLE_MAP.clear();
    }
}
