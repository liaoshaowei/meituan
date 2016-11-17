package com.xugang.meituan.foodpackage.classes;

import android.graphics.Bitmap;

/**
 * Created by qf on 2016/11/3.
 */
public class FoodType  {
    private String name;
    private Bitmap foodImg;

    public FoodType(String name, Bitmap foodImg) {
        this.name = name;
        this.foodImg = foodImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(Bitmap foodImg) {
        this.foodImg = foodImg;
    }
}
