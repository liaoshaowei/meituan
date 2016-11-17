package com.xugang.meituan.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by idea on 2016/10/11.
 */
public class MyListView extends ListView {

    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        int mode = MeasureSpec.getMode(heightMeasureSpec);
//        int size = MeasureSpec.getSize(heightMeasureSpec);
//        Log.e("test", "mode/size=" + mode + "/" + size);
        int myMeasureSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, myMeasureSpec);
    }

}
