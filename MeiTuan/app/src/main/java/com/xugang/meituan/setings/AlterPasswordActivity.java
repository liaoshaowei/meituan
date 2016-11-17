package com.xugang.meituan.setings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.xugang.meituan.R;
import com.xugang.meituan.SettingActivity;
import com.xugang.meituan.util.BmobSMSuti;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.BmobSMS;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.VerifySMSCodeListener;

public class AlterPasswordActivity extends AppCompatActivity {

    @BindView(R.id.tvBack)
    TextView tvBack;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.etVerificationCode)
    EditText etVerificationCode;
    @BindView(R.id.btnGetVerificationCode)
    Button btnGetVerificationCode;
    @BindView(R.id.btnAlter)
    Button btnAlter;
    private String mobilePhoneNumber;
    private BmobUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alter);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnAlter)
    public void onBtnAlterClick() {
        final String password = etPassword.getText().toString();
        String verifCode = etVerificationCode.getText().toString();
        if (password.length() < 6) {
            Toast.makeText(AlterPasswordActivity.this, "密码长度至少6位", Toast.LENGTH_SHORT).show();
        } else if (verifCode.trim().length() == 0) {
            Toast.makeText(AlterPasswordActivity.this, "验证码不能为空", Toast.LENGTH_SHORT).show();
        } else {
            BmobSMS.verifySmsCode(this, mobilePhoneNumber, verifCode, new VerifySMSCodeListener() {
                @Override
                public void done(BmobException e) {
                    currentUser.setPassword(password);
                    currentUser.update(AlterPasswordActivity.this);
                    startActivity(new Intent(AlterPasswordActivity.this, SettingActivity.class));
                    finish();
                }
            });
        }
    }

    @OnClick(R.id.btnGetVerificationCode)
    public void onBtnGetVerificationCodeClick() {
        currentUser = BmobUser.getCurrentUser(this);
        mobilePhoneNumber = currentUser.getMobilePhoneNumber();
        BmobSMSuti.sendSMS(this, mobilePhoneNumber, btnGetVerificationCode);
    }
}
