package com.xugang.meituan.foodpackage.utils;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.xugang.meituan.R;
import com.xugang.meituan.foodpackage.classes.FoodType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by qf on 2016/11/3.
 */
public class FoodTypeUtil {
    private static final String TAG = "test";
    public  static List<FoodType> foodTypes=new ArrayList<>();

    public  static void addFoodTypeData(Context context) {
        foodTypes.add(new FoodType("小吃快餐", BitmapFactory.decodeResource(context.getResources(), R.mipmap.food_snake)));
        foodTypes.add(new FoodType("甜点饮品",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_delicious)));
        foodTypes.add(new FoodType("自助餐",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_enjoy_self)));
        foodTypes.add(new FoodType("火锅",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_dish)));
        foodTypes.add(new FoodType("生日蛋糕",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_cake)));
        foodTypes.add(new FoodType("西餐",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_western_food)));
//        foodTypes.add(new FoodType("名店抢购",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_famous_shop)));
        foodTypes.add(new FoodType("烧烤烤肉",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_toast)));
        foodTypes.add(new FoodType("港粤菜",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_hk_gd_food)));
        foodTypes.add(new FoodType("日韩料理",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_krn_jp_food)));
        foodTypes.add(new FoodType("川湘菜",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_hn_sc_food)));
        foodTypes.add(new FoodType("西北菜",BitmapFactory.decodeResource(context.getResources(),R.mipmap.food_west_noth_food)));
    }
    public static List<FoodType> getShowFoodType(Context context){
        List<FoodType> showFoodTypes=new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            if (i<7){
                while (true) {
                    Random random = new Random();
                    int randomNum = random.nextInt(11);
                    Log.e(TAG, "getShowFoodType:randomNum=" + randomNum);
                    FoodType foodType = foodTypes.get(randomNum);
                    if (!showFoodTypes.contains(foodType)) {
                        showFoodTypes.add(foodType);
                        break;
                    }
                }
            }else {
                showFoodTypes.add(new FoodType("名店抢购", BitmapFactory.decodeResource(context.getResources(), R.mipmap.food_famous_shop)));
            }
        }
        return showFoodTypes;
    }
}
