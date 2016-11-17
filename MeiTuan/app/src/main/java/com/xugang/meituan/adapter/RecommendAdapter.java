package com.xugang.meituan.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.xugang.meituan.R;
import com.xugang.meituan.model.TuiJian;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ASUS on 2016-11-03.
 */
public class RecommendAdapter extends BaseAdapter {

    private static final String TAG = "test";
    private final LayoutInflater inflater;
    private Context context;
    private List<TuiJian.DataBean> data;

    public RecommendAdapter(Context context, List<TuiJian.DataBean> data) {
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_recommend, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        TuiJian.DataBean dataBean = data.get(position);
        holder.tvName.setText(dataBean.getName());
        holder.tvNumber.setText(dataBean.getRecCount() + "人推荐");

        float price = dataBean.getPrice() / 100f;
        if (price == 0.0) {
            holder.tvPrice.setVisibility(View.GONE);
            holder.tv.setVisibility(View.GONE);
        } else {
            holder.tvPrice.setVisibility(View.VISIBLE);
            holder.tv.setVisibility(View.VISIBLE);
            holder.tvPrice.setText(price + "");
        }
        String url = dataBean.getFrontImgUrl();
        if (url == null || url.equals("")) {
            holder.tvNoPicture.setVisibility(View.VISIBLE);
        } else {
            holder.tvNoPicture.setVisibility(View.GONE);
            Glide.with(context)
                    .load(Uri.parse(url))
                    .skipMemoryCache(false)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(holder.ivPicture);
        }
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.ivPicture)
        ImageView ivPicture;
        @BindView(R.id.tvName)
        TextView tvName;
        @BindView(R.id.tvNumber)
        TextView tvNumber;
        @BindView(R.id.tvPrice)
        TextView tvPrice;
        @BindView(R.id.tvNoPicture)
        TextView tvNoPicture;
        @BindView(R.id.tv)
        TextView tv;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
