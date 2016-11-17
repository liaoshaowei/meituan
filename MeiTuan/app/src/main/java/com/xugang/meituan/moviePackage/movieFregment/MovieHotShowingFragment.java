package com.xugang.meituan.moviePackage.movieFregment;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.xugang.meituan.R;
import com.xugang.meituan.adapter.MovieCinemasAdater;
import com.xugang.meituan.adapter.MovieTestAdapter;
import com.xugang.meituan.model.MovieHotShowingFD;
import com.xugang.meituan.model.MovieHotShowingTops;
import com.xugang.meituan.model.MovieSelectMovie;
import com.xugang.meituan.moviePackage.movieFakeDate.MovieHotShowingListFakeDate;
import com.xugang.meituan.util.Config;
import com.xugang.meituan.util.HttpUtil;
import com.xugang.meituan.util.JsonUtil;
import com.xugang.meituan.util.ListViewUtil;
import com.xugang.meituan.util.ThreadUtil;
import com.xugang.meituan.weight.MyScorllView;
import com.xugang.meituan.weight.PullToRefreshView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/10/31 0031.
 */
public class MovieHotShowingFragment extends Fragment implements MyScorllView.OnScrollListener {

    @BindView(R.id.vpMovie)
    ViewPager vpMovie;
    @BindView(R.id.rgMovieHot)
    RadioGroup rgMovieHot;
    @BindView(R.id.movie_tv)
    TextView movieTv;
    @BindView(R.id.movieSmallIv)
    ImageView movieSmallIv;
    @BindView(R.id.id_recyclerview_horizontal)
    RecyclerView idRecyclerviewHorizontal;
    @BindView(R.id.movie_lv)
    ListView movieLv;
    @BindView(R.id.rlhs)
    RelativeLayout rlhs;
    @BindView(R.id.movie_top_rb1)
    RadioButton movieTopRb1;
    @BindView(R.id.movie_top_rb2)
    RadioButton movieTopRb2;
    @BindView(R.id.movie_top_rb3)
    RadioButton movieTopRb3;
    @BindView(R.id.movie_top_rb4)
    RadioButton movieTopRb4;
    @BindView(R.id.movie_top_rb5)
    RadioButton movieTopRb5;
    @BindView(R.id.movie_top_rb6)
    RadioButton movieTopRb6;
    @BindView(R.id.movie_pull_to_refresh)
    PullToRefreshView moviePullToRefresh;
    @BindView(R.id.center_ll)
    LinearLayout centerLl;
    @BindView(R.id.top_ll)
    LinearLayout topLl;
    @BindView(R.id.my_scorll_view)
    MyScorllView myScorllView;
    @BindView(R.id.parent_ll)
    LinearLayout parentLl;
    private View view;

    private MovieTestAdapter movieTestAdapter;
    List<String> urlList = new ArrayList<>();
    View[] views;
    RadioButton[] rb = new RadioButton[]{movieTopRb1, movieTopRb2, movieTopRb3, movieTopRb4, movieTopRb5, movieTopRb6};

    Handler handler = new Handler() {
        private MovieCinemasAdater movieCinemasAdater;

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case Config.MSG_MOVIE_HSI:
                    MovieHotShowingTops data = (MovieHotShowingTops) msg.obj;
                    if (data != null) {
                        List<MovieHotShowingTops.DataBean> been = data.getData();
                        for (int i = 0; i < been.size(); i++) {
                            String imgUrl = been.get(i).getImgUrl();
                            urlList.add(imgUrl);

                        }

                        ViewPageInit();
                        if (urlList != null) {
                            autoPlayByThread(true);
                        }

                    } else {
                        rlhs.setVisibility(View.GONE);
                    }
                    break;


                case Config.MSG_MOVIE_HSII:

                    MovieHotShowingFD hotShowingFD = (MovieHotShowingFD) msg.obj;
                    if (hotShowingFD != null) {
                        List<MovieHotShowingFD.DataBean.CinemasBean> cinemas = hotShowingFD.getData().getCinemas();
                        movieCinemasAdater = new MovieCinemasAdater(getActivity(), cinemas);
                        movieLv.setAdapter(movieCinemasAdater);
                        new ListViewUtil().setListViewHeightBasedOnChildren(movieLv);
                    }
                    break;

                case Config.MSG_MOVIE_HSIII:
                    MovieSelectMovie movieSelectMovie = (MovieSelectMovie) msg.obj;
                    if (movieSelectMovie != null) {
                        List<MovieSelectMovie.DataBean.MoviesBean> movies = movieSelectMovie.getData().getMovies();
                        MovieInit(movies);
                    }
            }
        }
    };


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.movie_hot_showing_fragment, container, false);
            ButterKnife.bind(this, view);

        }


        movieTopInit();

        movieCinemaInit();

        movieImgInit();


        moviePullToRefresh.setOnHeaderRefreshListener(new PullToRefreshView.OnHeaderRefreshListener() {
            @Override
            public void onHeaderRefresh(PullToRefreshView view) {
                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        moviePullToRefresh.onHeaderRefreshComplete();
                    }
                }, 1000);
            }
        });

        moviePullToRefresh.setOnFooterRefreshListener(new PullToRefreshView.OnFooterRefreshListener() {
            @Override
            public void onFooterRefresh(PullToRefreshView view) {
                view.postDelayed(new Runnable() {
                    public void run() {

                        moviePullToRefresh.onFooterRefreshComplete();
                    }
                }, 1000);
            }
        });
        moviePullToRefresh.setFooter(true);


