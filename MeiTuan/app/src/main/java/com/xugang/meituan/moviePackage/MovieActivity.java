package com.xugang.meituan.moviePackage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.xugang.meituan.JPush;
import com.xugang.meituan.R;
import com.xugang.meituan.moviePackage.movieFregment.MovieHotShowingFragment;
import com.xugang.meituan.moviePackage.movieFregment.MovieShoppingFragment;
import com.xugang.meituan.moviePackage.movieFregment.MovieWaitShowFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/10/31 0031.
 */
public class MovieActivity extends JPush {

    @BindView(R.id.movie_btn1)
    RadioButton movieBtn1;
    @BindView(R.id.movie_btn2)
    RadioButton movieBtn2;
    @BindView(R.id.movie_btn3)
    RadioButton movieBtn3;
    @BindView(R.id.movie_rg)
    RadioGroup movieRg;
    @BindView(R.id.movie_fl)
    FrameLayout movieFl;
    @BindView(R.id.tv_back)
    TextView tvBack;

    private MovieHotShowingFragment hotShowingFragment;
    private MovieWaitShowFragment waitShowFragment;
    private MovieShoppingFragment shoppingFragment;
    private Fragment currentFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        ButterKnife.bind(this);

        hotShowingFragment = new MovieHotShowingFragment();
        waitShowFragment = new MovieWaitShowFragment();
        shoppingFragment = new MovieShoppingFragment();
        currentFragment = hotShowingFragment;
        movieBtn1.setBackgroundResource(R.drawable.movie_rb_shape_left_pressed);
        showFragment(hotShowingFragment);

        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        movieRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.movie_btn1:
                        showFragment(hotShowingFragment);
                        movieBtn1.setBackgroundResource(R.drawable.movie_rb_shape_left_pressed);
                        movieBtn2.setBackgroundResource(R.drawable.movie_rb_shape_center);
                        movieBtn3.setBackgroundResource(R.drawable.movie_rb_shape_right);
                        break;
                    case R.id.movie_btn2:
                        showFragment(waitShowFragment);
                        movieBtn1.setBackgroundResource(R.drawable.movie_rb_shape_left);
                        movieBtn2.setBackgroundResource(R.color.toobar_color);
                        movieBtn3.setBackgroundResource(R.drawable.movie_rb_shape_right);
                        break;
                    case R.id.movie_btn3:
                        showFragment(shoppingFragment);
                        movieBtn1.setBackgroundResource(R.drawable.movie_rb_shape_left);
                        movieBtn2.setBackgroundResource(R.drawable.movie_rb_shape_center);
                        movieBtn3.setBackgroundResource(R.drawable.movie_rb_shape_right_pressed);
                        break;
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private void showFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (!fragment.isAdded()) {
            ft.add(R.id.movie_fl, fragment);
        }
        ft.hide(currentFragment).show(fragment);
        ft.commit();
        currentFragment = fragment;
    }
}
