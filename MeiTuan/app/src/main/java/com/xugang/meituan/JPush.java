package com.xugang.meituan;

import android.support.v7.app.AppCompatActivity;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by ASUS on 2016-11-14.
 */
public class JPush extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        JPushInterface.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        JPushInterface.onPause(this);
    }
}
