package com.xugang.meituan.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.xugang.meituan.R;
import com.xugang.meituan.SearchActivity;
import com.xugang.meituan.adapter.MainFragmentAdapter;
import com.xugang.meituan.adapter.MainLikesAdapter;
import com.xugang.meituan.adapter.MlAdapter;
import com.xugang.meituan.model.MainI;
import com.xugang.meituan.model.MainII;
import com.xugang.meituan.model.MainLikes;
import com.xugang.meituan.util.Config;
import com.xugang.meituan.util.HttpUtil;
import com.xugang.meituan.util.JsonUtil;
import com.xugang.meituan.util.ThreadUtil;
import com.xugang.meituan.weight.MyListView;
import com.xugang.meituan.weight.PullToRefreshView;
import com.xugang.meituan.weight.mylayout.BlockPattern;
import com.xugang.meituan.weight.mylayout.MosaicLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnPageChange;

/**
 * Created by ASUS on 2016-10-31.
 */
public class FirstPageFragment extends Fragment {
    @BindView(R.id.tvLocation)
    TextView tvLocation;
    @BindView(R.id.tvSearch)
    TextView tvSearch;
    @BindView(R.id.Qrcode)
    TextView Qrcode;
    @BindView(R.id.tvLoad)
    TextView tvLoad;
    @BindView(R.id.vpMain)
    ViewPager vpMain;
    @BindView(R.id.rg)
    RadioGroup rg;
    @BindView(R.id.mlvMain)
    MyListView mlvMain;
    @BindView(R.id.tvTitleLeft)
    TextView tvTitleLeft;
    @BindView(R.id.tvTeQuanIeft)
    TextView tvTeQuanIeft;
    @BindView(R.id.tvGongLueLeft)
    TextView tvGongLueLeft;
    @BindView(R.id.ivLeft)
    ImageView ivLeft;
    @BindView(R.id.tvTitleRight)
    TextView tvTitleRight;
    @BindView(R.id.tvTeQuanjRight)
    TextView tvTeQuanjRight;
    @BindView(R.id.tvGongLueRight)
    TextView tvGongLueRight;
    @BindView(R.id.ivRight)
    ImageView ivRight;
    @BindView(R.id.ml)
    MosaicLayout ml;
    @BindView(R.id.ptrv)
    PullToRefreshView ptrv;
    @BindView(R.id.rlRoot)
    RelativeLayout rlRoot;
    private View view;

    private LeftFragment leftFragment;
    private List<Fragment> fragments = new ArrayList<>();
    private MainFragmentAdapter mainFragmentAdapter;
    private RightFragment rightFragment;
    private List<MainLikes.DataBean> data = new ArrayList<>();
    private MainLikesAdapter mainLikesAdapter;
    private List<MainII.DataBean.ResourceBean> resource = new ArrayList<>();

