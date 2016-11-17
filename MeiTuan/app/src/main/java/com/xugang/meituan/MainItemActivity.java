package com.xugang.meituan;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xugang.meituan.model.HuoGuo;
import com.xugang.meituan.model.PingLun;
import com.xugang.meituan.model.TuiJian;
import com.xugang.meituan.util.Config;
import com.xugang.meituan.util.HttpUtil;
import com.xugang.meituan.util.JsonUtil;
import com.xugang.meituan.util.ShareSDKUtil;
import com.xugang.meituan.util.ThreadUtil;
import com.xugang.meituan.weight.MyFlowLayoutII;
import com.xugang.meituan.weight.MyRatingBar;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.BmobUser;

public class MainItemActivity extends JPush {
    private static final String TAG = "test";
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvInfo)
    TextView tvInfo;
    @BindView(R.id.tvPriceII)
    TextView tvPriceII;
    @BindView(R.id.tvLogo)
    TextView tvLogo;
    @BindView(R.id.tvJian)
    TextView tvJian;
    @BindView(R.id.tvYiShou)
    TextView tvYiShou;
    @BindView(R.id.mrbRating)
    MyRatingBar mrbRating;
    @BindView(R.id.tvFeng)
    TextView tvFeng;
    @BindView(R.id.tvPingJia)
    TextView tvPingJia;
    @BindView(R.id.tvNameII)
    TextView tvNameII;
    @BindView(R.id.tvinfoII)
    TextView tvinfoII;
    @BindView(R.id.tvTuiJIanCai)
    TextView tvTuiJIanCai;
    @BindView(R.id.tvFanWeiI)
    TextView tvFanWeiI;
    @BindView(R.id.tvFanWeiII)
    TextView tvFanWeiII;
    @BindView(R.id.tvYouXiaoQI)
    TextView tvYouXiaoQI;
    @BindView(R.id.tvYouXiaoQII)
    TextView tvYouXiaoQII;
    @BindView(R.id.tvBuKeYongI)
    TextView tvBuKeYongI;
    @BindView(R.id.tvBuKeYongII)
    TextView tvBuKeYongII;
    @BindView(R.id.tvTimeI)
    TextView tvTimeI;
    @BindView(R.id.tvTimeII)
    TextView tvTimeII;
    @BindView(R.id.tvGuiZeI)
    TextView tvGuiZeI;
    @BindView(R.id.tvGuiZeII)
    TextView tvGuiZeII;
    @BindView(R.id.llRoot)
    LinearLayout llRoot;
    @BindView(R.id.llRule)
    LinearLayout llRule;
    @BindView(R.id.tvCall)
    TextView tvCall;
    @BindView(R.id.tvShare)
    TextView tvShare;
    @BindView(R.id.iv)
    ImageView iv;
    @BindView(R.id.nsv)
    NestedScrollView nsv;
    @BindView(R.id.mfl)
    MyFlowLayoutII mfl;
    private String title;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            int what = msg.what;
            if (what == Config.MSG_MAIN_HUOGUO_GOT) {
                setDataI(msg);
            } else if (what == Config.MSG_MAIN_PINGLUN_GOT) {
                setDataII(msg);
            } else if ((what == Config.MSG_MAIN_TUIJIAN_GOT)) {
                setdataIII(msg);
            }
        }
    };
    private String mname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainitem);
        ButterKnife.bind(this);
        initDataI();
        initDataII();
        initdataIII();
    }

    @OnClick(R.id.tvShare)
    public void onTvShareClick() {
        BmobUser user = BmobUser.getCurrentUser(this);
        if (user != null) {
            ShareSDKUtil.showShare(this, mname, title);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("分享")
                    .setMessage("亲,需要先登录才能分享的哦.请问需要登录吗?")
                    .setPositiveButton("好的", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(MainItemActivity.this, LoginActivity.class));
                        }
                    })
                    .setNegativeButton("算了", null)
                    .create()
                    .show();
        }
    }

    @OnClick(R.id.llRoot)
    public void onLlRootClick(View v) {
        Intent intent = new Intent(this, PictureActivity.class);
        intent.putExtra("title", title);
        startActivity(intent);
    }

    @OnClick(R.id.llRule)
    public void onLlRuleClick(View v) {
        Intent intent = new Intent(this, RuleActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.tvCall)
    public void onTvCallClick(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:15283665928"));
        startActivity(intent);
    }

    @OnClick(R.id.tvTuiJIanCai)
    public void onTvTuiJIanCaiClick(View v) {
        Intent intent = new Intent(this, TuiJianCaiActivity.class);
        startActivity(intent);
    }

    private void initdataIII() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtil.getTuiJian(MainItemActivity.this);
                Message msg = handler.obtainMessage();
                msg.what = Config.MSG_MAIN_TUIJIAN_GOT;
                msg.obj = json;
                handler.sendMessage(msg);
            }
        });
    }

    private void initDataII() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtil.getPingLun(MainItemActivity.this);
                Message msg = handler.obtainMessage();
                msg.what = Config.MSG_MAIN_PINGLUN_GOT;
                msg.obj = json;
                handler.sendMessage(msg);
            }
        });
    }

    private void initDataI() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtil.getHuoGuo(MainItemActivity.this);
                Message msg = handler.obtainMessage();
                msg.what = Config.MSG_MAIN_HUOGUO_GOT;
                msg.obj = json;
                handler.sendMessage(msg);
            }
        });
    }

    private void setData(HuoGuo.DataBean data) {

        try {
            mname = data.getMname();
            if (mname != null) tvName.setText(mname);
            title = data.getTitle();
            if (title != null) tvInfo.setText(title);

            int value = data.getValue();
            if (value != 0) tvPriceII.setText("门市价: ￥" + value);

            List<HuoGuo.DataBean.CampaignsBean> campaigns = data.getCampaigns();
            if (campaigns.size() != 0) {
                tvLogo.setText(campaigns.get(0).getLogo());
                tvJian.setText(campaigns.get(0).getLongtitle());
            }

            tvYiShou.setText("已售" + data.getSolds());
            String rating = data.getNewrating().getRating();
            tvFeng.setText(rating + "分");
            Float aFloat = Float.valueOf(rating);
            mrbRating.setProportion(aFloat);
            tvPingJia.setText(data.getRateCount() + "人评价");
            tvNameII.setText(data.getRdploc().get(0).getName());
            tvinfoII.setText(data.getRdploc().get(0).getAddr());
            List<HuoGuo.DataBean.TermsBean> terms = data.getTerms();
            tvFanWeiI.setText(terms.get(0).getTitle());
            tvFanWeiII.setText(terms.get(0).getContent().get(0));
            tvYouXiaoQI.setText(terms.get(1).getTitle());
            tvYouXiaoQII.setText(terms.get(1).getContent().get(0));
            tvBuKeYongI.setText(terms.get(2).getTitle());
            tvBuKeYongII.setText(terms.get(2).getContent().get(0));
            tvTimeI.setText(terms.get(3).getTitle());
            tvTimeII.setText(terms.get(3).getContent().get(0));
            tvGuiZeI.setText(terms.get(4).getTitle());
            List<String> content = terms.get(4).getContent();
            for (int i = 0; i < content.size(); i++) {
                tvGuiZeII.append("·\t" + content.get(i) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setDataI(Message msg) {
        String json = (String) msg.obj;
        HuoGuo huoGuo = JsonUtil.parseHuoGuo(json);
        if (huoGuo != null) {
            HuoGuo.DataBean dataBean = huoGuo.getData().get(0);
            setData(dataBean);
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    private void setDataII(Message msg) {
        String json = (String) msg.obj;
        PingLun pingLun = JsonUtil.parsePingLun(json);
        if (pingLun != null) {
            List<PingLun.DataBean> data = pingLun.getData();
            for (int i = 0; i < data.size(); i++) {
                PingLun.DataBean dataBean = data.get(i);
                TextView textView = new TextView(this);
                textView.setTextSize(10f);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.setMargins(12, 12, 12, 12);
                textView.setLayoutParams(params);
                textView.setPadding(12, 12, 12, 12);
                if (i <= 6) {
                    textView.setTextAppearance(R.style.NomarlTags);
                    textView.setBackgroundResource(R.drawable.pingjia_rectengle);
                } else {
                    textView.setTextAppearance(R.style.NomarlTags_Special);
                    textView.setBackgroundResource(R.drawable.pingjiaii_rectengle);
                }
                textView.setText(dataBean.getLabel() + "\t" + dataBean.getCount());
                mfl.addView(textView);

            }
        }
    }

    private void setdataIII(Message msg) {
        String json = (String) msg.obj;
        TuiJian tuiJian = JsonUtil.parseTuiJian(json);
        List<TuiJian.DataBean> data = tuiJian.getData();
        if (data!=null){

            for (int i = 0; i < data.size(); i++) {
                tvTuiJIanCai.append(data.get(i).getName() + "\t");
            }
        }
    }
}

