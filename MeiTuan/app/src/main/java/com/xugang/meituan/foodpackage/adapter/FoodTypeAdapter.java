package com.xugang.meituan.foodpackage.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.xugang.meituan.R;
import com.xugang.meituan.foodpackage.classes.FoodType;
import com.xugang.meituan.util.ThreadUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by qf on 2016/11/3.
 */
public class FoodTypeAdapter extends RecyclerView.Adapter<FoodTypeAdapter.Holder> {
    private static final String TAG = "test";
    Context context;
    List<FoodType> list;

    public void setList(List<FoodType> list) {
        this.list = list;
    }

    public FoodTypeAdapter(Context context, List<FoodType> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.food_foodtype_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder( Holder holder, int position) {
        FoodType foodType = list.get(position);
        holder.ivFoodTypeImg.setImageBitmap(foodType.getFoodImg());
        holder.tvFoodTypeName.setText(foodType.getName());
    }

    @Override
    public int getItemCount() {
        Log.e(TAG, "getItemCount:  list.get(0).getName()="+ list.get(0).getName() );
        return list.size();
    }

    static class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.ivFoodTypeImg)
        ImageView ivFoodTypeImg;
        @BindView(R.id.tvFoodTypeName)
        TextView tvFoodTypeName;

        Holder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
