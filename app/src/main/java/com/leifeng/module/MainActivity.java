package com.leifeng.module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.leifeng.base.TestArGoodsListBean;
import com.leifeng.base.TestArGoodsListDataBean;
import com.leifeng.base.TestService;
import com.leifeng.base.net.OnRequestListener;
import com.leifeng.base.net.RequestManner;
import com.leifeng.base.net.RequestResultBean;
import com.leifeng.base.net.RetrofitFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestManner.ConvertBeanRequest(RetrofitFactory.getInstance().create(TestService.class).get(""), new OnRequestListener<List<TestArGoodsListDataBean>>(){
            @Override
            protected void onSuccess(List<TestArGoodsListDataBean> bean) {
                Log.e("=================", new Gson().toJson(bean));
            }
        });

        RequestManner.ConvertDataRequest(RetrofitFactory.getInstance().create(TestService.class).get(""), new OnRequestListener<RequestResultBean<List<TestArGoodsListDataBean>>>() {
            @Override
            protected void onSuccess(RequestResultBean<List<TestArGoodsListDataBean>> bean) {
                Log.e("=================", new Gson().toJson(bean));
            }
        });

        RequestManner.Request(RetrofitFactory.getInstance().create(TestService.class).get1(""), new OnRequestListener<TestArGoodsListBean>() {
            @Override
            protected void onSuccess(TestArGoodsListBean bean) {
                Log.e("=================", new Gson().toJson(bean));
            }
        });
    }
}
