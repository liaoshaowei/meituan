package com.xugang.meituan.foodpackage.activity;

import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.xugang.meituan.JPush;
import com.xugang.meituan.R;
import com.xugang.meituan.foodpackage.adapter.ActivtyAdapter;
import com.xugang.meituan.foodpackage.adapter.FoodTypeAdapter;
import com.xugang.meituan.foodpackage.adapter.ShopAdapter;
import com.xugang.meituan.foodpackage.classes.FoodPlay;
import com.xugang.meituan.foodpackage.classes.FoodType;
import com.xugang.meituan.foodpackage.fragment.FirstFragment;
import com.xugang.meituan.foodpackage.fragment.SecondFragment;
import com.xugang.meituan.foodpackage.utils.FoodHttpUtils;
import com.xugang.meituan.foodpackage.utils.FoodTypeUtil;
import com.xugang.meituan.foodpackage.widget.MyPtrPullToRefresh;
import com.xugang.meituan.foodpackage.widget.MyScrollView;
import com.xugang.meituan.foodpackage.widget.MyViewpager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnPageChange;
import in.srain.cube.views.ptr.PtrClassicDefaultHeader;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;

public class FoodActivity extends JPush implements ShopAdapter.FoodShopClickListener {

    private static final String TAG = "test";
    @BindView(R.id.ivBack)
    ImageView ivBack;
    @BindView(R.id.llSearch)
    LinearLayout llSearch;
    @BindView(R.id.ivPosition)
    ImageView ivPosition;
    @BindView(R.id.vpAd)
    MyViewpager vpAd;
    @BindView(R.id.rbAdOne)
    RadioButton rbAdOne;
    @BindView(R.id.rbAdTwo)
    RadioButton rbAdTwo;
    @BindView(R.id.rgAd)
    RadioGroup rgAd;
    @BindView(R.id.rvActivity)
    RecyclerView rvActivity;
    @BindView(R.id.rlAll)
    RelativeLayout rlAll;
    @BindView(R.id.rlNeighbor)
    RelativeLayout rlNeighbor;
    @BindView(R.id.rlRank)
    RelativeLayout rlRank;
    @BindView(R.id.rlFiltrate)
    RelativeLayout rlFiltrate;
    List<Fragment> fragments = new ArrayList<>();
    List<FoodPlay> foodPlays = new ArrayList<>();
    List<Object> list = new ArrayList<>();
    @BindView(R.id.rvShop)
    RecyclerView rvShop;
    @BindView(R.id.llLeader)
    LinearLayout llLeader;
    @BindView(R.id.rvFoodType)
    RecyclerView rvFoodType;
    @BindView(R.id.msv)
    MyScrollView msv;
    @BindView(R.id.llActionHead)
    LinearLayout llActionHead;
    @BindView(R.id.rlHoldAll)
    RelativeLayout rlHoldAll;
    @BindView(R.id.rlHoldNeighbor)
    RelativeLayout rlHoldNeighbor;
    @BindView(R.id.rlHoldRank)
    RelativeLayout rlHoldRank;
    @BindView(R.id.rlHoldFiltrate)
    RelativeLayout rlHoldFiltrate;
    @BindView(R.id.llHoldLeader)
    LinearLayout llHoldLeader;
    @BindView(R.id.ptrflRefresh)
    MyPtrPullToRefresh ptrflRefresh;
    @BindView(R.id.llNeedScroll)
    LinearLayout llNeedScroll;
    private ShopAdapter shopAdapter;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case FoodHttpUtils.MSG_JSON_SHOP_SUCCESS:
                    Log.e(TAG, "handleMessage:MSG_JSON_SHOP_SUCCESS");
                    if (shopAdapter == null) {
                        list.addAll(FoodHttpUtils.data);
                        list.add(3, FoodHttpUtils.tips);
                        rvShop.setLayoutManager(new LinearLayoutManager(FoodActivity.this, LinearLayoutManager.VERTICAL, false));
                        shopAdapter = new ShopAdapter(FoodActivity.this, list);
                        rvShop.setAdapter(shopAdapter);
                        shopAdapter.setFoodShopClickListener(FoodActivity.this);
                    } else {
                        shopAdapter.notifyDataSetChanged();
                    }
                case FoodHttpUtils.MSG_JSON_SHOP_FAIL:
                case FoodHttpUtils.MSG_JSON_SHOP_RESPONSE_FAIL:
                    break;
            }
        }
    };
    private FoodTypeAdapter foodTypeAdapter;
    private int currentVpItem = 0;
    private int needdHeight;
    private PtrClassicDefaultHeader defaultHeader;
    private List<FoodType> showFoodType;
    boolean haveSeted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        ButterKnife.bind(this);
        initAdvertisementListener();//初始化广告部分的监听
        initActivity();//初始化活动
        FoodHttpUtils.showShopList(handler);//显示shoplist界面
        initFoodType();//初始化食品类型部分
        playAdvertisementByTurn();//轮播碎片
        defaultHeader = new PtrClassicDefaultHeader(this);
        ptrflRefresh.setHeaderView(defaultHeader);
        ptrflRefresh.addPtrUIHandler(defaultHeader);
        ptrflRefresh.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showFoodType = FoodTypeUtil.getShowFoodType(FoodActivity.this);
                        foodTypeAdapter.setList(showFoodType);
                        foodTypeAdapter.notifyDataSetChanged();
                        ptrflRefresh.refreshComplete();
                    }
                }, 3000);
            }
        });
        ptrflRefresh.setViewPager(vpAd);
        ptrflRefresh.setEnabled(true);
        msv.setMyOnScollChangedListener(new MyScrollView.MyOnScollChangedListener() {
            @Override
            public void onScrollChanged(int l, int t, int oldl, int oldt) {
                Log.d(TAG, "onScrollChanged() called with: " + "l = [" + l + "], t = [" + t + "], oldl = [" + oldl + "], oldt = [" + oldt + "]");
                if (t <= 0) {
                    ptrflRefresh.setEnabled(true);
                } else {
                    ptrflRefresh.setEnabled(false);
                }
                Log.e(TAG, "onWindowFocusChanged: needdHeight=" + needdHeight);
                if (t <= needdHeight) {
                    llHoldLeader.setVisibility(View.GONE);
                } else {
                    llHoldLeader.setVisibility(View.VISIBLE);
                }
            }
        });
    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        overridePendingTransition(R.anim.exit,R.anim.exit);
