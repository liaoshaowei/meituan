package com.xugang.meituan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xugang.meituan.util.ThreadUtil;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.listener.SaveListener;

public class LoginActivity extends JPush {

    private static final String TAG = "test";
    @BindView(R.id.ivIcon)
    ImageView ivIcon;
    @BindView(R.id.etUsername)
    EditText etUsername;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.tvRegister)
    TextView tvRegister;
    @BindView(R.id.ivLoading)
    ImageView ivLoading;
    @BindView(R.id.tlRoot)
    RelativeLayout tlRoot;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.tvRegister)
    public void onTvRegisterClick() {
        startActivity(new Intent(this, RegisterActivity.class));
    }

    @OnClick(R.id.btnLogin)
    public void onBtnLoginClick() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        if (username.trim().length() > 0 && password.trim().length() > 0) {

            tlRoot.setAlpha(0.3f);
            ThreadUtil.execute(new Runnable() {
                @Override
                public void run() {
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            ivLoading.setVisibility(View.VISIBLE);
                            animation = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.loading);
                            ivLoading.startAnimation(animation);
                        }
                    });
                }
            });
            BmobUser user = new BmobUser();
            user.setUsername(username);
            user.setPassword(password);
            user.login(this, new SaveListener() {
                @Override
                public void onSuccess() {
                    EventBus.getDefault().postSticky(true);
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                }

                @Override
                public void onFailure(int i, String s) {
                    ivLoading.setVisibility(View.GONE);
                    animation.cancel();
                    tlRoot.setAlpha(1f);
                    Toast.makeText(LoginActivity.this, "登录失败" + "---" + s, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
