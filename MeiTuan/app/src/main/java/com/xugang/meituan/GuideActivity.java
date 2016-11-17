package com.xugang.meituan;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xugang.meituan.adapter.GuideAdapter;
import com.xugang.meituan.fragment.FragmentFive;
import com.xugang.meituan.fragment.FragmentFour;
import com.xugang.meituan.fragment.FragmentOne;
import com.xugang.meituan.fragment.FragmentThree;
import com.xugang.meituan.fragment.FragmentTwo;
import com.xugang.meituan.util.MyFileUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnPageChange;

public class GuideActivity extends JPush {

    @BindView(R.id.vpMain)
    ViewPager vpMain;
    @BindView(R.id.rg)
    RadioGroup rg;
    private FragmentOne fragmentOne;
    private FragmentTwo fragmentTwo;
    private FragmentThree fragmentThree;
    private FragmentFour fragmentFour;
    private FragmentFive fragmentFive;
    private List<Fragment> fragments = new ArrayList<>();
    private GuideAdapter guideAdapter;
    private SharedPreferences user;
    private boolean isfirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);

        user = getSharedPreferences("user", MODE_PRIVATE);
        isfirst = user.getBoolean("isfirst", true);
        if (isfirst == false) {
            startActivity(new Intent(this, AdvertisementActivity.class));
            super.onBackPressed();
            return;
        }
        MyFileUtil.writeImage(this);

        initFragment();
    }

    @OnPageChange(R.id.vpMain)
    public void onPageSelected(int position) {
        int childCount = rg.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RadioButton button = (RadioButton) rg.getChildAt(i);
            if (i == position) {
                button.setChecked(true);
            } else {
                button.setChecked(false);
            }
        }
    }

    private void initFragment() {
        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();
        fragmentThree = new FragmentThree();
        fragmentFour = new FragmentFour();
        fragmentFive = new FragmentFive();
        fragments.add(fragmentOne);
        fragments.add(fragmentTwo);
        fragments.add(fragmentThree);
        fragments.add(fragmentFour);
        fragments.add(fragmentFive);
        guideAdapter = new GuideAdapter(getSupportFragmentManager(), fragments);
        vpMain.setAdapter(guideAdapter);
    }


}
