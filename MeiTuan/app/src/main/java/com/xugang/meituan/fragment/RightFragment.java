package com.xugang.meituan.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xugang.meituan.R;

/**
 * Created by ASUS on 2016-10-31.
 */
public class RightFragment extends Fragment {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragmet_right, container, false);
        }
        return view;
    }
}
