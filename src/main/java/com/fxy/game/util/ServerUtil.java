package com.fxy.game.util;

import cn.hutool.core.util.StrUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author FengXueyang
 * @Title ServerUtil
 * @Date 2025/6/24 16:40
 **/
public class ServerUtil {
    public static void print(String format, Object... args) {
        System.out.println("[" + getTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")) + "]:" + StrUtil.format(format, args));
    }

    public static LocalDateTime getTime() {
        return LocalDateTime.now();
    }
}
