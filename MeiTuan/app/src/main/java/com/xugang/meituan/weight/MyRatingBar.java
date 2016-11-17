package com.xugang.meituan.weight;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.xugang.meituan.R;

/**
 * Created by ASUS on 2016-11-02.
 */
public class MyRatingBar extends View {

    private static final String TAG = "test";
    private Bitmap bgBitmap;
    private Bitmap hBitmap;
    private float proportion;

    public void setProportion(float proportion) {
        if (proportion == 0) {
            this.proportion = 0.1f;
        } else {
            this.proportion = proportion;
        }
        invalidate();
    }

    public MyRatingBar(Context context) {
        this(context, null, 0);
    }

    public MyRatingBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyRatingBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (bgBitmap == null) {
            bgBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_rating_star_small_off);
            hBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_rating_star_small_on);
        }

        //画背景图
        Bitmap bgBitmapII = createBgBitmap(bgBitmap);
        int left = getWidth() / 2 - bgBitmapII.getWidth() / 2;
        int top = getHeight() / 2 - bgBitmapII.getHeight() / 2;
        canvas.drawBitmap(bgBitmapII, left, top, null);

        //画前景图
        Bitmap hBitmapII = createBgBitmap(hBitmap);
        int width = (int) ((proportion / 5f) * hBitmapII.getWidth());
        Bitmap bitmap = Bitmap.createBitmap(hBitmapII, 0, 0, width == 0 ? 1 : width, hBitmapII.getHeight());
        canvas.drawBitmap(bitmap, left, top, null);

    }

    private Bitmap createBgBitmap(Bitmap bitmap) {
        Bitmap paper = Bitmap.createBitmap(bitmap.getWidth() * 5, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        //创造一张画布，将白纸Bitmap固定在画布上
        Canvas canvas = new Canvas(paper);
        //在白纸上绘制Bitmap
        for (int i = 0; i < 5; i++) {
            canvas.drawBitmap(bitmap, ((paper.getWidth() / 5) * i), 0, null);
        }
        canvas.save();
        return paper;
    }
}