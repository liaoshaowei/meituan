package com.xugang.meituan.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xugang.meituan.R;
import com.xugang.meituan.model.MovieHotShowingFD;
import com.xugang.meituan.moviePackage.MovieSelectActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class MovieCinemasAdater extends BaseAdapter {
    Context context;
    List<MovieHotShowingFD.DataBean.CinemasBean> date;
    private LayoutInflater inflater;

    public MovieCinemasAdater(Context context, List<MovieHotShowingFD.DataBean.CinemasBean> date) {
        this.context = context;
        this.date = date;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return date.size();
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
            convertView = inflater.inflate(R.layout.movie_hot_showing_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = ((ViewHolder) convertView.getTag());
        }
        final MovieHotShowingFD.DataBean.CinemasBean cinemasBean = date.get(position);
        MovieHotShowingFD.DataBean.CinemasBean.PromotionBean promotion = cinemasBean.getPromotion();
        if (promotion==null || promotion.getPlatformActivityTag()==null){
            holder.movieItemRlHui.setVisibility(View.GONE);
        }else {
            holder.movieItemTvHuiI.setText(promotion.getPlatformActivityTag());
        }

        holder.movieStudioTv.setText(cinemasBean.getNm());
        holder.movieItemTvI.setText("￥"+cinemasBean.getSellPrice());
        holder.movieDistanceTv.setText(cinemasBean.getDistance());

        holder.llCinemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MovieSelectActivity.class);
                intent.putExtra("addr",cinemasBean.getAddr());
                intent.putExtra("cinaName",cinemasBean.getNm());
                context.startActivity(intent);
            }
        });

        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.movie_studio_tv)
        TextView movieStudioTv;
        @BindView(R.id.movie_distance_tv)
        TextView movieDistanceTv;
        @BindView(R.id.movie_item_tv_i)
        TextView movieItemTvI;
        @BindView(R.id.movie_item_tv_ii)
        TextView movieItemTvIi;
        @BindView(R.id.movie_item_tv_iii)
        TextView movieItemTvIii;
        @BindView(R.id.movie_item_iv_hui)
        ImageView movieItemIvHui;
        @BindView(R.id.movie_item_tv_hui_i)
        TextView movieItemTvHuiI;
        @BindView(R.id.movie_item_rl_hui)
        RelativeLayout movieItemRlHui;
        @BindView(R.id.ll_cinemas)
        LinearLayout llCinemas;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
