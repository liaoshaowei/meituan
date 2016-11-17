package com.xugang.meituan.foodpackage.classes;

import android.graphics.Bitmap;

/**
 * Created by qf on 2016/11/1.
 */
public class FoodPlay {
    private String imgUri;

    public FoodPlay(String imgUri) {
        this.imgUri = imgUri;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }
}
