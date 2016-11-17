package com.xugang.meituan.foodpackage.activity;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.NestedScrollView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.xugang.meituan.JPush;
import com.xugang.meituan.R;
import com.xugang.meituan.foodpackage.widget.GlideCircleTransform;
import com.xugang.meituan.weight.MyRatingBar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FoodShopActivity extends JPush {

    private static final String TAG = "test";
    @BindView(R.id.ivFoodPicture)
    ImageView ivFoodPicture;
    @BindView(R.id.tvShopName)
    TextView tvShopName;
    @BindView(R.id.mrbAvgScore)
    MyRatingBar mrbAvgScore;
    @BindView(R.id.rlShopRetroduction)
    RelativeLayout rlShopRetroduction;
    @BindView(R.id.ivCoupon)
    ImageView ivCoupon;
    @BindView(R.id.tvCouponPrice)
    TextView tvCouponPrice;
    @BindView(R.id.ivGoup)
    ImageView ivGoup;
    @BindView(R.id.ivGroupCover)
    ImageView ivGroupCover;
    @BindView(R.id.tvGroupPrice)
    TextView tvGroupPrice;
    @BindView(R.id.ivGroupCoverII)
    ImageView ivGroupCoverII;
    @BindView(R.id.tvGroupPriceII)
    TextView tvGroupPriceII;
    @BindView(R.id.ivCustomerHead)
    ImageView ivCustomerHead;
    @BindView(R.id.tvCustomerName)
    TextView tvCustomerName;
    @BindView(R.id.ivCustomerLevel)
    ImageView ivCustomerLevel;
    @BindView(R.id.mrbCustomerScore)
    MyRatingBar mrbCustomerScore;
    @BindView(R.id.nsv)
    NestedScrollView nsv;
    @BindView(R.id.ivBack)
    ImageView ivBack;
    @BindView(R.id.ivShare)
    ImageView ivShare;
    @BindView(R.id.ivCollect)
    ImageView ivCollect;
    @BindView(R.id.ivError)
    ImageView ivError;
    @BindView(R.id.llActionBar)
    LinearLayout llActionBar;
    @BindView(R.id.ivBuy)
    ImageView ivBuy;
    @BindView(R.id.clContent)
    CoordinatorLayout clContent;
    @BindView(R.id.abl)
    AppBarLayout abl;
    @BindView(R.id.llHeadBuy)
    LinearLayout llHeadBuy;
//    @BindView(R.id.mflFoodShop)
//    MyFlowLayout mflFoodShop;
    private String mNames[] = {
            "好吃的不得了 98","你是有个逗逼么 76","真的 33",
            "你见过我的小熊吗 142","这货不是牛肉面 76","面对疾风吧 453",
            "天天都不会 87","你见过需要仰望的约德尔人么 648","好运不会眷顾傻瓜 90",
            "有没有碧莲 86","其实我想当个面包师 54","好好吃吧 66"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_shop);
        ButterKnife.bind(this);
        llActionBar.getBackground().setAlpha(0);
        Glide.with(this)
                .load("http://e.hiphotos.baidu.com/bainuo/crop=0,22,700,424;w=470;q=80/sign=304380a64110b912ab8eacbefecdd031/4afbfbedab64034f85a2051ba9c379310a551d44.jpg")
                .into(ivFoodPicture);
        Glide.with(this)
                .load("http://ali.xinshipu.cn/20131209/original/1386537644505.jpg")
                .into(ivGroupCover);
        Glide.with(this)
                .load("http://ali.xinshipu.cn/20131209/original/1386537644505.jpg")
                .into(ivGroupCoverII);
        Glide.with(this)
                .load(R.mipmap.food_custonmer_head)
                .bitmapTransform(new GlideCircleTransform(this))
                .into(ivCustomerHead);
        initChildViews();
//        clContent.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                int llActionBarHeight = llActionBar.getHeight();
//                int[] screenLocation = new int[2];
//                rlShopRetroduction.getLocationOnScreen(screenLocation);
//                Rect frame = new Rect();
//                getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
//                int statusBarHeight = frame.top;
//
//                int totalHeight = ivFoodPicture.getHeight() - llActionBarHeight;
//                int currentHeight = screenLocation[1] - statusBarHeight - llActionBarHeight;
//                float alph = currentHeight * 1.0f / totalHeight;
//                if (alph < 0) {
//                    alph = 0;
//                } else if (alph > 1) {
//                    alph = 1;
//                }
//                Log.e(TAG, "onTouch:(int) alph*255=" + (int) alph * 255);
//                llActionBar.getBackground().setAlpha((int) alph * 255);
//                return false;
//            }
//        });
        abl.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                int ivFoodPictureHeight = ivFoodPicture.getHeight();
                int ablHeight = ivFoodPictureHeight - llActionBar.getHeight();
                int realOffset = 0 - verticalOffset;
                Log.e(TAG, "onOffsetChanged:realOffset=" + realOffset + "/ivFoodPictureHeight=" + ivFoodPictureHeight);
                if (realOffset > ivFoodPictureHeight) {
                    realOffset = ivFoodPictureHeight;
                }
                int currentOffset = 0 - verticalOffset;
                if (currentOffset > ablHeight) {
                    currentOffset = ablHeight;

                } else if (currentOffset < 0) {
                    currentOffset = 0;
                }
                if (currentOffset == ablHeight) {
                    ivBack.setImageResource(R.mipmap.food_ic_actionbar_back);
                    ivShare.setImageResource(R.mipmap.food_shop_item_share_solid);
                    ivCollect.setImageResource(R.mipmap.food_shop_item_collect_solid);
                    ivError.setImageResource(R.mipmap.food_shop_item_error_solid);
                } else {
                    ivBack.setImageResource(R.mipmap.food_ic_actionbar_back_white);
                    ivShare.setImageResource(R.mipmap.food_shop_item_share_transparent);
                    ivCollect.setImageResource(R.mipmap.food_shop_item_collect_transparent);
                    ivError.setImageResource(R.mipmap.food_shop_item_error_transparent);
                }

                if (ivFoodPictureHeight == realOffset) {
                    llHeadBuy.setVisibility(View.VISIBLE);
                    Log.e(TAG, "onOffsetChanged: VISIBLE");
                } else {
                    llHeadBuy.setVisibility(View.GONE);
                    Log.e(TAG, "onOffsetChanged: GONE");
                }
                int alph = currentOffset * 255 / ablHeight;
                Log.e(TAG, "currentOffset=" + currentOffset + "/alph=" + alph + "/ablHeight=" + ablHeight);
                llActionBar.getBackground().setAlpha(alph);

            }
        });
    }
    private void initChildViews() {
        // TODO Auto-generated method stub
        ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.leftMargin = 10;
        lp.rightMargin = 5;
        lp.topMargin = 5;
        lp.bottomMargin = 5;
        for(int i = 0; i < mNames.length; i ++){
            TextView view = new TextView(this);
            view.setText(mNames[i]);
            view.setTextColor(getResources().getColor(R.color.orange));
//            view.setBackgroundResource(R.drawable.food_shop_myflowlayout_text_shape);
//            mflFoodShop.addView(view,lp);
        }
    }
}