//    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && !haveSeted) {
            haveSeted = true;
            needdHeight = llNeedScroll.getHeight();
        }
    }

    //获得屏幕高度
    private Point getScreen() {
        Display disp = getWindowManager().getDefaultDisplay();
        Point outP = new Point();
        disp.getSize(outP);
        return outP;
    }

    //获得应用高度
    private int getAppHeight() {
        Rect outRect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(outRect);
        return outRect.height();
    }

    private void initFoodType() {
        FoodTypeUtil.addFoodTypeData(this);//添加食品类型的数据
        FoodTypeUtil.getShowFoodType(this);
        rvFoodType.setLayoutManager(new GridLayoutManager(this, 4, LinearLayoutManager.VERTICAL, false));
        showFoodType = FoodTypeUtil.getShowFoodType(this);
        foodTypeAdapter = new FoodTypeAdapter(this, showFoodType);
        rvFoodType.setAdapter(foodTypeAdapter);
    }

    //初始化活动部分
    private void initActivity() {
        foodPlays.add(new FoodPlay("http://p1.meituan.net/320.0.a/deal/dad0e099257cef6fa18db137043b4d2a257667.jpg@0_23_1195_724a%7C388h_640w_2e_90Q.webp"));
        foodPlays.add(new FoodPlay("http://p0.meituan.net/320.0.a/deal/950c12b05494ee5e0e8f80cf19eae5ef108254.jpg@0_3_1280_775a%7C388h_640w_2e_90Q.webp"));
        foodPlays.add(new FoodPlay("http://p1.meituan.net/dpdeal/b459441b64e1e457d6db9fb38b83559670898.jpg.webp"));
        foodPlays.add(new FoodPlay("http://p1.meituan.net/dpdeal/6f7d57f7dc8e3997e4d9dd5d01fbdf26144482.jpeg.webp"));
        foodPlays.add(new FoodPlay("http://p0.meituan.net/320.0.a/deal/37f1ae4c3f3701e605ae9fad1fbe1f91149231.jpg@0_47_1530_927a%7C388h_640w_2e_90Q.webp"));
        rvActivity.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvActivity.setAdapter(new ActivtyAdapter(this, rvActivity, foodPlays));
    }

    //广告部分监听
    private void initAdvertisementListener() {
        fragments.add(new FirstFragment());
        fragments.add(new SecondFragment());
        vpAd.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });
        vpAd.setCurrentItem(0);
        rgAd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbAdOne:
                        vpAd.setCurrentItem(0);
                        break;
                    case R.id.rbAdTwo:
                        vpAd.setCurrentItem(1);
                        break;
                }
            }
        });
    }

    //碎片翻页监听
    @OnPageChange(R.id.vpAd)
    public void onPageSelected(int position) {
        if (position == 0) {
            rbAdOne.setChecked(true);
            currentVpItem = 0;
        } else {
            rbAdTwo.setChecked(true);
            currentVpItem = 1;
        }
    }

    private void playAdvertisementByTurn() {
        if (currentVpItem == 0) {
            currentVpItem = 1;
        } else {
            currentVpItem = 0;
        }
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                vpAd.setCurrentItem(currentVpItem);
                playAdvertisementByTurn();
            }
        }, 3000);
    }

    //点击监听按钮的监听
    @OnClick({R.id.ivBack, R.id.llSearch, R.id.ivPosition, R.id.rlAll, R.id.rlNeighbor, R.id.rlRank, R.id.rlFiltrate})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivBack:
                break;
            case R.id.llSearch:
                break;
            case R.id.ivPosition:
                break;
            case R.id.rlAll:
                break;
            case R.id.rlNeighbor:
                break;
            case R.id.rlRank:
                break;
            case R.id.rlFiltrate:
                break;
        }
    }

    @Override
    public void foodShopClick() {
        startActivity(new Intent(this, FoodShopActivity.class));
    }
}
