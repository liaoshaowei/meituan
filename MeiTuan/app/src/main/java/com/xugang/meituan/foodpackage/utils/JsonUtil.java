package com.xugang.meituan.foodpackage.utils;

import com.google.gson.Gson;
import com.xugang.meituan.foodpackage.classes.Shop;

/**
 * Created by qf on 2016/11/1.
 */
public class JsonUtil {
    public  static Shop parseShop(String json){
        Shop shop = new Gson().fromJson(json, Shop.class);
        return shop;
    }
}
