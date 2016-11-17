package com.xugang.meituan.foodpackage.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.xugang.meituan.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by qf on 2016/10/31.
 */
public class FirstFragment extends Fragment {
    @BindView(R.id.ivFirstAd)
    ImageView ivFirstAd;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.food_fragment_first, container, false);
            ButterKnife.bind(this, view);
           Glide.with(getContext())
                   .load("http://img3.imgtn.bdimg.com/it/u=2348362890,1631062191&fm=15&gp=0.jpg")
                   .into(ivFirstAd);
        }
        return view;
    }
}
