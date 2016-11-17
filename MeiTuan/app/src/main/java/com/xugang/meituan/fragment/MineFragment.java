package com.xugang.meituan.fragment;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.xugang.meituan.LoginActivity;
import com.xugang.meituan.R;
import com.xugang.meituan.SetActivity;
import com.xugang.meituan.SettingActivity;
import com.xugang.meituan.weight.PullToRefreshView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.BmobUser;

/**
 * Created by ASUS on 2016-10-31.
 */
public class MineFragment extends Fragment {
    private static final String TAG = "test";
    @BindView(R.id.tvLoad)
    TextView tvLoad;
    @BindView(R.id.ivUserPhoto)
    ImageView ivUserPhoto;
    @BindView(R.id.tvUserName)
    TextView tvUserName;
    @BindView(R.id.llUser)
    LinearLayout llUser;
    @BindView(R.id.svRoot)
    ScrollView svRoot;
    @BindView(R.id.ptrv)
    PullToRefreshView ptrv;
    @BindView(R.id.teSetting)
    TextView teSetting;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_mine, container, false);
            ButterKnife.bind(this, view);
            EventBus.getDefault().register(this);
        }

        ptrv.setOnHeaderRefreshListener(new PullToRefreshView.OnHeaderRefreshListener() {
            @Override
            public void onHeaderRefresh(PullToRefreshView view) {
                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ptrv.onHeaderRefreshComplete();
                    }
                }, 2000);
            }
        });
        return view;
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = true)
    public void dealLoadEvent(Boolean isLoad) {
        if (isLoad) {
            tvLoad.setVisibility(View.GONE);
            llUser.setVisibility(View.VISIBLE);
            BmobUser uses = BmobUser.getCurrentUser(getContext());
            tvUserName.setText(uses.getUsername());
            ivUserPhoto.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.takeout_icon_comment_mt_sender_color_default));
        } else {
            tvLoad.setVisibility(View.VISIBLE);
            llUser.setVisibility(View.GONE);
            ivUserPhoto.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_user_homepage_photo_default));
        }
    }

    @OnClick(R.id.llUser)
    public void onLlUserClick() {
        startActivity(new Intent(getActivity(), SettingActivity.class));
    }

    @OnClick(R.id.teSetting)
    public void onTvSettingClick() {
        startActivity(new Intent(getActivity(), SetActivity.class));
    }

    @OnClick(R.id.tvLoad)
    public void onTvLoadClick() {
        startActivity(new Intent(getActivity(), LoginActivity.class));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
