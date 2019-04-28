package com.leifeng.base.glide;

import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

public class ImageLoaderUtils {

    /**
     * 加载网络图片
     *
     * @param imageUrl  图片地址
     * @param imageView 图片控件
     */
    public static void loaderUrlImage(String imageUrl, ImageView imageView) {
        Glide.with(imageView.getContext()).asGif().load(imageUrl).centerCrop().into(imageView);
    }

    /**
     * 加载网络图片（图片大小根据图片宽高比例设置、自适应）
     *
     * @param imageUrl  图片地址
     * @param imageView 图片控件
     */
    public static void loaderUrlAutoImage(String imageUrl, final ImageView imageView) {
        Glide.with(imageView.getContext()).asGif().load(imageUrl).centerCrop().listener(new RequestListener<GifDrawable>() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<GifDrawable> target, boolean isFirstResource) {
                return false;
            }

            @Override
            public boolean onResourceReady(GifDrawable resource, Object model, Target<GifDrawable> target, DataSource dataSource, boolean isFirstResource) {
                if (resource != null && resource.getIntrinsicWidth() > 0 && resource.getIntrinsicHeight() > 0) {
                    // 图片没有问题
                    if (imageView.getWidth() > 0) {
                        // 目标View没问题，根据图片宽高比例设置imageView的高
                        // 设置控件高
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        layoutParams.height = (int) (1.0 * resource.getIntrinsicHeight() * imageView.getWidth() / resource.getIntrinsicWidth());
                        imageView.setLayoutParams(layoutParams);
                        // 设置控件内容
                        imageView.setImageDrawable(resource);
                        return true;// 已经处理
                    }
                }
                return false;
            }
        }).into(imageView);
    }

    /**
     * 加载网络图片
     *
     * @param imageUrl        图片地址
     * @param imageView       图片控件
     * @param transformations 图片转换（可以转换为圆形图片、圆角图片等）
     */
    public static void loaderUrlImage(String imageUrl, ImageView imageView, Transformation<Bitmap>... transformations) {
        RequestOptions requestOptions = new RequestOptions();
        // 有转换直接添加进去
        if (transformations != null && transformations.length > 0)
            requestOptions.transform(transformations);
        Glide.with(imageView.getContext()).asGif().load(imageUrl).centerCrop().apply(requestOptions).into(imageView);
    }
}
