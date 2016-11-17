package com.xugang.meituan.foodpackage.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.xugang.meituan.R;
import com.xugang.meituan.foodpackage.classes.Shop;
import com.xugang.meituan.weight.MyRatingBar;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by qf on 2016/11/1.
 */
public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.Holder> {
    private static final int NORMAL_VIEW_TYPE = 1;
    private static final int SPECIAL_VIEW_TYPE = 0;
    private static final String TAG = "test";
    private final LayoutInflater layoutInflater;
    FoodShopClickListener foodShopClickListener;
    Context context;
    List<Object> list;


    public void setFoodShopClickListener(FoodShopClickListener foodShopClickListener) {
        this.foodShopClickListener = foodShopClickListener;
    }

    public ShopAdapter(Context context, List<Object> list) {
        this.context = context;
        this.list = list;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.food_shop_item_normal, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(final Holder holder, int position) {
        Log.e(TAG, "onBindViewHolder: position=" + position);
        switch (position) {
            case 0:
                holder.rlPosition.setVisibility(View.VISIBLE);
                holder.llNormal.setVisibility(View.VISIBLE);
                holder.llEmpty.setVisibility(View.VISIBLE);
                holder.llSpecial.setVisibility(View.GONE);
                break;
            case 2:
                holder.rlPosition.setVisibility(View.GONE);
                holder.llNormal.setVisibility(View.VISIBLE);
                holder.llEmpty.setVisibility(View.GONE);
                holder.llSpecial.setVisibility(View.GONE);
                break;
            case 3:
                holder.rlPosition.setVisibility(View.GONE);
                holder.llSpecial.setVisibility(View.VISIBLE);
                holder.llNormal.setVisibility(View.GONE);
                holder.llEmpty.setVisibility(View.GONE);
                break;
            default:
                holder.rlPosition.setVisibility(View.GONE);
                holder.llNormal.setVisibility(View.VISIBLE);
                holder.llEmpty.setVisibility(View.VISIBLE);
                holder.llSpecial.setVisibility(View.GONE);
                break;
        }
        if (position == 3) {
            List<Shop.TipsBean> tipsBeen = (List<Shop.TipsBean>) list.get(3);
            Shop.TipsBean tipsShop = tipsBeen.get(0);
            Log.e(TAG, "onBindViewHolder: tipsBeen.size()=" + tipsBeen.size());
            for (int i = 0; i < 8; i++) {
                String shopName = tipsShop.getTipmsgs().get(i).getName();
                switch (i) {
                    case 0:
                        holder.tvSpecialOne.setText(shopName);
                        break;
                    case 1:
                        holder.tvSpecialTwo.setText(shopName);
                        break;
                    case 2:
                        holder.tvSpecialThree.setText(shopName);
                        break;
                    case 3:
                        holder.tvSpecialFour.setText(shopName);
                        break;
                    case 4:
                        holder.tvSpecialFive.setText(shopName);
                        break;
                    case 5:
                        holder.tvSpecialSix.setText(shopName);
                        break;
                    case 6:
                        holder.tvSpecialSeven.setText(shopName);
                        break;
                    case 7:
                        holder.tvSpecialEight.setText(shopName);
                        break;
                }
            }
        } else {
            Shop.DataBean.PoiBean data = ((Shop.DataBean) list.get(position)).getPoi();
            //店名
            String shopName = data.getName();
            holder.tvShopName.setText(shopName);
            Log.e(TAG, "onBindViewHolder:shopName= " + shopName);
            //封面
            String coverImg = data.getFrontImg();
            Glide.with(context)
                    .load(Uri.parse(coverImg))
                    .placeholder(R.mipmap.food_nopicture)
                    .into(holder.ivShopCover);
            //平均价
            double avgPrice = data.getAvgPrice();
            holder.tvCost.setText("¥" + avgPrice + "/人");
            //平均分
            double avgScore = data.getAvgScore();
            holder.mrbScore.setProportion((float) avgScore);
            //地点
            String areaName = data.getAreaName();
            holder.tvPosition.setText(areaName);
            //食物类型
            String foodType = data.getCateName();
            holder.tvFoodStyle.setText(foodType);
            //总评价
            String Evaluate = data.getRecommendation().getContent();
            if (!Evaluate.equals("")) {
                holder.tvEvaluate.setVisibility(View.VISIBLE);
                holder.tvEvaluate.setText(Evaluate);
            }
            //店铺活动
            String shopActivity = data.getCampaignTag();
            if (!shopActivity.equals("")) {
                holder.tvActivity.setVisibility(View.VISIBLE);
                holder.tvActivity.setText(shopActivity);
            }
            //订,排 ,羊
            List<?> icons = data.getExtra().getIcons();
            Log.e(TAG, "onBindViewHolder: coverImg=" + coverImg);
            if (icons.size() != 0) {
                String iconImg = icons.get(0).toString();
                holder.ivMark.setVisibility(View.VISIBLE);
                Glide.with(context)
                        .load(Uri.parse(iconImg))
                        .into(holder.ivMark);
                Log.e(TAG, "onBindViewHolder: iconImg=" + iconImg);
            }
            //优惠,团购,券
            for (Shop.DataBean.PoiBean.PayAbstractsBean bean : data.getPayAbstracts()) {
                String type = bean.getType();
                String abstractX = bean.getAbstractX();
                Log.e(TAG, "onBindViewHolder:abstractX=" + abstractX);
                final String iconUrl = bean.getIcon_url();
                Log.e(TAG, "onBindViewHolder: type" + type);
                switch (type) {
                    case "promotions":
                        holder.llFavor.setVisibility(View.VISIBLE);
                        Glide.with(context)
                                .load(Uri.parse(iconUrl))
                                .into(holder.ivFavor);
                        holder.tvFavorSummarize.setText(abstractX);
                        break;
                    case "group":
                        holder.llGroup.setVisibility(View.VISIBLE);
                        Glide.with(context)
                                .load(Uri.parse(iconUrl))
                                .into(holder.ivGoup);
                        holder.tvGroupSummarize.setText(abstractX);
                        break;
                    case "coupon":
                        holder.llCoupon.setVisibility(View.VISIBLE);
                        Glide.with(context)
                                .load(Uri.parse(iconUrl))
                                .into(holder.ivCoupon);
                        holder.tvCouponSummarize.setText(abstractX);
                        break;
                }
            }
            //跳转监听
            holder.llShopItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (foodShopClickListener != null) {
                        foodShopClickListener.foodShopClick();
                    }
                }
            });
        }
    }

    public interface FoodShopClickListener {
        void foodShopClick();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.ivShopCover)
        ImageView ivShopCover;
        @BindView(R.id.tvActivity)
        TextView tvActivity;
        @BindView(R.id.tvShopName)
        TextView tvShopName;
        @BindView(R.id.ivMark)
        ImageView ivMark;
        @BindView(R.id.tvCost)
        TextView tvCost;
        @BindView(R.id.tvFoodStyle)
        TextView tvFoodStyle;
        @BindView(R.id.tvPosition)
        TextView tvPosition;
        @BindView(R.id.ivFavor)
        ImageView ivFavor;
        @BindView(R.id.tvFavorSummarize)
        TextView tvFavorSummarize;
        @BindView(R.id.ivGoup)
        ImageView ivGoup;
        @BindView(R.id.tvGroupSummarize)
        TextView tvGroupSummarize;
        @BindView(R.id.ivCoupon)
        ImageView ivCoupon;
        @BindView(R.id.tvCouponSummarize)
        TextView tvCouponSummarize;
        @BindView(R.id.tvEvaluate)
        TextView tvEvaluate;
        @BindView(R.id.llNormal)
        LinearLayout llNormal;
        @BindView(R.id.tvSpecialOne)
        TextView tvSpecialOne;
        @BindView(R.id.tvSpecialTwo)
        TextView tvSpecialTwo;
        @BindView(R.id.tvSpecialThree)
        TextView tvSpecialThree;
        @BindView(R.id.tvSpecialFour)
        TextView tvSpecialFour;
        @BindView(R.id.tvSpecialFive)
        TextView tvSpecialFive;
        @BindView(R.id.tvSpecialSix)
        TextView tvSpecialSix;
        @BindView(R.id.tvSpecialSeven)
        TextView tvSpecialSeven;
        @BindView(R.id.tvSpecialEight)
        TextView tvSpecialEight;
        @BindView(R.id.llSpecial)
        LinearLayout llSpecial;
        @BindView(R.id.llFavor)
        LinearLayout llFavor;
        @BindView(R.id.llGroup)
        LinearLayout llGroup;
        @BindView(R.id.llCoupon)
        LinearLayout llCoupon;
        @BindView(R.id.llEmpty)
        LinearLayout llEmpty;
        @BindView(R.id.rlPosition)
        RelativeLayout rlPosition;
        @BindView(R.id.llShopItem)
        LinearLayout llShopItem;
        @BindView(R.id.mrbScore)
        MyRatingBar mrbScore;
        Holder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
