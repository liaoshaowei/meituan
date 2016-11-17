package com.xugang.meituan.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.xugang.meituan.R;
import com.xugang.meituan.model.MovieSelectMovie;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/10/31 0031.
 */
public class MovieTestAdapter extends RecyclerView.Adapter<MovieTestAdapter.ViewHolder> {
    Context context;
    List<MovieSelectMovie.DataBean.MoviesBean> data;

    public MovieTestAdapter(Context context, List<MovieSelectMovie.DataBean.MoviesBean> data) {
        this.context = context;
        this.data = data;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_test_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MovieSelectMovie.DataBean.MoviesBean moviesBean = data.get(position);
        holder.tvTest.setText(moviesBean.getNm());
        String img = moviesBean.getImg();
        if (img != null) {
            Glide.with(context)
                    .load(Uri.parse(img))
                    .skipMemoryCache(false)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(holder.ivTest);

//            holder.ivTest.setImageURI(Uri.parse(img));
        }
    }


    @Override
    public int getItemCount() {
        return data.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ivTest)
        ImageView ivTest;
        @BindView(R.id.tvTest)
        TextView tvTest;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
