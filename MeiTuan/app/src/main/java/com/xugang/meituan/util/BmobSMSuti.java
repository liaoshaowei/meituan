package com.xugang.meituan.util;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.Toast;

import cn.bmob.v3.BmobSMS;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.RequestSMSCodeListener;

/**
 * Created by ASUS on 2016-11-04.
 */
public class BmobSMSuti {
    public static void sendSMS(final Context context, String verifCode, final Button button) {
        BmobSMS.requestSMSCode(context, verifCode, "验证码", new RequestSMSCodeListener() {
            @Override
            public void done(Integer integer, BmobException e) {
                if (e == null) {
                    button.setClickable(false);
                    Toast.makeText(context, "验证码发送成功，请尽快使用", Toast.LENGTH_SHORT).show();

                    //一分钟倒计时
                    new CountDownTimer(60000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            //Message_btn.setBackgroundResource(R.drawable.button_shape02);
                            button.setText(millisUntilFinished / 1000 + "秒后重试");
                        }

                        @Override
                        public void onFinish() {
                            button.setClickable(true);
                            //Message_btn.setBackgroundResource(R.drawable.button_shape);
                            button.setText("重新发送");
                        }
                    }.start();
                } else {
                    Toast.makeText(context, "验证码发送失败，请检查网络连接" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
