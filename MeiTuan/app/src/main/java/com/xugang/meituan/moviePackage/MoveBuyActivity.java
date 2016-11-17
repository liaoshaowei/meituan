package com.xugang.meituan.moviePackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.xugang.meituan.JPush;
import com.xugang.meituan.R;
import com.xugang.meituan.alipay.PayDemoActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/11/14 0014.
 */
public class MoveBuyActivity extends JPush {

    @BindView(R.id.movie_buy_tv_back)
    TextView movieBuyTvBack;
    @BindView(R.id.movie_buy_tv_cinema)
    TextView movieBuyTvCinema;
    @BindView(R.id.movie_select_iv_share)
    TextView movieSelectIvShare;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_msg)
    TextView tvMsg;
    @BindView(R.id.tv_where)
    TextView tvWhere;
    @BindView(R.id.tv_seat)
    TextView tvSeat;
    @BindView(R.id.tv_buy)
    TextView tvBuy;
    @BindView(R.id.btn_buy)
    Button btnBuy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_buy_activity);
        ButterKnife.bind(this);

        String string = null;
        final Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        final String th = (String) extras.get("Th");
        final String tm = (String) extras.get("Tm");
        final String nm = (String) extras.get("Nm");
        final String lg = (String) extras.get("long");
        final String dt = (String) extras.get("dt");
        final String tp = (String) extras.get("Tp");
        final String sum = (String) extras.get("Sum");
        final String[] strings = extras.getStringArray("row");
        final String cinaName = (String) extras.get("cinaName");

        for (int i = 0; i < strings.length; i++) {
            if (i==0) {
                string = " " + strings[i];
            }else {
                string = string+strings[i];
            }

        }
        tvName.setText(nm);
        tvMsg.setText(dt+" "+tm+" "+lg);
        tvWhere.setText(cinaName);
        tvSeat.setText(th+string);
        tvBuy.setText("￥"+sum);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MoveBuyActivity.this, PayDemoActivity.class);
                intent1.putExtra("Subject",nm);
                intent1.putExtra("Price",sum);
                intent1.putExtra("Num",strings.length);
                startActivity(intent1);
            }
        });


        movieBuyTvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
