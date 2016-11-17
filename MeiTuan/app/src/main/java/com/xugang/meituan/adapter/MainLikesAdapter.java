package com.xugang.meituan.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.xugang.meituan.MainItemActivity;
import com.xugang.meituan.R;
import com.xugang.meituan.model.MainLikes;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ASUS on 2016-10-31.
 */
public class MainLikesAdapter extends BaseAdapter {
    private final LayoutInflater inflater;
    private Context context;
    private List<MainLikes.DataBean> data;
    private int currentPosition = -1;

    public MainLikesAdapter(Context context, List<MainLikes.DataBean> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        if (data.size() == 0) return 0;

        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_main_love, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.rlRoot.setVisibility(View.GONE);
        if (currentPosition == position) holder.rlRoot.setVisibility(View.VISIBLE);

//        holder.rlRoot.setVisibility(View.GONE);
//        if (currentPosition == position) holder.rlRoot.setVisibility(View.VISIBLE);

        MainLikes.DataBean info = data.get(position);
        setData(holder, info);
        holder.tvNotLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.remove(position);
                notifyDataSetChanged();
                currentPosition = -1;
            }
        });
        holder.tvClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.rlRoot.setVisibility(View.GONE);
                currentPosition = -1;
            }
        });

        holder.tv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                currentPosition = position;
                notifyDataSetChanged();
                return true;
            }
        });

        holder.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.rlRoot.getVisibility() == View.GONE) {
                    context.startActivity(new Intent(context, MainItemActivity.class));
                }
            }
        });

        return convertView;
    }

    private void setData(ViewHolder holder, MainLikes.DataBean info) {
        //设置商品名
        String title = info.getTitle();
        if (title != null) holder.tvName.setText(title);
        //设置商品信息
        String subTitle = info.getSubTitle();
        if (subTitle != null) holder.tvSummary.setText(subTitle);
        //设置价格
        String price = info.getMainMessage2();
        if (price != null) holder.tvPrice.setText(price);
        //设置距离
        String juli = info.getTopRightInfo();
        if (juli != null) holder.tvSpace.setText(juli);
        //设置已售数量
        String yishou = info.getBottomRightInfo();
        if (yishou != null) holder.tvYiShou.setText(yishou);
        //设置矩形
        MainLikes.DataBean.CampaignBean campaign = info.getCampaign();
        if (campaign != null) {
            String tag = campaign.getTag();
            if (tag != null && tag.length() >= 2) {
                holder.tvYouhui.setVisibility(View.VISIBLE);
                holder.tvYouhui.setText(tag);
            } else {
                holder.tvYouhui.setVisibility(View.GONE);
            }
        } else {
            holder.tvYouhui.setVisibility(View.GONE);
        }
        //设置门市价
        String subMessage = info.getSubMessage();
        if (subMessage != null && subMessage.length() >= 2) {
            holder.tvPriceII.setVisibility(View.VISIBLE);
            holder.tvPriceII.setText(subMessage);
        } else {
            holder.tvPriceII.setVisibility(View.GONE);
        }
        //设置销量
        String reason = info.getReason();
        if (reason != null && reason.length() >= 2) {
            holder.tvXiaoliang.setVisibility(View.VISIBLE);
            holder.tvXiaoliang.setText(reason);
        } else {
            holder.tvXiaoliang.setVisibility(View.GONE);
        }

        String imageUrl = info.getImageUrl();
        if (imageUrl != null) {
            Glide.with(context)
                    .load(Uri.parse(imageUrl))
                    .skipMemoryCache(false)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(holder.ivPicture);
        }
    }

    static class ViewHolder {
        @BindView(R.id.ivPicture)
        ImageView ivPicture;
        @BindView(R.id.tvName)
        TextView tvName;
        @BindView(R.id.tvSpace)
        TextView tvSpace;
        @BindView(R.id.tvSummary)
        TextView tvSummary;
        @BindView(R.id.tvPrice)
        TextView tvPrice;
        @BindView(R.id.tvYouhui)
        TextView tvYouhui;
        @BindView(R.id.tvPriceII)
        TextView tvPriceII;
        @BindView(R.id.tvYiShou)
        TextView tvYiShou;
        @BindView(R.id.tvXiaoliang)
        TextView tvXiaoliang;
        @BindView(R.id.tv)
        TextView tv;
        @BindView(R.id.tvNotLike)
        TextView tvNotLike;
        @BindView(R.id.tvClose)
        TextView tvClose;
        @BindView(R.id.rlRoot)
        RelativeLayout rlRoot;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
