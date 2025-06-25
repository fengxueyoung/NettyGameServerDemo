package com.fxy.game.util;

import cn.hutool.core.util.StrUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author FengXueyang
 * @Title ServerUtil
 * @Date 2025/6/24 16:40
 **/
public class ServerUtil {

    private static final ThreadPoolExecutor POOL = new ThreadPoolExecutor(
            16, 20, 10, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(1024),
            r -> new Thread(r, "ServerUtil-thread-"),
            new ThreadPoolExecutor.CallerRunsPolicy()
    );

    public static void print(String format, Object... args) {
        System.out.println("[" + getTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")) + "]:" + StrUtil.format(format, args));
    }

    public static LocalDateTime getTime() {
        return LocalDateTime.now();
    }

    public static Future<?> submit(Runnable task) {
        return POOL.submit(task);
    }
}
