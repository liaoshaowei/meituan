package com.xugang.meituan.foodpackage.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.xugang.meituan.R;
import com.xugang.meituan.foodpackage.classes.FoodPlay;
import com.xugang.meituan.foodpackage.widget.GlideRoundTransform;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by qf on 2016/10/31.
 */
public class ActivtyAdapter extends RecyclerView.Adapter<ActivtyAdapter.ViewHolder> {
    Context context;
    RecyclerView recyclerView;
    List<FoodPlay> list;
    private LayoutInflater layoutInflater;

    public ActivtyAdapter(Context context, RecyclerView recyclerView, List<FoodPlay> list) {
        this.context = context;
        this.recyclerView = recyclerView;
        this.list = list;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.food_activity_item, recyclerView, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        FoodPlay foodPlay = list.get(position);
        Glide.with(context)
             .load(foodPlay.getImgUri())
             .transform(new GlideRoundTransform(context,10))
             .into(holder.ivActivity);
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tvSubject)
        TextView tvSubject;
        @BindView(R.id.tvSummarize)
        TextView tvSummarize;
        @BindView(R.id.ivActivity)
        ImageView ivActivity;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
