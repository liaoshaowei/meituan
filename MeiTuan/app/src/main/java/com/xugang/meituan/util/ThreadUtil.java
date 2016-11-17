package com.xugang.meituan.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ASUS on 2016-10-08.
 */
public class ThreadUtil {
    private static ExecutorService executorService;

    public static void execute(Runnable task) {
        if (executorService == null)
            executorService = Executors.newFixedThreadPool(10);
        executorService.submit(task);
    }
}
