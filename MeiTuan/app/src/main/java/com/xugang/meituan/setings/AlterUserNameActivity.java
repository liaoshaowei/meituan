package com.xugang.meituan.setings;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.xugang.meituan.R;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.BmobUser;

public class AlterUserNameActivity extends AppCompatActivity {

    @BindView(R.id.tvBack)
    TextView tvBack;
    @BindView(R.id.etUsername)
    EditText etUsername;
    @BindView(R.id.btnAlter)
    Button btnAlter;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alter_user_name);
        ButterKnife.bind(this);
        String username = getIntent().getStringExtra("username");
        etUsername.setText(username);
    }

    @OnClick(R.id.btnAlter)
    public void onBtnAlterClick() {
        String username = etUsername.getText().toString();
        if (username.trim().length() >= 2) {
            BmobUser user = BmobUser.getCurrentUser(this);
            user.setUsername(username);
            user.update(this);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(AlterUserNameActivity.this, "修改成功", Toast.LENGTH_SHORT).show();
                    EventBus.getDefault().postSticky(true);
                    finish();
                }
            }, 1000);

        }
    }

    @OnClick(R.id.tvBack)
    public void onTvBackClick() {
        super.onBackPressed();
    }
}
