package com.xugang.meituan.moviePackage.movieAdapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xugang.meituan.R;
import com.xugang.meituan.model.MovieSelectMovie;
import com.xugang.meituan.moviePackage.MovieSelectSeatActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/11/3 0003.
 */
public class MovieSelectMovieAdapter extends BaseAdapter {

    Context context;
    List<MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean> data;
    private LayoutInflater inflater;
    int dur;
    String nm ;
    String addr;
    String cinaName;

    public void setCinaName(String cinaName) {
        this.cinaName = cinaName;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setNm(String nm){
        this.nm = nm;
    }

    public MovieSelectMovieAdapter(Context context, List<MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    @Override
    public int getCount() {
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
    public View getView(int position, View convertView, final ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.movie_select_movietime_itme, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = ((ViewHolder) convertView.getTag());
        }
        final MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean plistBean = data.get(position);
        holder.movieSelectTvStartTm.setText(plistBean.getTm());

        String endTime = endTimeUtil(plistBean);
//        int rh = Integer.getInteger(tmH) + hour;
        holder.movieSelectTvEndTm.setText(endTime+"散场");

        holder.movieSelectTvTp.setText(plistBean.getLang()+plistBean.getTp());
        holder.movieSelectTvTh.setText(plistBean.getTh());
        holder.movieSelectTvSellPr.setText(plistBean.getSellPr());
        holder.movieSelectTvExtraDesc.setText(plistBean.getExtraDesc());

        holder.movieSelectTvBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MovieSelectSeatActivity.class);
                Bundle extras = new Bundle();
                extras.putString("Th",plistBean.getTh());
                extras.putString("Tm",plistBean.getTm());
                extras.putString("Nm",nm);
                extras.putString("Tp",plistBean.getTp());
                extras.putString("long",plistBean.getLang()+plistBean.getTp());
                extras.putString("SellPr",plistBean.getSellPr());
                extras.putString("dt",plistBean.getDt());
                extras.putString("cinaName",cinaName);
                extras.putString("addr",addr);
                intent.putExtras(extras);
                context.startActivity(intent);
            }
        });

        return convertView;
    }

    @NonNull
    private String endTimeUtil(MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean plistBean) {
        int hour = dur / 60;
        int m = dur % 60;

        String tm = plistBean.getTm();
        String tmH = tm.substring(0, 2);
        String tmM = tm.substring(3);

        String rH = null;
        String rM = null;

        boolean bM = isString(tmM);
        if (bM) {
            m = m + Integer.parseInt(tmM);
            if (m < 10) {
                rM = "" + 0 + m;
            } else if (m >= 60 && m < 70) {
                m = m - 60;
                rM = "" + 0 + m;
                hour = hour + 1;
            } else if (m > 70) {
                m = m - 60;
                rM = "" + m;
                hour = hour + 1;
            } else {
                rM = "" + m;
            }
        } else {
            tmM = tm.substring(4);
            m = m + Integer.parseInt(tmM);
            if (m < 10) {
                rM = "" + 0 + m;
            } else if (m >= 60 && m < 70) {
                m = m - 60;
                rM = "" + 0 + m;
                hour = hour + 1;
            } else {
                m = m - 60;
                rM = "" + m;
                hour = hour + 1;
            }
        }


        boolean bH = isString(tmH);

        if (bH = true) {
            hour = hour + Integer.parseInt(tmH);
            if (hour < 10) {
                rH = "" + 0 + hour;
            } else if (hour >= 24) {
                hour = hour - 24;
                rH = "0" + hour;
            } else {
                rH = "" + hour;
            }
        } else {
            tmH = tm.substring(1, 2);
            hour = hour + Integer.parseInt(tmH);
            if (hour < 10) {
                rH = "" + 0 + hour;
            } else if (hour >= 24) {
                hour = hour - 24;
                rH = "0" + hour;
            } else {
                rH = "" + hour;
            }
        }
        return rH+":"+rM;
    }

    static class ViewHolder {
        @BindView(R.id.movie_select_tv_start_tm)
        TextView movieSelectTvStartTm;
        @BindView(R.id.movie_select_tv_end_tm)
        TextView movieSelectTvEndTm;
        @BindView(R.id.movie_select_lv_movietime_rl_i)
        RelativeLayout movieSelectLvMovietimeRlI;
        @BindView(R.id.movie_select_tv_tp)
        TextView movieSelectTvTp;
        @BindView(R.id.movie_select_tv_th)
        TextView movieSelectTvTh;
        @BindView(R.id.movie_select_lv_movietime_rl_ii)
        RelativeLayout movieSelectLvMovietimeRlIi;
        @BindView(R.id.movie_select_tv_sellPr)
        TextView movieSelectTvSellPr;
        @BindView(R.id.movie_select_tv_extraDesc)
        TextView movieSelectTvExtraDesc;
        @BindView(R.id.movie_select_lv_movietime_rl_iii)
        RelativeLayout movieSelectLvMovietimeRlIii;
        @BindView(R.id.movie_select_tv_buy)
        TextView movieSelectTvBuy;
        @BindView(R.id.movie_select_rl)
        RelativeLayout movieSelectRl;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    public boolean isString(String str) {
        int temp = 0;
        try {
            temp = Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
