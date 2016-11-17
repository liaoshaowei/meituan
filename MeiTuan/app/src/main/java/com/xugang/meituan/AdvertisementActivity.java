package com.xugang.meituan;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import com.xugang.meituan.util.CircularAnim;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AdvertisementActivity extends JPush {

    @BindView(R.id.tvSkip)
    TextView tvSkip;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertisement);
        ButterKnife.bind(this);

        //三秒钟倒计时
        countDownTimer = new CountDownTimer(3800, 1200) {
            @Override
            public void onTick(long millisUntilFinished) {
                //Message_btn.setBackgroundResource(R.drawable.button_shape02);
                tvSkip.setText(millisUntilFinished / 1100 + "\t跳过");
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(AdvertisementActivity.this, MainActivity.class));
                exit();
            }
        };
        countDownTimer.start();
    }

    private void exit() {
        super.onBackPressed();
    }

    @OnClick(R.id.tvSkip)
    public void onTvSkipClick(View v) {
        CircularAnim.fullActivity(this, v)
//                .colorOrImageRes(R.mipmap.img_huoer_black)
                .duration(800)
                .go(new CircularAnim.OnAnimationEndListener() {
                    @Override
                    public void onAnimationEnd() {
                        startActivity(new Intent(AdvertisementActivity.this, MainActivity.class));
                        countDownTimer.cancel();
                        exit();
                    }
                });
    }
}