    BlockPattern.BLOCK_PATTERN pattern1[] = {
            BlockPattern.BLOCK_PATTERN.BIG, BlockPattern.BLOCK_PATTERN.BIG, BlockPattern.BLOCK_PATTERN.SMALL, BlockPattern.BLOCK_PATTERN.SMALL,
            BlockPattern.BLOCK_PATTERN.BIG, BlockPattern.BLOCK_PATTERN.BIG, BlockPattern.BLOCK_PATTERN.SMALL, BlockPattern.BLOCK_PATTERN.SMALL
    };
    BlockPattern.BLOCK_PATTERN pattern2[] = {
            BlockPattern.BLOCK_PATTERN.VERTICAL, BlockPattern.BLOCK_PATTERN.SMALL, BlockPattern.BLOCK_PATTERN.SMALL, BlockPattern.BLOCK_PATTERN.SMALL,
            BlockPattern.BLOCK_PATTERN.VERTICAL, BlockPattern.BLOCK_PATTERN.HORIZONTAL, BlockPattern.BLOCK_PATTERN.HORIZONTAL, BlockPattern.BLOCK_PATTERN.SMALL
    };
    BlockPattern.BLOCK_PATTERN pattern3[] = {
            BlockPattern.BLOCK_PATTERN.SMALL, BlockPattern.BLOCK_PATTERN.SMALL, BlockPattern.BLOCK_PATTERN.SMALL, BlockPattern.BLOCK_PATTERN.SMALL,
            BlockPattern.BLOCK_PATTERN.SMALL, BlockPattern.BLOCK_PATTERN.SMALL, BlockPattern.BLOCK_PATTERN.SMALL, BlockPattern.BLOCK_PATTERN.SMALL
    };

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == Config.MSG_MAIN_DATAIII_GOT) {
                setData(msg, Config.MSG_MAIN_DATAIII_GOT);
            } else if (msg.what == Config.MSG_MAIN_DATAI_GOT) {
                setData(msg, Config.MSG_MAIN_DATAI_GOT);
            } else if (msg.what == Config.MSG_MAIN_DATAII_GOT) {
                setData(msg, Config.MSG_MAIN_DATAII_GOT);
            }
        }
    };
    private MlAdapter mlAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.first_page, container, false);
            ButterKnife.bind(this, view);
        }
        initVP();
        initDataI();
        initDataII();
        initDataIII();
        initAdapter();
        mlvMain.setFocusable(false);

        ptrv.setOnHeaderRefreshListener(new PullToRefreshView.OnHeaderRefreshListener() {
            @Override
            public void onHeaderRefresh(PullToRefreshView view) {
                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ptrv.onHeaderRefreshComplete();
                    }
                }, 2000);
            }
        });
        return view;
    }


    @OnClick(R.id.rlRoot)
    public void onRlRootClick() {
        startActivity(new Intent(getActivity(), SearchActivity.class));
    }

    private void initDataII() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtil.getMainII(getActivity());
                Message msg = handler.obtainMessage();
                msg.what = Config.MSG_MAIN_DATAII_GOT;
                msg.obj = json;
                handler.sendMessage(msg);
            }
        });

    }

    private void initDataI() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtil.getMainI(getActivity());
                Message msg = handler.obtainMessage();
                msg.what = Config.MSG_MAIN_DATAI_GOT;
                msg.obj = json;
                handler.sendMessage(msg);
            }
        });
    }

    private void initAdapter() {
        mainLikesAdapter = new MainLikesAdapter(getActivity(), data);
        mlvMain.setAdapter(mainLikesAdapter);
    }

    private void initDataIII() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtil.getMainLikes(getActivity());
                Message msg = handler.obtainMessage();
                msg.what = Config.MSG_MAIN_DATAIII_GOT;
                msg.obj = json;
                handler.sendMessage(msg);
            }
        });
    }

    private void initVP() {
        leftFragment = new LeftFragment();
        rightFragment = new RightFragment();
        fragments.add(leftFragment);
        fragments.add(rightFragment);
        mainFragmentAdapter = new MainFragmentAdapter(getChildFragmentManager(), fragments);
        vpMain.setAdapter(mainFragmentAdapter);
    }

    @OnPageChange(R.id.vpMain)
    public void onPageSelected(int position) {
        int childCount = rg.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RadioButton button = (RadioButton) rg.getChildAt(i);
            if (i == position) {
                button.setChecked(true);
            } else {
                button.setChecked(false);
            }
        }
    }

    private void setData(Message msg, int position) {
        String json = (String) msg.obj;
        if (position == Config.MSG_MAIN_DATAIII_GOT) {
            MainLikes mainLikes = JsonUtil.parseMainLikes(json);
            if (mainLikes != null) {
                data.clear();
                data.addAll(mainLikes.getData());
                mainLikesAdapter.notifyDataSetChanged();
            } else {
                Toast.makeText(getActivity(), "网络连接异常!请检查网络", Toast.LENGTH_SHORT).show();
            }
        } else if (position == Config.MSG_MAIN_DATAI_GOT) {
            MainI mainI = JsonUtil.parseMainI(json);
            if (mainI != null) {
                MainI.DataBean.ResourceBean resourceLeft = mainI.getData().getResource().get(0);
                tvTitleLeft.setText(resourceLeft.getMaintitle());
                tvTeQuanIeft.setText(resourceLeft.getDeputytitle());
                tvGongLueLeft.setText(resourceLeft.getRewardtitle());
                Glide.with(getActivity())
                        .load(Uri.parse(resourceLeft.getImgurlreward()))
                        .skipMemoryCache(false)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(ivLeft);

                MainI.DataBean.ResourceBean resourceRight = mainI.getData().getResource().get(1);
                tvTitleRight.setText(resourceRight.getMaintitle());
                tvTeQuanjRight.setText(resourceRight.getDeputytitle());
                tvGongLueRight.setText(resourceRight.getRewardtitle());
                Glide.with(getActivity())
                        .load(Uri.parse(resourceRight.getImgurlreward()))
                        .skipMemoryCache(false)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(ivRight);
            } else {
                Toast.makeText(getActivity(), "网络连接异常!请检查网络", Toast.LENGTH_SHORT).show();
            }
        } else if (position == Config.MSG_MAIN_DATAII_GOT) {
            MainII mainII = JsonUtil.parseMainII(json);
            ml.chooseRandomPattern(true);
            if (mainII != null) {
                resource.addAll(mainII.getData().getResource());
                if (resource.size() == 5) {
                    ml.addPattern(pattern1);
                } else if (resource.size() == 6) {
                    ml.addPattern(pattern2);
                } else if (resource.size() == 8) {
                    ml.addPattern(pattern3);
                }

                mlAdapter = new MlAdapter(getActivity(), resource);
                ml.setAdapter(mlAdapter);
            } else {
                Toast.makeText(getActivity(), "网络连接异常!请检查网络", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
