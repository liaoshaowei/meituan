package com.xugang.meituan;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.xugang.meituan.adapter.RecommendAdapter;
import com.xugang.meituan.model.TuiJian;
import com.xugang.meituan.util.Config;
import com.xugang.meituan.util.HttpUtil;
import com.xugang.meituan.util.JsonUtil;
import com.xugang.meituan.util.ThreadUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TuiJianCaiActivity extends JPush {

    private static final String TAG = "test";
    @BindView(R.id.tvBack)
    TextView tvBack;
    @BindView(R.id.lvRecommend)
    ListView lvRecommend;
    List<TuiJian.DataBean> data = new ArrayList<>();
    private RecommendAdapter recommendAdapter;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == Config.MSG_MAIN_RECOMMEND_GOT) setdata(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tui_jian_cai);
        ButterKnife.bind(this);

        initdata();
    }

    @OnClick(R.id.tvBack)
    public void onLlRuleClick(View v) {
        finish();
    }

    private void initdata() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {

                String json = HttpUtil.getTuiJian(TuiJianCaiActivity.this);
                Message msg = handler.obtainMessage();
                msg.what = Config.MSG_MAIN_RECOMMEND_GOT;
                msg.obj = json;
                handler.sendMessage(msg);
            }
        });
    }

    private void setdata(Message msg) {
        String json = (String) msg.obj;
        TuiJian tuiJian = JsonUtil.parseTuiJian(json);
        data = tuiJian.getData();
        recommendAdapter = new RecommendAdapter(this, data);
        lvRecommend.setAdapter(recommendAdapter);
    }
}
