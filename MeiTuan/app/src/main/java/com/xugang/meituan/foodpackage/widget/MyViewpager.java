package com.xugang.meituan.foodpackage.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by qf on 2016/11/14.
 */
public class MyViewpager extends ViewPager{
    private static final String TAG = "test";
    float mDownX;
    float mDownY;
    public MyViewpager(Context context) {
        super(context);
    }

    public MyViewpager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

//    @Override
//    public boolean dispatchTouchEvent(MotionEvent ev) {
//
//        switch (ev.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                //DOWN 事件的时候记录下当前的xy左标
//                mDownX=ev.getX();
//                mDownY=ev.getY();
//                getParent().requestDisallowInterceptTouchEvent(true);
//                break;
//            case MotionEvent.ACTION_MOVE:
//            /*MOVE 事件后计算x轴y轴的移动距离 ，如果x轴移动距离大于y轴，
//            那么该事件有ViewPager处理，否则交给父容器处理*/
//                if(Math.abs(ev.getX()-mDownX)>Math.abs(ev.getY()-mDownY)){
//                  getParent().requestDisallowInterceptTouchEvent(true);
//                    Log.e(TAG, "dispatchTouchEvent:viewpager" );
//                    return true;
//                }else{
//                    getParent().requestDisallowInterceptTouchEvent(false);
//                }
//                break;
//            case MotionEvent.ACTION_CANCEL:
//                getParent().requestDisallowInterceptTouchEvent(false);
//                break;
//            default:
//                break;
//        }
//        return super.dispatchTouchEvent(ev);
//    }
}
