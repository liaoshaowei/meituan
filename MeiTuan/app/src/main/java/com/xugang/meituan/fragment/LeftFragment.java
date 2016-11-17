package com.xugang.meituan.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xugang.meituan.R;
import com.xugang.meituan.foodpackage.activity.FoodActivity;
import com.xugang.meituan.moviePackage.MovieActivity;
import com.xugang.meituan.util.CircularAnim;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ASUS on 2016-10-31.
 */
public class LeftFragment extends Fragment {
    @BindView(R.id.tvFood)
    TextView tvFood;
    @BindView(R.id.tvMovie)
    TextView tvMovie;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragmet_left, container, false);
            ButterKnife.bind(this, view);
        }
        return view;
    }

    @OnClick(R.id.tvFood)
    public void onTvFoodClick(View v) {
        CircularAnim.fullActivity(getActivity(), v)
//                .colorOrImageRes(R.mipmap.img_huoer_black)
                .duration(800)
                .go(new CircularAnim.OnAnimationEndListener() {
                    @Override
                    public void onAnimationEnd() {
                        startActivity(new Intent(getActivity(), FoodActivity.class));
                    }
                });

    }

    @OnClick(R.id.tvMovie)
    public void onTvMovieClick(View v) {
        CircularAnim.fullActivity(getActivity(), v)
//                .colorOrImageRes(R.mipmap.sss)
                .duration(800)
                .go(new CircularAnim.OnAnimationEndListener() {
                    @Override
                    public void onAnimationEnd() {
                        startActivity(new Intent(getActivity(), MovieActivity.class));
                    }
                });
    }
}
