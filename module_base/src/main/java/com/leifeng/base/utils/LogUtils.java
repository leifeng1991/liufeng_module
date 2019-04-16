package com.leifeng.base.utils;

import android.util.Log;

public class LogUtils {
    public static final String TAG = LogUtils.class.getSimpleName();
    private static boolean isDebug = true;

    public static void v(String message) {
        v(TAG, message);
    }

    public static void v(String tag, String message) {
        if (isDebug) Log.e(tag, message);
    }

    public static void d(String message) {
        d(TAG, message);
    }

    public static void d(String tag, String message) {
        if (isDebug) Log.e(tag, message);
    }

    public static void i(String message) {
        w(TAG, message);
    }

    public static void i(String tag, String message) {
        if (isDebug) Log.e(tag, message);
    }

    public static void w(String message) {
        w(TAG, message);
    }

    public static void w(String tag, String message) {
        if (isDebug) Log.e(tag, message);
    }

    public static void e(String message) {
        e(TAG, message);
    }

    public static void e(String tag, String message) {
        if (isDebug) Log.e(tag, message);
    }

    public static void a(String message) {
        a(TAG, message);
    }

    public static void a(String tag, String message) {
        if (isDebug) Log.e(tag, message);
    }
}
