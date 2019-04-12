package com.leifeng.base;

import com.leifeng.base.net.RequestResultBean;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface TestService {

    @FormUrlEncoded
    @POST("/Api/index2/getGoodsArTest")
    Observable<RequestResultBean<List<TestArGoodsListDataBean>>> get(@Field("shop_id") String shop_id);


    @FormUrlEncoded
    @POST("/Api/index2/getGoodsArTest")
    Observable<TestArGoodsListBean> get1(@Field("shop_id") String shop_id);
}
