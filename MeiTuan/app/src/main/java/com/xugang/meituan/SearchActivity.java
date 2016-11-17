package com.xugang.meituan;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.xugang.meituan.adapter.HistoryAdapter;
import com.xugang.meituan.adapter.HotSearchAdapter;
import com.xugang.meituan.adapter.SearchResultAdapter;
import com.xugang.meituan.model.SearchBean;
import com.xugang.meituan.model.SearchResult;
import com.xugang.meituan.util.Config;
import com.xugang.meituan.util.HttpUtil;
import com.xugang.meituan.util.JsonUtil;
import com.xugang.meituan.util.ThreadUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SearchActivity extends JPush {

    private static final String TAG = "test";
    @BindView(R.id.llBack)
    LinearLayout llBack;
    @BindView(R.id.etSearch)
    EditText etSearch;
    @BindView(R.id.tvSearch)
    TextView tvSearch;
    @BindView(R.id.gvHotSearch)
    GridView gvHotSearch;
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.lvHistory)
    ListView lvHistory;
    @BindView(R.id.llRoot)
    LinearLayout llRoot;
    @BindView(R.id.tvX)
    TextView tvX;
    @BindView(R.id.lvSearchResult)
    ListView lvSearchResult;
    private List<String> hotwords = new ArrayList<>();
    private Handler handler = new Handler() {
        private SearchResultAdapter searchResultAdapter;

        @Override
        public void handleMessage(Message msg) {
            if (msg.what == Config.MSG_SEARCH_HOT_GOT) {
                String json = (String) msg.obj;
                SearchBean searchBean = JsonUtil.parseSearchBean(json);
                tvTitle.setText(searchBean.getData().getTitle());
                hotwords.addAll(searchBean.getData().getHotwords());
                hotSearchAdapter.notifyDataSetChanged();
            } else if (msg.what == Config.MSG_SEARCH_RESULT_GOT) {
                String json = (String) msg.obj;
                SearchResult searchResult = JsonUtil.parseSearchResultBean(json);
                if (searchResult != null) {
                    List<SearchResult.DataBean.SearchResultBean.ItemsBean> items = searchResult.getData().getSearchResult().get(0).getItems();
                    searchResultAdapter = new SearchResultAdapter(SearchActivity.this, items);
                    lvSearchResult.setAdapter(searchResultAdapter);
                }

            }
        }
    };
    private HotSearchAdapter hotSearchAdapter;
    private SharedPreferences history;
    private SharedPreferences.Editor edit;
    private Set<String> info;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        hotSearchAdapter = new HotSearchAdapter(this, hotwords);
        gvHotSearch.setAdapter(hotSearchAdapter);

        initHotSearchList();
        //历史
        initHIstory();
        edit = history.edit();
        lvHistory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                getData(list.get(position));
            }
        });
        gvHotSearch.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                getData(hotwords.get(position));
            }
        });
    }

    @OnClick(R.id.tvSearch)
    public void onTvSearchClick() {
        String str = etSearch.getText().toString();
        getData(str);

    }

    private void getData(String str) {
        InputMethodManager systemService = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        systemService.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);

        llRoot.setVisibility(View.GONE);
        lvSearchResult.setVisibility(View.VISIBLE);

        putString(str);

        search();
    }

    private void putString(String str) {
        if (str.trim() != null) {
            Set<String> set = new HashSet<>();
            Iterator<String> iterator = info.iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next());
            }
            set.add(str);
            edit.putStringSet("info", set);
            edit.commit();
        }
    }

    private void search() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtil.getSearchResultBean(SearchActivity.this);
                Message msg = handler.obtainMessage();
                msg.what = Config.MSG_SEARCH_RESULT_GOT;
                msg.obj = json;
                handler.sendMessage(msg);
            }
        });
    }

    private void initHIstory() {
        history = getSharedPreferences("history", MODE_PRIVATE);
        info = history.getStringSet("info", new HashSet<String>());

        Iterator<String> iterator = info.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        lvHistory.setAdapter(new HistoryAdapter(this, list));
    }

    @OnClick(R.id.tvX)
    public void onTvXClick() {
        etSearch.setText("");
        lvSearchResult.setVisibility(View.GONE);
        llRoot.setVisibility(View.VISIBLE);
        initHIstory();
    }

    private void initHotSearchList() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtil.getSearchBean(SearchActivity.this);
                Message msg = handler.obtainMessage();
                msg.what = Config.MSG_SEARCH_HOT_GOT;
                msg.obj = json;
                handler.sendMessage(msg);
            }
        });
    }
}
