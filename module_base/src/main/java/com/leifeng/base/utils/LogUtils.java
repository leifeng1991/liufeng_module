package com.leifeng.base.utils;

import android.util.Log;

public class LogUtils {
    public static final String TAG = LogUtils.class.getSimpleName();
    private static boolean isDebug = true;
    private static int LOG_MAX_LENGTH = 2001;

    public static void v(String message) {
        v(TAG, message);
    }

    public static void v(String tag, String message) {
        if (isDebug){
            int maxStrLength = LOG_MAX_LENGTH - tag.length();
            // 大于4000时
            while (message.length() > maxStrLength) {
                Log.v(tag, message.substring(0, maxStrLength));
                message = message.substring(maxStrLength);
            }
            // 剩余部分
            Log.v(tag, message);

        }
    }

    public static void d(String message) {
        d(TAG, message);
    }

    public static void d(String tag, String message) {
        if (isDebug) Log.d(tag, message);
    }

    public static void i(String message) {
        i(TAG, message);
    }

    public static void i(String tag, String message) {
        if (isDebug) Log.i(tag, message);
    }

    public static void w(String message) {
        w(TAG, message);
    }

    public static void w(String tag, String message) {
        if (isDebug) Log.w(tag, message);
    }

    public static void e(String message) {
        e(TAG, message);
    }

    public static void e(String tag, String message) {
        if (isDebug) Log.e(tag, message);
    }

}
