package com.xugang.meituan.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ASUS on 2016-09-29.
 */
public class MyFlowLayout extends ViewGroup {
    public MyFlowLayout(Context context) {
        this(context, null, 0);
    }

    public MyFlowLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyFlowLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChildren(widthMeasureSpec, heightMeasureSpec);  //测量所有小孩的宽高

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int desiedWidth = 0, desiedHeight = 0;
        if (widthMode == MeasureSpec.EXACTLY) {
            desiedWidth = widthSize;
        } else {
            desiedWidth = getResources().getDisplayMetrics().widthPixels;     //如果宽度设置为wrop_contet,则宽度设置为屏幕的宽度
        }
        if (heightMode == MeasureSpec.EXACTLY) {
            desiedHeight = heightSize;
        } else {
            int currentLineWidth = 0;       //当前行所有孩子的宽度的总和,包括左右边距
            int totalHeight = 0;                //所有行的总高度,包括上下边距
            int currentLineHeight = 0;              //当前行的高度,取决于当前行最高的子元素

            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = getChildAt(i);
                MarginLayoutParams mlp = (MarginLayoutParams) child.getLayoutParams();
                //测量当前行剩余的宽度能否装下下一个子元素
                int testWidth = currentLineWidth + child.getMeasuredWidth() + mlp.leftMargin + mlp.rightMargin;
                if (testWidth > getMeasuredWidth()) {
                    totalHeight += currentLineHeight;       //换行,总行高加上当前行高
                    currentLineWidth = 0;           //重新计算行宽
                    currentLineHeight = 0;          //行高清零
                }

                currentLineWidth += child.getMeasuredWidth() + mlp.leftMargin + mlp.rightMargin;            //没放入一个字元素,刷新当前行的宽度
                currentLineHeight = Math.max(currentLineHeight, child.getMeasuredHeight() + mlp.topMargin + mlp.bottomMargin);
            }
            totalHeight += currentLineHeight;
            desiedHeight = totalHeight;
        }
        setMeasuredDimension(desiedWidth, desiedHeight);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int currentLineWidth = l;       //当前行所有孩子的宽度的总和,包括左右边距
        int totalHeight = t;                //所有行的总高度,包括上下边距
        int currentLineHeight = 0;              //当前行的高度,取决于当前行最高的子元素

        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            MarginLayoutParams mlp = (MarginLayoutParams) child.getLayoutParams();
            //测量当前行剩余的宽度能否装下下一个子元素
            int testWidth = currentLineWidth + child.getMeasuredWidth() + mlp.leftMargin + mlp.rightMargin;
            if (testWidth > getMeasuredWidth()) {
                totalHeight += currentLineHeight;       //换行,总行高加上当前行高
                currentLineWidth = l;           //重新计算行宽
                currentLineHeight = 0;          //行高清零
            }
            //插入子元素
            int left = currentLineWidth + mlp.leftMargin;
            int right = left + child.getMeasuredWidth();
            int top = totalHeight + mlp.topMargin;
            int bottom = top + child.getMeasuredHeight();
            child.layout(left, top, right, bottom);

            currentLineWidth += child.getMeasuredWidth() + mlp.leftMargin + mlp.rightMargin;            //没放入一个字元素,刷新当前行的宽度
            currentLineHeight = Math.max(currentLineHeight, child.getMeasuredHeight() + mlp.topMargin + mlp.bottomMargin);
        }
        totalHeight += currentLineHeight;

    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new MarginLayoutParams(getContext(), attrs);
    }
}
