package com.xugang.meituan.moviePackage.movieAdapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.xugang.meituan.R;
import com.xugang.meituan.model.MovieSelectMovie;

import java.util.List;

public class CoverFlowAdapter extends BaseAdapter {

    private List<MovieSelectMovie.DataBean.MoviesBean> mData;
    private Context context;
    private LayoutInflater inflater;

    public CoverFlowAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void setmData(List<MovieSelectMovie.DataBean.MoviesBean> mData) {
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int pos) {
        return mData.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.item_coverflow, null);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.image = (ImageView) rowView
                    .findViewById(R.id.image);
            rowView.setTag(viewHolder);
        }

        ViewHolder holder = (ViewHolder) rowView.getTag();

        String img = mData.get(position).getImg();
        if (img != null) {
            Glide.with(context)
                    .load(Uri.parse(img))
                    .skipMemoryCache(false)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(holder.image);
        }

        return rowView;


//        ViewHolder holder;
//        if (convertView == null) {
//            convertView = inflater.inflate(R.layout.item_coverflow, parent, false);
//            holder = new ViewHolder(convertView);
//            convertView.setTag(holder);
//        } else {
//            holder = ((ViewHolder) convertView.getTag());
//        }
//
//        String img = mData.get(position).getImg();
//        if (img != null) {
//            Glide.with(context)
//                    .load(Uri.parse(img))
//                    .skipMemoryCache(false)
//                    .diskCacheStrategy(DiskCacheStrategy.ALL)
//                    .into(holder.image);
//        }
//
//        return convertView;
    }

//    static class ViewHolder {
//        @BindView(R.id.image)
//        ImageView image;
//
//        ViewHolder(View view) {
//            ButterKnife.bind(this, view);
//        }
//    }


    static class ViewHolder {
        public ImageView image;
    }
}
