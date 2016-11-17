package com.xugang.meituan.alipay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.xugang.meituan.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExternalFragment extends Fragment {

    @BindView(R.id.tvSubject)
    TextView tvSubject;
    @BindView(R.id.tvInfo)
    TextView tvInfo;
    @BindView(R.id.tvPrice)
    TextView tvPrice;
    @BindView(R.id.pay)
    Button pay;
    @BindView(R.id.h5pay)
    Button h5pay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pay_external, container, false);
        ButterKnife.bind(this, view);
        Intent intent = getActivity().getIntent();
        String price = intent.getStringExtra("Price");
        String subject = intent.getStringExtra("Subject");
        int num = intent.getIntExtra("Num",1);
        tvSubject.setText(subject);
        tvInfo.setText(subject+"电影票"+num+"张");
        tvPrice.setText("￥"+price);
        return view;
    }
}