//        movieLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getActivity(), MovieSelectActivity.class);
//                intent.
//                getActivity().startActivity(intent);
//            }
//        });

        myScorllView.setOnScrollListener(this);


        parentLl.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                onScroll(myScorllView.getScrollY());
      //          System.out.println(myScorllView.getScrollY());
            }
        });

//      .getViewTreeObserver().addOnGlobalFocusChangeListener(new OnGlobalLayoutListener(){
//
//          @Override
//          public void onGlobalLayout() {
//              onScroll(myScorllView.getScrollY());
//
//              System.out.println(myScorllView.getScrollY());
//          }
//      });
        return view;
    }


    //头部信息
    private void movieTopInit() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtil.getMovieHotShowTop(getContext());
                MovieHotShowingTops movieHotShowingTops = JsonUtil.parseMovieHotShowingTops(json);
                Message message = handler.obtainMessage();
                message.what = Config.MSG_MOVIE_HSI;
                message.obj = movieHotShowingTops;
                handler.sendMessage(message);
            }
        });
    }

    //影院信息
    private void movieCinemaInit() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {

                MovieHotShowingFD movieHotShowingFD = JsonUtil.parseMovieHotShowingFD(MovieHotShowingListFakeDate.cinemaDate);
                Message message = handler.obtainMessage();
                message.what = Config.MSG_MOVIE_HSII;
                message.obj = movieHotShowingFD;
                handler.sendMessage(message);
            }
        });
    }


    private void movieImgInit() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                MovieSelectMovie movieSelectMovie = JsonUtil.parseMovieSelectMovie(MovieHotShowingListFakeDate.movieDate);
                Message message = handler.obtainMessage();
                message.what = Config.MSG_MOVIE_HSIII;
                message.obj = movieSelectMovie;
                handler.sendMessage(message);
            }
        });
    }

    private void MovieInit( List<MovieSelectMovie.DataBean.MoviesBean> mList) {
        movieTestAdapter = new MovieTestAdapter(getContext(), mList);

        //设置布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        idRecyclerviewHorizontal.setLayoutManager(linearLayoutManager);
        //设置适配器
        movieTestAdapter = new MovieTestAdapter(getContext(), mList);
        idRecyclerviewHorizontal.setAdapter(movieTestAdapter);
    }


    //顶部图片轮播循环
    private void autoPlayByThread(final boolean b) {
        if (b) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true && getActivity() != null) {
                        /**
                         * 操作UI必须在主线程执行！
                         */
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                vpMovie.setCurrentItem(vpMovie.getCurrentItem() + 1);
                            }
                        });

                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        autoPlayByThread(false);
    }

    private void ViewPageInit() {
        views = new View[urlList.size()];

        switch (urlList.size()) {
            case 2:
                movieTopRb1.setVisibility(View.VISIBLE);
                movieTopRb2.setVisibility(View.VISIBLE);
                movieTopRb3.setVisibility(View.GONE);
                movieTopRb4.setVisibility(View.GONE);
                movieTopRb5.setVisibility(View.GONE);
                movieTopRb6.setVisibility(View.GONE);
                break;
            case 3:
                movieTopRb1.setVisibility(View.VISIBLE);
                movieTopRb2.setVisibility(View.VISIBLE);
                movieTopRb3.setVisibility(View.VISIBLE);
                movieTopRb4.setVisibility(View.GONE);
                movieTopRb5.setVisibility(View.GONE);
                movieTopRb6.setVisibility(View.GONE);
                break;
            case 4:
                movieTopRb1.setVisibility(View.VISIBLE);
                movieTopRb2.setVisibility(View.VISIBLE);
                movieTopRb3.setVisibility(View.VISIBLE);
                movieTopRb4.setVisibility(View.VISIBLE);
                movieTopRb5.setVisibility(View.GONE);
                movieTopRb6.setVisibility(View.GONE);
                break;
            case 5:
                movieTopRb1.setVisibility(View.VISIBLE);
                movieTopRb2.setVisibility(View.VISIBLE);
                movieTopRb3.setVisibility(View.VISIBLE);
                movieTopRb4.setVisibility(View.VISIBLE);
                movieTopRb5.setVisibility(View.VISIBLE);
                movieTopRb6.setVisibility(View.GONE);
                break;
        }
        for (int i = 0; i < views.length; i++) {
            views[i] = LayoutInflater.from(getContext()).inflate(R.layout.movie_hotshowing_top_fragment, null, false);
            ImageView draweeView = (ImageView) views[i].findViewById(R.id.movie_hs_tf_tv);
            Glide.with(getContext())
                    .load(Uri.parse(urlList.get(i)))
                    .skipMemoryCache(false)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(draweeView);
        }

        vpMovie.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return Integer.MAX_VALUE;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                View view = views[position % views.length];

                if (container.indexOfChild(view) != -1) {
                    container.removeView(view);
                }
                container.addView(view);

                return view;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {

            }
        });

        vpMovie.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                int i = position % views.length;
                switch (i) {
                    case 0:
                        movieTopRb1.setChecked(true);
                        break;
                    case 1:
                        movieTopRb2.setChecked(true);
                        break;
                    case 2:
                        movieTopRb3.setChecked(true);
                        break;
                    case 3:
                        movieTopRb4.setChecked(true);
                        break;
                    case 4:
                        movieTopRb5.setChecked(true);
                        break;
                    case 5:
                        movieTopRb6.setChecked(true);
                        break;

                }
//                rb[i].setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onScroll(int scrollY) {
        int mBuyLayout2ParentTop = Math.max(scrollY, centerLl.getTop());
        topLl.layout(0, mBuyLayout2ParentTop, topLl.getWidth(), mBuyLayout2ParentTop + topLl.getHeight());
    }
}
