package com.xugang.meituan;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PictureActivity extends JPush {

    @BindView(R.id.vpPicture)
    ViewPager vpPicture;
    @BindView(R.id.ivClose)
    ImageView ivClose;
    @BindView(R.id.tvInfo)
    TextView tvInfo;
    @BindView(R.id.tvDownLoad)
    TextView tvDownLoad;
    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.tvNumber)
    TextView tvNumber;
    public static final String TAG = "test";
    private int[] images = new int[]{R.mipmap.a, R.mipmap.b, R.mipmap.c, R.mipmap.d, R.mipmap.e, R.mipmap.f, R.mipmap.g, R.mipmap.h, R.mipmap.i};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        ButterKnife.bind(this);

        initAdapter();
        String title = getIntent().getStringExtra("title");
        tvInfo.setText(title);

    }

    private void initAdapter() {
        vpPicture.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return images.length;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(((ImageView) object));
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView imageView = new ImageView(PictureActivity.this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), images[position]));
                container.addView(imageView);
                return imageView;
            }
        });
    }

    @OnClick(R.id.ivClose)
    public void onIvCloseClick(View view) {
        super.onBackPressed();
    }
}
