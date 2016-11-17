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
public class SecondFragment extends Fragment {
    @BindView(R.id.ivSecondAd)
    ImageView ivSecondAd;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.food_fragment_second, container, false);
            ButterKnife.bind(this, view);
            Glide.with(getContext())
                    .load("http://images.yeyou.com/2013/article/2013/01/06/20130106161412891.jpg")
                    .into(ivSecondAd);
        }
        return view;
    }
}
