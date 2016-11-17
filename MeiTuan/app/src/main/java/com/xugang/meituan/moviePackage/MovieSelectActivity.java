package com.xugang.meituan.moviePackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xugang.meituan.JPush;
import com.xugang.meituan.R;
import com.xugang.meituan.model.MovieSelectMovie;
import com.xugang.meituan.moviePackage.movieAdapter.CoverFlowAdapter;
import com.xugang.meituan.moviePackage.movieAdapter.MovieSelectMovieAdapter;
import com.xugang.meituan.moviePackage.movieFakeDate.MovieHotShowingListFakeDate;
import com.xugang.meituan.util.Config;
import com.xugang.meituan.util.JsonUtil;
import com.xugang.meituan.util.ThreadUtil;
import com.xugang.meituan.weight.PullToRefreshView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

/**
 * Created by Administrator on 2016/11/3 0003.
 */
public class MovieSelectActivity extends JPush {

    @BindView(R.id.movie_select_tv_back)
    TextView movieSelectTvBack;
    @BindView(R.id.movie_select_tv_cinema)
    TextView movieSelectTvCinema;
    @BindView(R.id.movie_select_iv_share)
    ImageView movieSelectIvShare;
    @BindView(R.id.movie_select_iv_collect)
    ImageView movieSelectIvCollect;
    @BindView(R.id.tv_cinemas)
    TextView tvCinemas;
    @BindView(R.id.tv_grade)
    TextView tvGrade;
    @BindView(R.id.movie_select_rl_i)
    RelativeLayout movieSelectRlI;
    @BindView(R.id.movie_select_tv_ii)
    TextView movieSelectTvIi;
    @BindView(R.id.tv_i)
    TextView tvI;
    @BindView(R.id.tv_ii)
    TextView tvIi;
    @BindView(R.id.tv_iii)
    TextView tvIii;
    @BindView(R.id.movie_select_rl_iii)
    LinearLayout movieSelectRlIii;
    //    @BindView(R.id.movie_select_coverflow)
//    FeatureCoverFlow movieSelectCoverflow;

    @BindView(R.id.movie_select_lv_movietime)
    ListView movieSelectLvMovietime;
    @BindView(R.id.movie_select_ll)
    LinearLayout movieSelectLl;
    @BindView(R.id.movie_select_nm)
    TextView movieSelectNm;
    @BindView(R.id.movie_select_sc)
    TextView movieSelectSc;
    @BindView(R.id.movie_select_desc)
    TextView movieSelectDesc;



    @BindView(R.id.movie_select_rb_i)
    RadioButton movieSelectRbI;
    @BindView(R.id.movie_select_rb_ii)
    RadioButton movieSelectRbIi;
    @BindView(R.id.movie_select_rb_iii)
    RadioButton movieSelectRbIii;
    @BindView(R.id.movie_select_rb_iv)
    RadioButton movieSelectRbIv;
    @BindView(R.id.movie_select_rb_v)
    RadioButton movieSelectRbV;
    @BindView(R.id.movie_select_rg)
    RadioGroup movieSelectRg;

    @BindView(R.id.movie_select_wish)
    TextView movieSelectWish;
    @BindView(R.id.movie_select_coverflow)
    FeatureCoverFlow movieSelectCoverflow;
    @BindView(R.id.movie_selet_pull_to_refresh)
    PullToRefreshView movieSeletPullToRefresh;
    @BindView(R.id.tv_no_movie)
    TextView tvNoMovie;

    private List<MovieSelectMovie.DataBean.MoviesBean> movies;
    private CoverFlowAdapter mAdapter;
    private FeatureCoverFlow mCoverFlow;
    private MovieSelectMovieAdapter movieSelectMovieAdapte;

