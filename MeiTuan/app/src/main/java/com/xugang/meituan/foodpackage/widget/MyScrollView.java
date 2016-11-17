package com.xugang.meituan.foodpackage.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ScrollView;

/**
 * Created by qf on 2016/11/10.
 */
public class MyScrollView extends ScrollView {
    private static final String TAG = "test";
    private int downX;
    private int downY;
    private int mTouchSlop;
//    private float xDistance, yDistance, xLast, yLast;
    public MyScrollView(Context context) {
        super(context);
        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public MyScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent e) {
        int action = e.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                downX = (int) e.getRawX();
                downY = (int) e.getRawY();
//                xDistance = yDistance = 0f;
//                xLast = e.getX();
//                yLast = e.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                int moveY = (int) e.getRawY();
//                final float curX = e.getX();
//                final float curY = e.getY();
//                xDistance += Math.abs(curX - xLast);
//                yDistance += Math.abs(curY - yLast);
//                xLast = curX;
//                yLast = curY;
                if (Math.abs(moveY - downY) > mTouchSlop) {
                    Log.e(TAG, "onInterceptTouchEvent: mTouchSlop" );
                    return true;
                }
        }
        return super.onInterceptTouchEvent(e);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (myOnScollChangedListener != null) {
            myOnScollChangedListener.onScrollChanged(l, t, oldl, oldt);
        }
    }

    MyOnScollChangedListener myOnScollChangedListener;

    public void setMyOnScollChangedListener(MyOnScollChangedListener myOnScollChangedListener) {
        this.myOnScollChangedListener = myOnScollChangedListener;
    }

    public interface MyOnScollChangedListener {
        void onScrollChanged(int l, int t, int oldl, int oldt);
    }

}
