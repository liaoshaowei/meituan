package com.xugang.meituan;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xugang.meituan.util.CircularAnim;
import com.xugang.meituan.weight.MySwitchButton;

import java.util.HashSet;
import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import cn.jpush.android.api.JPushInterface;

public class SetActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {


    private static final String TAG = "test";
    @BindView(R.id.tvMenu)
    TextView tvMenu;
    @BindView(R.id.tvBack)
    TextView tvBack;
    @BindView(R.id.msb)
    MySwitchButton msb;
    @BindView(R.id.cbOne)
    CheckBox cbOne;
    @BindView(R.id.cbTwo)
    CheckBox cbTwo;
    @BindView(R.id.cbThree)
    CheckBox cbThree;
    @BindView(R.id.cbFour)
    CheckBox cbFour;
    @BindView(R.id.cbFive)
    CheckBox cbFive;
    @BindView(R.id.cbSix)
    CheckBox cbSix;
    @BindView(R.id.cbSeven)
    CheckBox cbSeven;
    @BindView(R.id.llRoot)
    LinearLayout llRoot;
    @BindView(R.id.ivI)
    ImageView ivI;
    private Set<Integer> weeks = new HashSet<>();
    SharedPreferences sp;
    private SharedPreferences.Editor editer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        ButterKnife.bind(this);

        sp = getSharedPreferences("setting", MODE_PRIVATE);
        editer = sp.edit();
        initWeeks();

        getSp();

        for (Integer week : weeks) {
            Log.e(TAG, "onCreate: " + week);
        }

        msb.setOnCheckedChangeListener(this);
        if (JPushInterface.isPushStopped(getApplicationContext())) {
            msb.setChecked(false);
        } else {
            msb.setChecked(true);
            llRoot.setVisibility(View.VISIBLE);
        }
    }

    private void getSp() {
        boolean one = sp.getBoolean("1", true);
        if (one) {
            weeks.add(1);
        } else {
            weeks.remove(1);
            cbOne.setChecked(false);
        }
        boolean two = sp.getBoolean("2", true);
        if (two) {
            weeks.add(2);
        } else {
            weeks.remove(2);
            cbTwo.setChecked(false);
        }
        boolean three = sp.getBoolean("3", true);
        if (three) {
            weeks.add(3);
        } else {
            weeks.remove(3);
            cbThree.setChecked(false);
        }
        boolean four = sp.getBoolean("4", true);
        if (four) {
            weeks.add(4);
        } else {
            weeks.remove(4);
            cbFour.setChecked(false);
        }
        boolean five = sp.getBoolean("5", true);
        if (five) {
            weeks.add(5);
        } else {
            weeks.remove(5);
            cbFive.setChecked(false);
        }
        boolean six = sp.getBoolean("6", true);
        if (six) {
            weeks.add(6);
        } else {
            weeks.remove(6);
            cbSix.setChecked(false);
        }
        boolean seven = sp.getBoolean("0", true);
        if (seven) {
            weeks.add(0);
        } else {
            weeks.remove(0);
            cbSeven.setChecked(false);
        }
    }

    private void initWeeks() {
        weeks.add(1);
        weeks.add(2);
        weeks.add(3);
        weeks.add(4);
        weeks.add(5);
        weeks.add(6);
        weeks.add(0);
    }

    @OnCheckedChanged(R.id.cbOne)
    public void onCbOneCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        editer.putBoolean("1", isChecked);
        editer.commit();
        if (isChecked) {
            weeks.add(1);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        } else {
            weeks.remove(1);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        }
    }

    @OnCheckedChanged(R.id.cbTwo)
    public void onCbTwoCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        editer.putBoolean("2", isChecked);
        editer.commit();
        if (isChecked) {
            weeks.add(2);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        } else {
            weeks.remove(2);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        }
    }

    @OnCheckedChanged(R.id.cbThree)
    public void onCbThreeCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        editer.putBoolean("3", isChecked);
        editer.commit();
        if (isChecked) {
            weeks.add(3);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        } else {
            weeks.remove(3);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        }
    }

    @OnCheckedChanged(R.id.cbFour)
    public void onCbFourCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        editer.putBoolean("4", isChecked);
        editer.commit();
        if (isChecked) {
            weeks.add(4);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        } else {
            weeks.remove(4);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        }
    }

    @OnCheckedChanged(R.id.cbFive)
    public void onCbFiveCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        editer.putBoolean("5", isChecked);
        editer.commit();
        if (isChecked) {
            weeks.add(5);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        } else {
            weeks.remove(5);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        }
    }

    @OnCheckedChanged(R.id.cbSix)
    public void onCbSixCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        editer.putBoolean("6", isChecked);
        editer.commit();
        if (isChecked) {
            weeks.add(6);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        } else {
            weeks.remove(6);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        }
    }

    @OnCheckedChanged(R.id.cbSeven)
    public void onCbSevenCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        editer.putBoolean("0", isChecked);
        editer.commit();
        if (isChecked) {
            weeks.add(0);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        } else {
            weeks.remove(0);
            JPushInterface.setPushTime(getApplicationContext(), weeks, 8, 20);
        }
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        buttonView.animate().rotationBy(0);
        if (isChecked) {
            JPushInterface.resumePush(getApplicationContext());
            CircularAnim.show(llRoot).triggerView(msb).go();
//            llRoot.setVisibility(View.VISIBLE);
        } else {
            JPushInterface.stopPush(getApplicationContext());
            CircularAnim.hide(llRoot).triggerView(msb).go();

//            llRoot.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        JPushInterface.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        JPushInterface.onPause(this);
    }

    @OnClick(R.id.tvBack)
    public void onClick(View v) {
        super.onBackPressed();
    }
}