    Handler handler = new Handler() {


        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {

                case Config.MSG_MOVIE_SI:
                    MovieSelectMovie movieSelectMovie = (MovieSelectMovie) msg.obj;
                    if (movieSelectMovie != null) {
                        movies = movieSelectMovie.getData().getMovies();
                        mAdapter = new CoverFlowAdapter(MovieSelectActivity.this);
                        mAdapter.setmData(movies);
                        mCoverFlow = ((FeatureCoverFlow) findViewById(R.id.movie_select_coverflow));
                        mCoverFlow.setAdapter(mAdapter);
                        tvNoMovie.setVisibility(View.GONE);
                        movieSelectTvCinema.setText(cinaName);
                        tvCinemas.setText(cinaName);
                        movieSelectTvIi.setText(addr);

                        CoverFlowListen();
                    }else {
                        tvNoMovie.setVisibility(View.VISIBLE);
                    }
            }
        }
    };
    private String addr;
    private String cinaName;

    private void CoverFlowListen() {
        if (movies != null) {
            mCoverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
                @Override
                public void onScrolledToPosition(final int position) {
                    final MovieSelectMovie.DataBean.MoviesBean moviesBean = movies.get(position);

                    movieSelectNm.setText(moviesBean.getNm());
                    if (moviesBean.getSc().equals("0.0")) {
                        movieSelectSc.setText(moviesBean.getWish() + "");
                        movieSelectWish.setText("人想看");
                    } else {
                        movieSelectSc.setText(moviesBean.getSc());
                        movieSelectWish.setText("分");
                    }
                    movieSelectDesc.setText(moviesBean.getDesc());



                    int size = moviesBean.getShows().size();

                    switch (size) {
                        case 1:
                            movieSelectRbIi.setVisibility(View.GONE);
                            movieSelectRbIii.setVisibility(View.GONE);
                            movieSelectRbIv.setVisibility(View.GONE);
                            movieSelectRbV.setVisibility(View.GONE);
                            break;
                        case 2:
                            movieSelectRbIi.setVisibility(View.VISIBLE);
                            movieSelectRbIii.setVisibility(View.GONE);
                            movieSelectRbIv.setVisibility(View.GONE);
                            movieSelectRbV.setVisibility(View.GONE);
                            break;
                        case 3:
                            movieSelectRbIi.setVisibility(View.VISIBLE);
                            movieSelectRbIii.setVisibility(View.VISIBLE);
                            movieSelectRbIv.setVisibility(View.GONE);
                            movieSelectRbV.setVisibility(View.GONE);
                            break;
                        case 4:
                            movieSelectRbIi.setVisibility(View.VISIBLE);
                            movieSelectRbIii.setVisibility(View.VISIBLE);
                            movieSelectRbIv.setVisibility(View.VISIBLE);
                            movieSelectRbV.setVisibility(View.GONE);
                            break;
                        case 5:
                            movieSelectRbIi.setVisibility(View.VISIBLE);
                            movieSelectRbIii.setVisibility(View.VISIBLE);
                            movieSelectRbIv.setVisibility(View.VISIBLE);
                            movieSelectRbV.setVisibility(View.VISIBLE);
                            break;
                    }


                    List<MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean> plist1 = moviesBean.getShows().get(0).getPlist();
                    Log.e("test", "ListviewAdapterInit: "+plist1.size());
                    if (plist1.size()==0){
                        tvNoMovie.setVisibility(View.VISIBLE);
                    }
                    movieSelectMovieAdapte = new MovieSelectMovieAdapter(MovieSelectActivity.this, plist1);
                    movieSelectMovieAdapte.setNm(movies.get(position).getNm());
                    movieSelectMovieAdapte.setDur(moviesBean.getDur());
                    movieSelectMovieAdapte.setAddr(addr);
                    movieSelectMovieAdapte.setCinaName(cinaName);
                    movieSelectLvMovietime.setAdapter(movieSelectMovieAdapte);
                    //      movieSelectMovieAdapte.notifyDataSetChanged();

                    //       ListviewAdapterInit(plist1, moviesBean);


                    movieSelectRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            switch (checkedId) {
                                case R.id.movie_select_rb_i:
                                    List<MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean> plist1 = moviesBean.getShows().get(0).getPlist();

                                    ListviewAdapterInit(plist1, moviesBean, position);
                                    break;
                                case R.id.movie_select_rb_ii:
                                    Log.e("test", "onCheckedChanged: "+1222);
                                    List<MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean> plist2 = moviesBean.getShows().get(1).getPlist();
                                    ListviewAdapterInit(plist2, moviesBean, position);
                                    break;
                                case R.id.movie_select_rb_iii:

                                    List<MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean> plist3 = moviesBean.getShows().get(2).getPlist();
                                    ListviewAdapterInit(plist3, moviesBean, position);
                                    break;
                                case R.id.movie_select_rb_iv:

                                    List<MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean> plist4 = moviesBean.getShows().get(3).getPlist();
                                    ListviewAdapterInit(plist4, moviesBean, position);
                                    break;
                                case R.id.movie_select_rb_v:

                                    List<MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean> plist5 = moviesBean.getShows().get(4).getPlist();

                                    ListviewAdapterInit(plist5, moviesBean, position);
                                    break;
                            }
                        }
                    });


                }

                @Override
                public void onScrolling() {

                }
            });
        }
    }

    private void ListviewAdapterInit(List<MovieSelectMovie.DataBean.MoviesBean.ShowsBean.PlistBean> plist1, MovieSelectMovie.DataBean.MoviesBean moviesBean, int position) {

        int size = plist1.size();
        Log.e("test", "ListviewAdapterInit: "+size);

        movieSelectMovieAdapte = new MovieSelectMovieAdapter(MovieSelectActivity.this, plist1);
        movieSelectMovieAdapte.setNm(movies.get(position).getNm());
        movieSelectMovieAdapte.setDur(moviesBean.getDur());
        movieSelectMovieAdapte.setAddr(addr);
        movieSelectMovieAdapte.setCinaName(cinaName);
        movieSelectLvMovietime.setAdapter(movieSelectMovieAdapte);
        movieSelectMovieAdapte.notifyDataSetChanged();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_select_activity);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        addr = intent.getStringExtra("addr");
        cinaName = intent.getStringExtra("cinaName");

        movieSelectLvMovietime.setFocusable(false);


        getPullToRefreshListen();


        initMovieDate();


        movieSelectTvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//
//        mCoverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MovieSelectActivity.this,
//                        "wwww",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });


    }

    private void getPullToRefreshListen() {
        movieSeletPullToRefresh.setOnHeaderRefreshListener(new PullToRefreshView.OnHeaderRefreshListener() {
            @Override
            public void onHeaderRefresh(PullToRefreshView view) {
                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        movieSeletPullToRefresh.onHeaderRefreshComplete();
                    }
                }, 1000);
            }
        });


        movieSeletPullToRefresh.setOnFooterRefreshListener(new PullToRefreshView.OnFooterRefreshListener() {
            @Override
            public void onFooterRefresh(PullToRefreshView view) {
                view.postDelayed(new Runnable() {
                    public void run() {

                        movieSeletPullToRefresh.onFooterRefreshComplete();
                    }
                }, 1000);
            }
        });
        movieSeletPullToRefresh.setFooter(true);
    }

    private void initMovieDate() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                MovieSelectMovie movieSelectMovie = JsonUtil.parseMovieSelectMovie(MovieHotShowingListFakeDate.movieDate);
                Message message = handler.obtainMessage();
                message.what = Config.MSG_MOVIE_SI;
                message.obj = movieSelectMovie;
                handler.sendMessage(message);
            }
        });
    }
}
