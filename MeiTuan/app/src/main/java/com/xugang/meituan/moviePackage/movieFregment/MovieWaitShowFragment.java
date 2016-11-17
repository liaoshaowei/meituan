package com.xugang.meituan.moviePackage.movieFregment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xugang.meituan.R;

/**
 * Created by Administrator on 2016/10/31 0031.
 */
public class MovieWaitShowFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.movie_wait_show_fragment,container,false);
        return view;
    }
}
