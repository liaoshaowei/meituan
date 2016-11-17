package com.xugang.meituan.model;

import java.util.List;

/**
 * Created by Administrator on 2016/11/2 0002.
 */
public class MovieSelectHeader {

    /**
     * code : 0
     * data : {"addr":"天河区长兴路13号优托邦购物中心3楼（近天河客运站150米处）","buyoutInfo":{"desc":"包场观影","icon":"http://p1.meituan.net/movie/a5265bfe8a02dac320cf5d874842b3482974.png","title":"包场观影","url":"http://m.maoyan.com/baochang/index/1410?_v_=yes"},"cinemaId":1410,"featureTags":[{"desc":"限网上选座后取票","tag":"取票机","url":"http://m.maoyan.com/poi/machine/1466645"},{"desc":"3D电影儿童半价","tag":"儿童优惠"},{"desc":"高德汇购物中心有大量停车位，电影观众凭票面可以3小时免费停车。","tag":"可停车"}],"follow":0,"lat":23.170547,"lng":113.34833,"nm":"横店电影城(高德汇店)","poiId":1466645,"s":3.9,"saleInfo":{"content":"小吃、周边12.9元起","desc":"小吃周边","hasProm":0,"icon":"http://p1.meituan.net/movie/d529ee002dccb65ef5e52191aedaee8d2050.png","lstPrice":12.9,"title":"观影套餐"},"sell":true,"tel":"020-85605980"}
     * success : true
     */

    private int code;
    /**
     * addr : 天河区长兴路13号优托邦购物中心3楼（近天河客运站150米处）
     * buyoutInfo : {"desc":"包场观影","icon":"http://p1.meituan.net/movie/a5265bfe8a02dac320cf5d874842b3482974.png","title":"包场观影","url":"http://m.maoyan.com/baochang/index/1410?_v_=yes"}
     * cinemaId : 1410
     * featureTags : [{"desc":"限网上选座后取票","tag":"取票机","url":"http://m.maoyan.com/poi/machine/1466645"},{"desc":"3D电影儿童半价","tag":"儿童优惠"},{"desc":"高德汇购物中心有大量停车位，电影观众凭票面可以3小时免费停车。","tag":"可停车"}]
     * follow : 0
     * lat : 23.170547
     * lng : 113.34833
     * nm : 横店电影城(高德汇店)
     * poiId : 1466645
     * s : 3.9
     * saleInfo : {"content":"小吃、周边12.9元起","desc":"小吃周边","hasProm":0,"icon":"http://p1.meituan.net/movie/d529ee002dccb65ef5e52191aedaee8d2050.png","lstPrice":12.9,"title":"观影套餐"}
     * sell : true
     * tel : 020-85605980
     */

    private DataBean data;
    private boolean success;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class DataBean {
        private String addr;
        /**
         * desc : 包场观影
         * icon : http://p1.meituan.net/movie/a5265bfe8a02dac320cf5d874842b3482974.png
         * title : 包场观影
         * url : http://m.maoyan.com/baochang/index/1410?_v_=yes
         */

        private BuyoutInfoBean buyoutInfo;
        private int cinemaId;
        private int follow;
        private double lat;
        private double lng;
        private String nm;
        private int poiId;
        private double s;
        /**
         * content : 小吃、周边12.9元起
         * desc : 小吃周边
         * hasProm : 0
         * icon : http://p1.meituan.net/movie/d529ee002dccb65ef5e52191aedaee8d2050.png
         * lstPrice : 12.9
         * title : 观影套餐
         */

        private SaleInfoBean saleInfo;
        private boolean sell;
        private String tel;
        /**
         * desc : 限网上选座后取票
         * tag : 取票机
         * url : http://m.maoyan.com/poi/machine/1466645
         */

        private List<FeatureTagsBean> featureTags;

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public BuyoutInfoBean getBuyoutInfo() {
            return buyoutInfo;
        }

        public void setBuyoutInfo(BuyoutInfoBean buyoutInfo) {
            this.buyoutInfo = buyoutInfo;
        }

        public int getCinemaId() {
            return cinemaId;
        }

        public void setCinemaId(int cinemaId) {
            this.cinemaId = cinemaId;
        }

        public int getFollow() {
            return follow;
        }

        public void setFollow(int follow) {
            this.follow = follow;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

        public String getNm() {
            return nm;
        }

        public void setNm(String nm) {
            this.nm = nm;
        }

        public int getPoiId() {
            return poiId;
        }

        public void setPoiId(int poiId) {
            this.poiId = poiId;
        }

        public double getS() {
            return s;
        }

        public void setS(double s) {
            this.s = s;
        }

        public SaleInfoBean getSaleInfo() {
            return saleInfo;
        }

        public void setSaleInfo(SaleInfoBean saleInfo) {
            this.saleInfo = saleInfo;
        }

        public boolean isSell() {
            return sell;
        }

        public void setSell(boolean sell) {
            this.sell = sell;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public List<FeatureTagsBean> getFeatureTags() {
            return featureTags;
        }

        public void setFeatureTags(List<FeatureTagsBean> featureTags) {
            this.featureTags = featureTags;
        }

        public static class BuyoutInfoBean {
            private String desc;
            private String icon;
            private String title;
            private String url;

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class SaleInfoBean {
            private String content;
            private String desc;
            private int hasProm;
            private String icon;
            private double lstPrice;
            private String title;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public int getHasProm() {
                return hasProm;
            }

            public void setHasProm(int hasProm) {
                this.hasProm = hasProm;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public double getLstPrice() {
                return lstPrice;
            }

            public void setLstPrice(double lstPrice) {
                this.lstPrice = lstPrice;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class FeatureTagsBean {
            private String desc;
            private String tag;
            private String url;

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
