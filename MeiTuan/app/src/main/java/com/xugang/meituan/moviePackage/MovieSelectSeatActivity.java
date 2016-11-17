package com.xugang.meituan.moviePackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xugang.meituan.JPush;
import com.xugang.meituan.R;
import com.xugang.meituan.weight.SeatTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/11/8 0008.
 */
public class MovieSelectSeatActivity extends JPush {

    public SeatTable seatTableView;
    @BindView(R.id.movie_select_tv_back)
    TextView movieSelectTvBack;
    @BindView(R.id.movie_select_tv_cinema)
    TextView movieSelectTvCinema;
    @BindView(R.id.movie_select_iv_share)
    ImageView movieSelectIvShare;
    @BindView(R.id.seat_tv_name)
    TextView seatTvName;
    @BindView(R.id.seat_tv)
    TextView seatTv;

    long sum = 0;
    @BindView(R.id.seat_sell_prg)
    TextView seatSellPrg;
    @BindView(R.id.seat_no_sell)
    TextView seatNoSell;
    @BindView(R.id.tvWeiZhi)
    TextView tvWeiZhi;

    public static List<Map<String, Integer>> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.movie_select_seat_activity);
        ButterKnife.bind(this);


        Intent intent = getIntent();

        Bundle extras = intent.getExtras();
        final String th = (String) extras.get("Th");
        final String tm = (String) extras.get("Tm");
        final String nm = (String) extras.get("Nm");
        final String lg = (String) extras.get("long");
        final String dt = (String) extras.get("dt");
        final String tp = (String) extras.get("Tp");
        final String cinaName = (String) extras.get("cinaName");

        movieSelectTvCinema.setText(cinaName);

        tvWeiZhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sum == 0) {
                    Toast.makeText(MovieSelectSeatActivity.this, "请先选座", Toast.LENGTH_SHORT).show();
                } else {
                    String[] strings = new String[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        Map<String, Integer> integerMap = list.get(i);
                        Integer row = integerMap.get("row");
                        Integer column = integerMap.get("column");
                        strings[i] = row+"排"+column+"座";
                    }
                    Intent intent = new Intent(MovieSelectSeatActivity.this, MoveBuyActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("Th", th);
                    extras.putString("Tm", tm);
                    extras.putString("Nm", nm);
                    extras.putString("long", lg);
                    extras.putString("Sum", sum + "");
                    extras.putString("dt", dt);
                    extras.putString("Tp", tp);
                    extras.putString("cinaName", cinaName);
                    extras.putStringArray("row",strings);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
            }
        });


        movieSelectTvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final float sellPrg = Float.parseFloat((String) extras.get("SellPr"));

        seatTvName.setText(nm);
        seatTv.setText("今天11月四日" + " " + tm + " " + lg);


        seatTableView = (SeatTable) findViewById(R.id.seatView);
        seatTableView.setScreenName(th);//设置屏幕名称
        seatTableView.setMaxSelected(3);//设置最多选中


        seatTableView.setSeatChecker(new SeatTable.SeatChecker() {

            @Override
            public boolean isValidSeat(int row, int column) {
                if (column == 2) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean isSold(int row, int column) {
                if (row == 6 && column == 6) {
                    return true;
                }
                return false;
            }

            @Override
            public void checked(int row, int column) {
                Log.e("test", "checked: " + row);
                HashMap<String, Integer> map = new HashMap<>();
                map.put("row", row);
                map.put("column", column);
                list.add(map);
                sum += sellPrg;
                seatNoSell.setVisibility(View.GONE);
                seatSellPrg.setVisibility(View.VISIBLE);
                seatSellPrg.setText("￥" + sum);
                tvWeiZhi.setText("立即购买");
            }

            @Override
            public void unCheck(int row, int column) {
                Log.e("test", "unchecked: " + row);
                for (int i = 0; i < list.size(); i++) {
                    Map<String, Integer> integerMap = list.get(i);
                    if (integerMap.get("row") == row && integerMap.get("column") == column) {
                        list.remove(i);
                    }
                }
                sum -= sellPrg;
                if (sum != 0) {
                    seatSellPrg.setText("￥" + sum);
                    tvWeiZhi.setText("立即购买");
                } else {
                    seatSellPrg.setVisibility(View.GONE);
                    seatNoSell.setVisibility(View.VISIBLE);
                    tvWeiZhi.setText("请先选座");
                }
            }

            @Override
            public String[] checkedSeatTxt(int row, int column) {
                return null;
            }

        });
        seatTableView.setData(10, 15);


    }
}
