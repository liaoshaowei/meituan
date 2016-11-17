package com.xugang.meituan.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xugang.meituan.MainActivity;
import com.xugang.meituan.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ASUS on 2016-11-07.
 */
public class FragmentThree extends Fragment {

    @BindView(R.id.tvSkip)
    TextView tvSkip;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.vp_three, container, false);
            ButterKnife.bind(this, view);
        }
        return view;
    }

    @OnClick(R.id.tvSkip)
    public void onTvSkipClick() {
        startActivity(new Intent(getActivity(), MainActivity.class));
        getActivity().onBackPressed();
    }
}
