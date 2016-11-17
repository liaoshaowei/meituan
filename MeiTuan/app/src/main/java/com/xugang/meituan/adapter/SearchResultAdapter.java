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
import com.xugang.meituan.model.SearchResult;
import com.xugang.meituan.weight.MyRatingBar;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ASUS on 2016-11-08.
 */
public class SearchResultAdapter extends BaseAdapter {
    private final LayoutInflater inflater;
    private Context context;
    List<SearchResult.DataBean.SearchResultBean.ItemsBean> items;

    public SearchResultAdapter(Context context, List<SearchResult.DataBean.SearchResultBean.ItemsBean> items) {
        this.context = context;
        this.items = items;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        if (items.size() == 0) return 0;
        return items.size();
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
            convertView = inflater.inflate(R.layout.item_search_result, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        SearchResult.DataBean.SearchResultBean.ItemsBean item = items.get(position);
        holder.tvName.setText(item.getDisplay().getItemB().getTitle());
        double reviewScore = item.getDisplay().getItemB().getReviewScore();
        String s = Double.toHexString(reviewScore);
        holder.mrbRating.setProportion(Float.valueOf(s));
        holder.tvRating.setText(reviewScore + "分");

        holder.tvNumber.setText(item.getDisplay().getItemB().getRefInfoA());
        holder.tvJuLi.setText(item.getDisplay().getItemB().getRefInfoB());

        holder.tvPrice.setText("￥" + position + "元起");
        List<SearchResult.DataBean.SearchResultBean.ItemsBean.DisplayBean.ItemBBean.AbstractsBean> abstracts = item.getDisplay().getItemB().getAbstracts();

        int size = abstracts.size();
        if (size == 1) {
            one(holder, abstracts);
        } else if (size == 2) {
            one(holder, abstracts);
            two(holder, abstracts);
        } else if (size >= 3) {
            one(holder, abstracts);
            two(holder, abstracts);
            three(holder, abstracts);
        }


        return convertView;
    }

    private void three(ViewHolder holder, List<SearchResult.DataBean.SearchResultBean.ItemsBean.DisplayBean.ItemBBean.AbstractsBean> abstracts) {
        initPicture(abstracts.get(2).getIconUrl(), holder.ivThree);
        holder.tvOne.setText(abstracts.get(2).getMessage());
    }

    private void two(ViewHolder holder, List<SearchResult.DataBean.SearchResultBean.ItemsBean.DisplayBean.ItemBBean.AbstractsBean> abstracts) {
        initPicture(abstracts.get(1).getIconUrl(), holder.ivTwo);
        holder.tvOne.setText(abstracts.get(1).getMessage());
    }

    private void one(ViewHolder holder, List<SearchResult.DataBean.SearchResultBean.ItemsBean.DisplayBean.ItemBBean.AbstractsBean> abstracts) {
        initPicture(abstracts.get(0).getIconUrl(), holder.ivOne);
        holder.tvOne.setText(abstracts.get(0).getMessage());
    }

    private void initPicture(String url, ImageView iv) {
        Glide.with(context)
                .load(Uri.parse(url))
                .skipMemoryCache(false)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(iv);
    }


    static class ViewHolder {
        @BindView(R.id.ivPicture)
        ImageView ivPicture;
        @BindView(R.id.tvRating)
        TextView tvRating;
        @BindView(R.id.tvName)
        TextView tvName;
        @BindView(R.id.mrbRating)
        MyRatingBar mrbRating;
        @BindView(R.id.tvNumber)
        TextView tvNumber;
        @BindView(R.id.tvPrice)
        TextView tvPrice;
        @BindView(R.id.tvJuLi)
        TextView tvJuLi;
        @BindView(R.id.ivOne)
        ImageView ivOne;
        @BindView(R.id.tvOne)
        TextView tvOne;
        @BindView(R.id.ivTwo)
        ImageView ivTwo;
        @BindView(R.id.tvTwo)
        TextView tvTwo;
        @BindView(R.id.ivThree)
        ImageView ivThree;
        @BindView(R.id.tvThree)
        TextView tvThree;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
