package com.leifeng.base.utils;

import android.text.TextUtils;
import android.widget.Toast;

public class ToastUtils {
    private static ToastUtils INSTANCE = null;

    private ToastUtils(){}

    public static ToastUtils getInstance(){
        if (INSTANCE == null){
            synchronized (ToastUtils.class){
                if (INSTANCE == null){
                    INSTANCE = new ToastUtils();
                }
            }
        }
        return INSTANCE;
    }

    public void showShortToast(String text){
        if (TextUtils.isEmpty(text) || APPUtils.getContext() == null) return;
        Toast.makeText(APPUtils.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    public void showLongToast(String text){
        if (TextUtils.isEmpty(text) || APPUtils.getContext() == null) return;
        Toast.makeText(APPUtils.getContext(),text,Toast.LENGTH_LONG).show();
    }
}
