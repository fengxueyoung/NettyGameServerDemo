package com.fxy.game.sever.service;

import com.fxy.game.core.datastore.RoleMock;
import com.fxy.game.message.Role;
import com.fxy.game.message.RoleRequest;
import com.fxy.game.message.RoleResponse;
import com.fxy.game.message.Wrapper;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author FengXueyang
 * @Title RoleService
 * @Date 2025/6/26 11:02
 **/
public class RoleService {

    private static volatile RoleService instance = null;

    public static RoleService getInstance() {
        if (instance == null) {
            synchronized (RoleService.class) {
                if (instance == null) {
                    instance = new RoleService();
                }
                return instance;
            }
        }
        return instance;
    }

    public Wrapper handleRole(ChannelHandlerContext ctx, RoleRequest request) {
        switch (request.getOp()) {
            case CREATE -> {
                return Wrapper.newBuilder()
                        .setRoleResponse(RoleResponse.newBuilder()
                                .setRole(createRole(request.getUsername(), request.getRoleName()))
                                .setSuccess(true)
                                .setMessage("create success!").build()).build();
            }
            case QUERY -> {
                return Wrapper.newBuilder()
                        .setRoleResponse(RoleResponse.newBuilder()
                                .setRole(getRole(request.getUsername()))
                                .setSuccess(true)
                                .setMessage("query success!").build()).build();
            }
            default -> {
                return Wrapper.newBuilder()
                        .setRoleResponse(RoleResponse.newBuilder()
                                .setSuccess(false)
                                .setMessage("unknown op").build()).build();
            }
        }
    }


    private Role createRole(String username, String roleName) {
        return RoleMock.createRole(username, roleName);
    }


    private Role getRole(String username) {
        return RoleMock.getRole(username);
    }

    private void removeRole(String username) {
        RoleMock.removeRole(username);
    }

    private void clearRoles() {
        RoleMock.clearRoles();
    }

}
