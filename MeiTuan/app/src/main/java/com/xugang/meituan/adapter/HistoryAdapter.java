package com.xugang.meituan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xugang.meituan.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ASUS on 2016-11-08.
 */
public class HistoryAdapter extends BaseAdapter {
    private final LayoutInflater inflater;
    private Context context;
    private List<String> list;

    public HistoryAdapter(Context context, List<String> list) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public int getCount() {
        if (list.size() == 0) {
            return 0;
        } else if (list.size() < 6) {
            return list.size();
        } else {
            return 6;
        }
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
            convertView = inflater.inflate(R.layout.item_history_search, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvName.setText(list.get(list.size() - position - 1));
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tvName)
        TextView tvName;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
