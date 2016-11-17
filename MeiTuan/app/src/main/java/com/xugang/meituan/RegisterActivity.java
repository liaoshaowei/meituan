package com.xugang.meituan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xugang.meituan.util.BmobSMSuti;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.BmobSMS;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.VerifySMSCodeListener;

public class RegisterActivity extends JPush {

    @BindView(R.id.v_top)
    View vTop;
    @BindView(R.id.tv_left)
    ImageView tvLeft;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_right)
    TextView tvRight;
    @BindView(R.id.etUsername)
    EditText etUsername;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.etPasswordAgain)
    EditText etPasswordAgain;
    @BindView(R.id.etPhoneNumber)
    EditText etPhoneNumber;
    @BindView(R.id.btnGet)
    Button btnGet;
    @BindView(R.id.etMsg)
    EditText etMsg;
    @BindView(R.id.btnRegister)
    Button btnRegister;
    private String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnRegister)
    public void onBtnRegister() {
        final String username = etUsername.getText().toString();
        final String password = etPassword.getText().toString();
        String passwordAgain = etPasswordAgain.getText().toString();
        String msg = etMsg.getText().toString();

        if (username.trim().length() == 0 || password.trim().length() == 0) {
            Toast.makeText(RegisterActivity.this, "用户名或者密码不能为空", Toast.LENGTH_SHORT).show();
        } else if (password.trim().length() < 6) {
            Toast.makeText(RegisterActivity.this, "密码长度不能低于6", Toast.LENGTH_SHORT).show();
        } else if (!password.equals(passwordAgain)) {
            Toast.makeText(RegisterActivity.this, "两次输入的密码不同,请重新输入", Toast.LENGTH_SHORT).show();
        } else if (username.trim().length() < 2) {
            Toast.makeText(RegisterActivity.this, "用户名长度不能低于2", Toast.LENGTH_SHORT).show();
        } else if (msg.trim().length() == 0) {
            Toast.makeText(RegisterActivity.this, "验证码不能为空", Toast.LENGTH_SHORT).show();
        } else {
            BmobSMS.verifySmsCode(this, number, msg, new VerifySMSCodeListener() {
                @Override
                public void done(BmobException e) {
                    if (e == null) {
                        Toast.makeText(RegisterActivity.this, "注册成功!", Toast.LENGTH_SHORT).show();
                        final BmobUser user = new BmobUser();
                        user.setUsername(username);
                        user.setPassword(password);
                        user.setMobilePhoneNumber(number);
                        user.setMobilePhoneNumberVerified(true);
                        user.signUp(RegisterActivity.this, new SaveListener() {
                            @Override
                            public void onSuccess() {
                                user.login(RegisterActivity.this, new SaveListener() {
                                    @Override
                                    public void onSuccess() {
                                        EventBus.getDefault().postSticky(true);
                                        startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                                        finish();
                                    }

                                    @Override
                                    public void onFailure(int i, String s) {
                                        Toast.makeText(RegisterActivity.this, "登录失败---" + s, Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }

                            @Override
                            public void onFailure(int i, String s) {
                                Toast.makeText(RegisterActivity.this, "注册失败,请稍后再试!---" + s, Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }
            });
        }

    }

    @OnClick(R.id.btnGet)
    public void onBtnGetClick() {
        number = etPhoneNumber.getText().toString();
        if (number.length() == 0) {
            Toast.makeText(RegisterActivity.this, "手机号不能为空", Toast.LENGTH_SHORT).show();
            return;
        } else if (number.length() != 11) {
            Toast.makeText(RegisterActivity.this, "请输入11位有效号码", Toast.LENGTH_SHORT).show();
            return;
        }
        BmobSMSuti.sendSMS(RegisterActivity.this, number, btnGet);
    }
}
