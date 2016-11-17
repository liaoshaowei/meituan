package com.xugang.meituan.foodpackage.utils;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.xugang.meituan.foodpackage.classes.Shop;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by qf on 2016/11/1.
 */
public class FoodHttpUtils {
    public static final int MSG_JSON_SHOP_SUCCESS = 11;
    public static final int MSG_JSON_SHOP_FAIL = 22;
    public static final int MSG_JSON_SHOP_RESPONSE_FAIL = 33;
    private static final String TAG = "test";
    public static List<Shop.DataBean> data=null;
    public static List<Shop.TipsBean> tips =null;
    public static String json="http://api.meituan.com/meishi/filter/v4/deal/select/city/20/cate/1?sort=defaults" +
            "&mypos=23.175837%2C113.340699&ci=20&hasGroup=true&mpt_cate1=-1&mpt_cate2=1&wifi-name=" +
            "%E5%A6%82%E6%9E%9C%E6%9A%B4%E5%8A%9B%E4%B8%8D%E6%98%AF%E4%B8%BA%E4%BA%86%E6%9D%80%E6%88%AE%08%E5%A4%A9%E7%8E%8B%E7%9B%96%E5%9C%B0%E8%99%8E%08HHHXXX%080000000000%08&wifi-mac=00%3A26%3Ac6%3A78%3A6f%3Aa1%0842%3Aa5%3A89%3A37%3A72%3A3f%0800%3A70%3A36%3A06%3A19%3A0d%0800%3A21%3A5d%3Ab4%3A1b%3Afd%08" +
            "&wifi-strength=-30%08-48%08-57%08-58%08&wifi-cur=0&offset=0&limit=25&client=android&__vhost=api.meishi.meituan.com&utm_source=wandoujia&utm_medium=android&utm_term=442&version_name=7.4.2&utm_content=353232071083085&utm_campaign=AgroupBgroupC0E0Ghomepage_category1_1__a1__gfood" +
            "&msid=3532320710830851478053780783&uuid=3268D908B6F379CBAE3541FB6BBB4C0B6D0E5591C47012D36D8F70FB392E650F&userid=-1" +
            "&__reqTraceID=c0f840b8-2677-49ba-8881-df1f35df3884&__skck=6a375bce8c66a0dc293860dfa83833ef" +
            "&__skts=1478057148437&__skua=24a3dcea07c749176ff58f1238e28b0e&__skno=60da23a6-9c9e-4b5c-9e68-1676d33c2c10&__skcy=fE6nDGAsxUQv8ygRHTNNAQeUXaQ%3D";
    public static void showShopList(final Handler handler){
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .build();
        Request request = new Request.Builder()
                .url(json)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Message msg = new Message();
                msg.what=MSG_JSON_SHOP_FAIL;
                handler.sendMessage(msg);
                Log.e(TAG, "onFailure: IOException="+e.toString());
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()){
                    String json = response.body().string();
                    data = JsonUtil.parseShop(json).getData();
                    tips = JsonUtil.parseShop(json).getTips();
                    Message msg = new Message();
                    msg.what=MSG_JSON_SHOP_SUCCESS;
                    handler.sendMessage(msg);
                    Log.e(TAG, "onResponse:isSuccessful " );
                }else {
                    Message msg = new Message();
                    msg.what=MSG_JSON_SHOP_RESPONSE_FAIL;
                    handler.sendMessage(msg);
                    Log.e(TAG, "onResponse: failed" );
                }
            }
        });
    }
}

