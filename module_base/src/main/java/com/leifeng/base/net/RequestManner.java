package com.leifeng.base.net;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

public class RequestManner {

    public static <T> void Request(Observable<T> observable, OnRequestListener<T> observer) {
        observable.compose(BaseSchedulers.<T>compose()).subscribe(observer);
    }

    public static <T> void ConvertBeanRequest(Observable<RequestResultBean<T>> observable, OnRequestListener<T> observer) {
        observable.compose(BaseConvertDataSchedulers.<T>compose()).subscribe(observer);
    }

    public static <T> void ConvertDataRequest(Observable<RequestResultBean<T>> observable, OnRequestListener<RequestResultBean<T>> observer) {
        observable.compose(BaseConvertBeanSchedulers.<T>compose()).subscribe(observer);
    }
}
