package com.xugang.meituan.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.xugang.meituan.R;
import com.xugang.meituan.model.MainII;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ASUS on 2016-11-06.
 */
public class MlAdapter extends ArrayAdapter {

    private final LayoutInflater inflater;
    private Context context;
    private List<MainII.DataBean.ResourceBean> resource;

    public MlAdapter(Context context, List<MainII.DataBean.ResourceBean> resource) {
        super(context, R.layout.item_main_ii);
        this.context = context;
        this.resource = resource;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        if (resource.size() == 0) return 0;
        return resource.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_main_ii, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        if (position == 0 && resource.size() == 5) {
            holder.ivPicture.setLayoutParams(new LinearLayout.LayoutParams(200, 200));
        }

        MainII.DataBean.ResourceBean resourceBean = resource.get(position);
        holder.tvTitle.setText(resourceBean.getMaintitle());
        holder.tvYouhui.setText(resourceBean.getDeputytitle());
        Glide.with(context)
                .load(Uri.parse(resourceBean.getImgurl69()))
                .skipMemoryCache(false)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.ivPicture);

        if (position == 0) {
            holder.tvYouhui.setTextColor(context.getResources().getColor(R.color.one));
        } else if (position == 1) {
            holder.tvYouhui.setTextColor(context.getResources().getColor(R.color.two));
        } else if (position == 2) {
            holder.tvYouhui.setTextColor(context.getResources().getColor(R.color.three));
        } else if (position == 3) {
            holder.tvYouhui.setTextColor(context.getResources().getColor(R.color.four));
        } else if (position == 4) {
            holder.tvYouhui.setTextColor(context.getResources().getColor(R.color.five));
        } else if (position == 5) {
            holder.tvYouhui.setTextColor(context.getResources().getColor(R.color.six));
        } else if (position == 6) {
            holder.tvYouhui.setTextColor(context.getResources().getColor(R.color.seven));
        } else if (position == 7) {
            holder.tvYouhui.setTextColor(context.getResources().getColor(R.color.eight));
        }

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tvTitle)
        TextView tvTitle;
        @BindView(R.id.tvYouhui)
        TextView tvYouhui;
        @BindView(R.id.ivPicture)
        ImageView ivPicture;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
