package com.xugang.meituan.util;

import com.google.gson.Gson;
import com.xugang.meituan.model.HuoGuo;
import com.xugang.meituan.model.MainI;
import com.xugang.meituan.model.MainII;
import com.xugang.meituan.model.MainLikes;
import com.xugang.meituan.model.MovieHotShowingFD;
import com.xugang.meituan.model.MovieHotShowingTops;
import com.xugang.meituan.model.MovieSelectMovie;
import com.xugang.meituan.model.PingLun;
import com.xugang.meituan.model.SearchBean;
import com.xugang.meituan.model.SearchResult;
import com.xugang.meituan.model.TuiJian;

/**
 * Created by ASUS on 2016-10-31.
 */
public class JsonUtil {
    public static MainLikes parseMainLikes(String json) {
        return new Gson().fromJson(json, MainLikes.class);
    }

    public static MainI parseMainI(String json) {
        return new Gson().fromJson(json, MainI.class);
    }

    public static MainII parseMainII(String json) {
        return new Gson().fromJson(json, MainII.class);
    }

    public static MovieHotShowingTops parseMovieHotShowingTops(String json) {
        return new Gson().fromJson(json, MovieHotShowingTops.class);
    }

    public static MovieHotShowingFD parseMovieHotShowingFD(String json) {
        return new Gson().fromJson(json, MovieHotShowingFD.class);
    }

    public static MovieSelectMovie parseMovieSelectMovie(String json) {
        return new Gson().fromJson(json, MovieSelectMovie.class);
    }

    public static HuoGuo parseHuoGuo(String json) {
        return new Gson().fromJson(json, HuoGuo.class);
    }

    public static PingLun parsePingLun(String json) {
        return new Gson().fromJson(json, PingLun.class);
    }

    public static TuiJian parseTuiJian(String json) {
        return new Gson().fromJson(json, TuiJian.class);
    }

    public static SearchBean parseSearchBean(String json) {
        return new Gson().fromJson(json, SearchBean.class);
    }

    public static SearchResult parseSearchResultBean(String json) {
        return new Gson().fromJson(json, SearchResult.class);
    }
}
