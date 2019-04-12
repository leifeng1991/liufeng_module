package com.leifeng.base.net;

import android.net.ParseException;
import android.util.Log;

import com.google.gson.JsonParseException;

import org.json.JSONException;

import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import retrofit2.HttpException;

public abstract class OnRequestListener<T>  implements Observer<T> {
    @Override
    public void onSubscribe(Disposable d) {
        Log.e("=================", "onSubscribe");
    }

    @Override
    public void onNext(T t) {
        Log.e("=================", "onNext");
        onSuccess(t);
    }

    @Override
    public void onError(Throwable t) {
        Log.e("=================", t.getMessage());
        if (t instanceof HttpException) {
            // http错误
            Log.e("=================", "http错误");
        } else if (t instanceof ConnectException || t instanceof UnknownHostException) {
            // 连接错误
            Log.e("=================", "连接错误");
        } else if (t instanceof InterruptedIOException) {
            // 连接超时
            Log.e("=================", "连接超时");
        } else if (t instanceof JsonParseException || t instanceof JSONException || t instanceof ParseException) {
            // 解析错误
            Log.e("=================", "解析错误");
        } else if (t instanceof ServerException) {
            // 服务器错误
            Log.e("=================", "服务器错误");
        } else {
            // 未知错误
            Log.e("=================", "未知错误");
        }
        Log.e("=================", "onError");
    }

    @Override
    public void onComplete() {
        Log.e("=================", "onComplete");
    }

    public void onFailed(String code, String message){
        // 错误提示
    }

    protected abstract void onSuccess(T bean);
}
