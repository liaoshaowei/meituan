package com.xugang.meituan;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RuleActivity extends JPush {

    private static final String TAG = "test";
    @BindView(R.id.tvBack)
    TextView tvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tvBack)
    public void onLlRuleClick(View v) {
        finish();
    }
}
