package com.xugang.meituan;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xugang.meituan.fragment.FirstPageFragment;
import com.xugang.meituan.fragment.FujingFragment;
import com.xugang.meituan.fragment.MineFragment;
import com.xugang.meituan.util.ScreenUtil;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.BmobUser;
import cn.sharesdk.framework.ShareSDK;

public class MainActivity extends ExitApp {

    private static final String TAG = "test";
    @BindView(R.id.vTopExtra)
    View vTopExtra;
    @BindView(R.id.flMain)
    FrameLayout flMain;
    @BindView(R.id.rbFirstPage)
    RadioButton rbFirstPage;
    @BindView(R.id.rbFujing)
    RadioButton rbFujing;
    @BindView(R.id.rbMine)
    RadioButton rbMine;
    @BindView(R.id.rg)
    RadioGroup rg;
    private FirstPageFragment firstPageFragment;
    private Fragment currentFragment;
    private FujingFragment fujingFragment;
    private MineFragment mineFragment;
    private SharedPreferences user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.vTopExtra).setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ScreenUtil.getStatusBarHeight(getResources())));
        ButterKnife.bind(this);
        //初始化share SDK
        ShareSDK.initSDK(this);

        user = getSharedPreferences("user", MODE_PRIVATE);
        SharedPreferences.Editor edit = user.edit();
        edit.putBoolean("isfirst", false);
        edit.commit();


        BmobUser user = BmobUser.getCurrentUser(this, BmobUser.class);
        if (user != null) {
            EventBus.getDefault().postSticky(true);
        }

        initFragment();
        showFragment(firstPageFragment);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbFirstPage:
                        showFragment(firstPageFragment);
                        rbFirstPage.setTextColor(getResources().getColor(R.color.mine_text_on));
                        rbFujing.setTextColor(getResources().getColor(R.color.mine_text_no));
                        rbMine.setTextColor(getResources().getColor(R.color.mine_text_no));
                        break;
                    case R.id.rbFujing:
                        showFragment(fujingFragment);
                        rbFujing.setTextColor(getResources().getColor(R.color.mine_text_on));
                        rbMine.setTextColor(getResources().getColor(R.color.mine_text_no));
                        rbFirstPage.setTextColor(getResources().getColor(R.color.mine_text_no));
                        break;
                    case R.id.rbMine:
                        showFragment(mineFragment);
                        rbFirstPage.setTextColor(getResources().getColor(R.color.mine_text_no));
                        rbFujing.setTextColor(getResources().getColor(R.color.mine_text_no));
                        rbMine.setTextColor(getResources().getColor(R.color.mine_text_on));
                        break;
                }
            }
        });
    }

    private void initFragment() {
        firstPageFragment = new FirstPageFragment();
        fujingFragment = new FujingFragment();
        mineFragment = new MineFragment();
        currentFragment = firstPageFragment;
    }

    private void showFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (!fragment.isAdded()) {
            fragmentTransaction.add(R.id.flMain, fragment);
        }
        fragmentTransaction.hide(currentFragment).show(fragment);
        fragmentTransaction.commit();
        currentFragment = fragment;
    }
}
