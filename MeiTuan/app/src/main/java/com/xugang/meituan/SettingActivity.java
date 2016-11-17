package com.xugang.meituan;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.widget.Button;
import android.widget.TextView;

import com.xugang.meituan.setings.AlterPasswordActivity;
import com.xugang.meituan.setings.AlterUserNameActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.newim.BmobIM;
import cn.bmob.v3.BmobUser;

public class SettingActivity extends JPush {

    private static final String TAG = "test";
    @BindView(R.id.tvBack)
    TextView tvBack;
    @BindView(R.id.tvUserName)
    TextView tvUserName;
    @BindView(R.id.btnExit)
    Button btnExit;
    @BindView(R.id.tvPhoneNumber)
    TextView tvPhoneNumber;
    @BindView(R.id.tvAlterPassword)
    TextView tvAlterPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
        BmobUser user = BmobUser.getCurrentUser(this);
        tvUserName.setText(user.getUsername());
        tvPhoneNumber.setText(user.getMobilePhoneNumber());
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = true)
    public void dealLoadEvent(Boolean isLoad) {
        if (isLoad) {
            BmobUser user = BmobUser.getCurrentUser(this);
            tvUserName.setText(user.getUsername());
            tvPhoneNumber.setText(user.getMobilePhoneNumber());
        }
    }

    @OnClick(R.id.tvUserName)
    public void onTvUserNameClick() {
        Intent intent = new Intent(this, AlterUserNameActivity.class);
        intent.putExtra("username", tvUserName.getText().toString());
        startActivity(intent);
    }

    @OnClick(R.id.tvAlterPassword)
    public void onTvAlterPasswordClick() {
        Intent intent = new Intent(this, AlterPasswordActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnExit)
    public void onBtnExitClick() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("是否退出")
                .setMessage("亲,你确定要离开我吗?")
                .setPositiveButton("是的,我要离开了", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        BmobIM.getInstance().disConnect();
                        BmobUser.logOut(SettingActivity.this);
                        EventBus.getDefault().postSticky(false);
                        exit();
                    }
                })
                .setNegativeButton("no,我还舍不得离开", null)
                .create()
                .show();


    }

    private void exit() {
        super.onBackPressed();
    }

    @OnClick(R.id.tvBack)
    public void onTvBackClick() {
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
