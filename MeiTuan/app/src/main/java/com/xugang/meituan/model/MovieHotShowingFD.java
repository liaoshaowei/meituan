package com.xugang.meituan.model;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class MovieHotShowingFD {
    /**
     * code : 0
     * data : {"cinemas":[{"addr":"天河区长兴路13号优托邦购物中心3楼（近天河客运站150米处）","cityId":20,"distance":"1.0km","follow":0,"id":1410,"lat":23.170547,"lng":113.34833,"mark":0,"nm":"横店电影城(高德汇店)","poiId":1466645,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"70","sellPrice":"9.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":0,"hallType":[],"sell":1,"snack":1}},{"addr":"白云区广州大道北1811号嘉裕太阳城广场3楼（南方医院正对面）","cityId":20,"distance":"1.9km","follow":0,"id":106,"lat":23.187557,"lng":113.32745,"mark":0,"nm":"金逸影城(太阳城店)","poiId":657260,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"70","sellPrice":"9.9","tag":{"allowRefund":0,"buyout":0,"deal":1,"endorse":0,"sell":1,"snack":1}},{"addr":"白云区广州大道北28号梅花园商业广场5楼","cityId":20,"distance":"2.1km","follow":0,"id":1644,"lat":23.17846,"lng":113.320724,"mark":0,"nm":"华影梅花园影城","poiId":1416235,"promotion":{"platformActivityTag":"捉迷藏特惠","starActivityTag":"外公芳龄38明星见面会"},"referencePrice":"40","sellPrice":"20.4","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"sell":1,"snack":1,"vipTag":"会员卡"}},{"addr":"天河区东莞庄路世纪联华2楼（富力院士庭）","cityId":20,"distance":"2.7km","follow":0,"id":1643,"lat":23.15217,"lng":113.33664,"mark":0,"nm":"飞影电影城","poiId":1169467,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"36","sellPrice":"18.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":0,"sell":1,"snack":1}},{"addr":"白云区广州大道北同和街1号金铂广场4楼","cityId":20,"distance":"2.7km","follow":0,"id":14695,"lat":23.196184,"lng":113.3256,"mark":0,"nm":"中影凤凰影城(同和店)","poiId":93460181,"promotion":{},"referencePrice":"0","sellPrice":"22.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"hallType":["4K厅"],"sell":1,"snack":1,"vipTag":"会员卡"}},{"addr":"天河区迎龙大道168号（工业大学旁，近龙洞步行街）","cityId":20,"distance":"3.5km","follow":0,"id":6134,"lat":23.198084,"lng":113.36458,"mark":0,"nm":"天影国际电影城","poiId":1538459,"promotion":{"platformActivityTag":"湄公河行动等2部影片特惠"},"referencePrice":"0","sellPrice":"22.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"sell":1,"snack":1}},{"addr":"天河区天河北路711-713号曜和广场C座3楼","cityId":20,"distance":"3.8km","follow":0,"id":2062,"lat":23.14194,"lng":113.34548,"mark":0,"nm":"中影乐佳影城","poiId":1465628,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"30","sellPrice":"19.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"sell":1,"snack":1,"vipTag":"会员卡"}},{"addr":"天河区天河路623号天娱广场5楼（近地铁3号线岗顶站A出口）","cityId":20,"distance":"4.5km","follow":0,"id":211,"lat":23.135674,"lng":113.339775,"mark":0,"nm":"天河电影城(天娱广场店)","poiId":85597,"promotion":{"platformActivityTag":"但丁密码等4部影片特惠"},"referencePrice":"80","sellPrice":"25.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"hallType":["杜比全景声厅"],"sell":1,"snack":1,"vipTag":"折扣卡"}},{"addr":"天河区天河路228号正佳购物广场7楼（近体育中心）","cityId":20,"distance":"5.1km","follow":0,"id":207,"lat":23.131994,"lng":113.326904,"mark":0,"nm":"飞扬影城(正佳店)","poiId":623333,"promotion":{},"referencePrice":"80","sellPrice":"34","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":0,"hallType":["IMAX厅"],"sell":1,"snack":1}},{"addr":"天河区天河路212、214、216、218、220号天环广场地下一层B117铺","cityId":20,"distance":"5.1km","follow":0,"id":16408,"lat":23.132265,"lng":113.324814,"mark":0,"nm":"百丽宫影城(天环店)","poiId":97726560,"promotion":{},"referencePrice":"0","sellPrice":"43","tag":{"allowRefund":0,"buyout":0,"deal":0,"endorse":0,"sell":1,"snack":0}},{"addr":"天河区天河路208号天河城广场4楼","cityId":20,"distance":"5.2km","follow":0,"id":210,"lat":23.131935,"lng":113.32245,"mark":0,"nm":"飞扬影城(天河城店)","poiId":83444,"promotion":{},"referencePrice":"80","sellPrice":"34","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"sell":1,"snack":1}},{"addr":"天河区黄埔大道西120号高志大厦4楼","cityId":20,"distance":"5.6km","follow":0,"id":16180,"lat":23.125715,"lng":113.340126,"mark":0,"nm":"中影南方WE影城(高志店)","poiId":82852411,"promotion":{"platformActivityTag":"但丁密码等4部影片特惠"},"referencePrice":"0","sellPrice":"9.9","tag":{"allowRefund":1,"buyout":0,"deal":1,"endorse":1,"sell":1,"snack":1,"vipTag":"折扣卡"}},{"addr":"天河区珠江新城花城广场花城汇B1楼1130铺（花城广场入口靠近黄埔大道）","cityId":20,"distance":"5.7km","follow":0,"id":1676,"lat":23.126347,"lng":113.32464,"mark":0,"nm":"ua花城汇影院","poiId":1448425,"promotion":{},"referencePrice":"70","sellPrice":"39","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":0,"hallType":["IMAX厅"],"sell":1,"snack":1,"vipTag":"折扣卡"}},{"addr":"天河区黄埔大道西188号维家思广场3楼（富力盈隆广场对面）","cityId":20,"distance":"5.8km","follow":0,"id":208,"lat":23.125294,"lng":113.327354,"mark":0,"nm":"金逸国际影城(维家思店)","poiId":623314,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"80","sellPrice":"25.9","tag":{"allowRefund":0,"buyout":0,"deal":1,"endorse":0,"hallType":["杜比全景声厅"],"sell":1,"snack":1}},{"addr":"天河区马场路36号太阳新天地八楼（近中国联通）","cityId":20,"distance":"5.8km","follow":0,"id":2505,"lat":23.12362,"lng":113.3443,"mark":0,"nm":"中影国际影城(太阳新天地店)","poiId":1535757,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"40","sellPrice":"9.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"hallType":["杜比全景声厅"],"sell":1,"snack":1,"vipTag":"会员卡"}}],"ct_pois":[{"ct_poi":"936879945111165696_a1410_c0","poiid":1466645},{"ct_poi":"936879945111165696_a106_c1","poiid":657260},{"ct_poi":"936879945111165696_a1644_c2","poiid":1416235},{"ct_poi":"936879945111165696_a1643_c3","poiid":1169467},{"ct_poi":"936879945111165696_a14695_c4","poiid":93460181},{"ct_poi":"936879945111165696_a6134_c5","poiid":1538459},{"ct_poi":"936879945111165696_a2062_c6","poiid":1465628},{"ct_poi":"936879945111165696_a211_c7","poiid":85597},{"ct_poi":"936879945111165696_a207_c8","poiid":623333},{"ct_poi":"936879945111165696_a16408_c9","poiid":97726560},{"ct_poi":"936879945111165696_a210_c10","poiid":83444},{"ct_poi":"936879945111165696_a16180_c11","poiid":82852411},{"ct_poi":"936879945111165696_a1676_c12","poiid":1448425},{"ct_poi":"936879945111165696_a208_c13","poiid":623314},{"ct_poi":"936879945111165696_a2505_c14","poiid":1535757}],"paging":{"hasMore":true,"limit":15,"offset":0,"total":135}}
     * success : true
     */

    private int code;
    /**
     * cinemas : [{"addr":"天河区长兴路13号优托邦购物中心3楼（近天河客运站150米处）","cityId":20,"distance":"1.0km","follow":0,"id":1410,"lat":23.170547,"lng":113.34833,"mark":0,"nm":"横店电影城(高德汇店)","poiId":1466645,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"70","sellPrice":"9.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":0,"hallType":[],"sell":1,"snack":1}},{"addr":"白云区广州大道北1811号嘉裕太阳城广场3楼（南方医院正对面）","cityId":20,"distance":"1.9km","follow":0,"id":106,"lat":23.187557,"lng":113.32745,"mark":0,"nm":"金逸影城(太阳城店)","poiId":657260,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"70","sellPrice":"9.9","tag":{"allowRefund":0,"buyout":0,"deal":1,"endorse":0,"sell":1,"snack":1}},{"addr":"白云区广州大道北28号梅花园商业广场5楼","cityId":20,"distance":"2.1km","follow":0,"id":1644,"lat":23.17846,"lng":113.320724,"mark":0,"nm":"华影梅花园影城","poiId":1416235,"promotion":{"platformActivityTag":"捉迷藏特惠","starActivityTag":"外公芳龄38明星见面会"},"referencePrice":"40","sellPrice":"20.4","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"sell":1,"snack":1,"vipTag":"会员卡"}},{"addr":"天河区东莞庄路世纪联华2楼（富力院士庭）","cityId":20,"distance":"2.7km","follow":0,"id":1643,"lat":23.15217,"lng":113.33664,"mark":0,"nm":"飞影电影城","poiId":1169467,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"36","sellPrice":"18.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":0,"sell":1,"snack":1}},{"addr":"白云区广州大道北同和街1号金铂广场4楼","cityId":20,"distance":"2.7km","follow":0,"id":14695,"lat":23.196184,"lng":113.3256,"mark":0,"nm":"中影凤凰影城(同和店)","poiId":93460181,"promotion":{},"referencePrice":"0","sellPrice":"22.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"hallType":["4K厅"],"sell":1,"snack":1,"vipTag":"会员卡"}},{"addr":"天河区迎龙大道168号（工业大学旁，近龙洞步行街）","cityId":20,"distance":"3.5km","follow":0,"id":6134,"lat":23.198084,"lng":113.36458,"mark":0,"nm":"天影国际电影城","poiId":1538459,"promotion":{"platformActivityTag":"湄公河行动等2部影片特惠"},"referencePrice":"0","sellPrice":"22.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"sell":1,"snack":1}},{"addr":"天河区天河北路711-713号曜和广场C座3楼","cityId":20,"distance":"3.8km","follow":0,"id":2062,"lat":23.14194,"lng":113.34548,"mark":0,"nm":"中影乐佳影城","poiId":1465628,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"30","sellPrice":"19.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"sell":1,"snack":1,"vipTag":"会员卡"}},{"addr":"天河区天河路623号天娱广场5楼（近地铁3号线岗顶站A出口）","cityId":20,"distance":"4.5km","follow":0,"id":211,"lat":23.135674,"lng":113.339775,"mark":0,"nm":"天河电影城(天娱广场店)","poiId":85597,"promotion":{"platformActivityTag":"但丁密码等4部影片特惠"},"referencePrice":"80","sellPrice":"25.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"hallType":["杜比全景声厅"],"sell":1,"snack":1,"vipTag":"折扣卡"}},{"addr":"天河区天河路228号正佳购物广场7楼（近体育中心）","cityId":20,"distance":"5.1km","follow":0,"id":207,"lat":23.131994,"lng":113.326904,"mark":0,"nm":"飞扬影城(正佳店)","poiId":623333,"promotion":{},"referencePrice":"80","sellPrice":"34","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":0,"hallType":["IMAX厅"],"sell":1,"snack":1}},{"addr":"天河区天河路212、214、216、218、220号天环广场地下一层B117铺","cityId":20,"distance":"5.1km","follow":0,"id":16408,"lat":23.132265,"lng":113.324814,"mark":0,"nm":"百丽宫影城(天环店)","poiId":97726560,"promotion":{},"referencePrice":"0","sellPrice":"43","tag":{"allowRefund":0,"buyout":0,"deal":0,"endorse":0,"sell":1,"snack":0}},{"addr":"天河区天河路208号天河城广场4楼","cityId":20,"distance":"5.2km","follow":0,"id":210,"lat":23.131935,"lng":113.32245,"mark":0,"nm":"飞扬影城(天河城店)","poiId":83444,"promotion":{},"referencePrice":"80","sellPrice":"34","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"sell":1,"snack":1}},{"addr":"天河区黄埔大道西120号高志大厦4楼","cityId":20,"distance":"5.6km","follow":0,"id":16180,"lat":23.125715,"lng":113.340126,"mark":0,"nm":"中影南方WE影城(高志店)","poiId":82852411,"promotion":{"platformActivityTag":"但丁密码等4部影片特惠"},"referencePrice":"0","sellPrice":"9.9","tag":{"allowRefund":1,"buyout":0,"deal":1,"endorse":1,"sell":1,"snack":1,"vipTag":"折扣卡"}},{"addr":"天河区珠江新城花城广场花城汇B1楼1130铺（花城广场入口靠近黄埔大道）","cityId":20,"distance":"5.7km","follow":0,"id":1676,"lat":23.126347,"lng":113.32464,"mark":0,"nm":"ua花城汇影院","poiId":1448425,"promotion":{},"referencePrice":"70","sellPrice":"39","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":0,"hallType":["IMAX厅"],"sell":1,"snack":1,"vipTag":"折扣卡"}},{"addr":"天河区黄埔大道西188号维家思广场3楼（富力盈隆广场对面）","cityId":20,"distance":"5.8km","follow":0,"id":208,"lat":23.125294,"lng":113.327354,"mark":0,"nm":"金逸国际影城(维家思店)","poiId":623314,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"80","sellPrice":"25.9","tag":{"allowRefund":0,"buyout":0,"deal":1,"endorse":0,"hallType":["杜比全景声厅"],"sell":1,"snack":1}},{"addr":"天河区马场路36号太阳新天地八楼（近中国联通）","cityId":20,"distance":"5.8km","follow":0,"id":2505,"lat":23.12362,"lng":113.3443,"mark":0,"nm":"中影国际影城(太阳新天地店)","poiId":1535757,"promotion":{"platformActivityTag":"捉迷藏特惠"},"referencePrice":"40","sellPrice":"9.9","tag":{"allowRefund":0,"buyout":1,"deal":1,"endorse":1,"hallType":["杜比全景声厅"],"sell":1,"snack":1,"vipTag":"会员卡"}}]
     * ct_pois : [{"ct_poi":"936879945111165696_a1410_c0","poiid":1466645},{"ct_poi":"936879945111165696_a106_c1","poiid":657260},{"ct_poi":"936879945111165696_a1644_c2","poiid":1416235},{"ct_poi":"936879945111165696_a1643_c3","poiid":1169467},{"ct_poi":"936879945111165696_a14695_c4","poiid":93460181},{"ct_poi":"936879945111165696_a6134_c5","poiid":1538459},{"ct_poi":"936879945111165696_a2062_c6","poiid":1465628},{"ct_poi":"936879945111165696_a211_c7","poiid":85597},{"ct_poi":"936879945111165696_a207_c8","poiid":623333},{"ct_poi":"936879945111165696_a16408_c9","poiid":97726560},{"ct_poi":"936879945111165696_a210_c10","poiid":83444},{"ct_poi":"936879945111165696_a16180_c11","poiid":82852411},{"ct_poi":"936879945111165696_a1676_c12","poiid":1448425},{"ct_poi":"936879945111165696_a208_c13","poiid":623314},{"ct_poi":"936879945111165696_a2505_c14","poiid":1535757}]
     * paging : {"hasMore":true,"limit":15,"offset":0,"total":135}
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
        /**
         * hasMore : true
         * limit : 15
         * offset : 0
         * total : 135
         */

        private PagingBean paging;
        /**
         * addr : 天河区长兴路13号优托邦购物中心3楼（近天河客运站150米处）
         * cityId : 20
         * distance : 1.0km
         * follow : 0
         * id : 1410
         * lat : 23.170547
         * lng : 113.34833
         * mark : 0
         * nm : 横店电影城(高德汇店)
         * poiId : 1466645
         * promotion : {"platformActivityTag":"捉迷藏特惠"}
         * referencePrice : 70
         * sellPrice : 9.9
         * tag : {"allowRefund":0,"buyout":1,"deal":1,"endorse":0,"hallType":[],"sell":1,"snack":1}
         */

        private List<CinemasBean> cinemas;
        /**
         * ct_poi : 936879945111165696_a1410_c0
         * poiid : 1466645
         */

        private List<CtPoisBean> ct_pois;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<CinemasBean> getCinemas() {
            return cinemas;
        }

        public void setCinemas(List<CinemasBean> cinemas) {
            this.cinemas = cinemas;
        }

        public List<CtPoisBean> getCt_pois() {
            return ct_pois;
        }

        public void setCt_pois(List<CtPoisBean> ct_pois) {
            this.ct_pois = ct_pois;
        }

        public static class PagingBean {
            private boolean hasMore;
            private int limit;
            private int offset;
            private int total;

            public boolean isHasMore() {
                return hasMore;
            }

            public void setHasMore(boolean hasMore) {
                this.hasMore = hasMore;
            }

            public int getLimit() {
                return limit;
            }

            public void setLimit(int limit) {
                this.limit = limit;
            }

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }

        public static class CinemasBean {
            private String addr;
            private int cityId;
            private String distance;
            private int follow;
            private int id;
            private double lat;
            private double lng;
            private int mark;
            private String nm;
            private int poiId;
            /**
             * platformActivityTag : 捉迷藏特惠
             */

            private PromotionBean promotion;
            private String referencePrice;
            private String sellPrice;
            /**
             * allowRefund : 0
             * buyout : 1
             * deal : 1
             * endorse : 0
             * hallType : []
             * sell : 1
             * snack : 1
             */

            private TagBean tag;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getCityId() {
                return cityId;
            }

            public void setCityId(int cityId) {
                this.cityId = cityId;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
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

            public int getMark() {
                return mark;
            }

            public void setMark(int mark) {
                this.mark = mark;
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

            public PromotionBean getPromotion() {
                return promotion;
            }

            public void setPromotion(PromotionBean promotion) {
                this.promotion = promotion;
            }

            public String getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(String referencePrice) {
                this.referencePrice = referencePrice;
            }

            public String getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(String sellPrice) {
                this.sellPrice = sellPrice;
            }

            public TagBean getTag() {
                return tag;
            }

            public void setTag(TagBean tag) {
                this.tag = tag;
            }

            public static class PromotionBean {
                private String platformActivityTag;

                public String getPlatformActivityTag() {
                    return platformActivityTag;
                }

                public void setPlatformActivityTag(String platformActivityTag) {
                    this.platformActivityTag = platformActivityTag;
                }
            }

            public static class TagBean {
                private int allowRefund;
                private int buyout;
                private int deal;
                private int endorse;
                private int sell;
                private int snack;
                private List<?> hallType;

                public int getAllowRefund() {
                    return allowRefund;
                }

                public void setAllowRefund(int allowRefund) {
                    this.allowRefund = allowRefund;
                }

                public int getBuyout() {
                    return buyout;
                }

                public void setBuyout(int buyout) {
                    this.buyout = buyout;
                }

                public int getDeal() {
                    return deal;
                }

                public void setDeal(int deal) {
                    this.deal = deal;
                }

                public int getEndorse() {
                    return endorse;
                }

                public void setEndorse(int endorse) {
                    this.endorse = endorse;
                }

                public int getSell() {
                    return sell;
                }

                public void setSell(int sell) {
                    this.sell = sell;
                }

                public int getSnack() {
                    return snack;
                }

                public void setSnack(int snack) {
                    this.snack = snack;
                }

                public List<?> getHallType() {
                    return hallType;
                }

                public void setHallType(List<?> hallType) {
                    this.hallType = hallType;
                }
            }
        }

        public static class CtPoisBean {
            private String ct_poi;
            private int poiid;

            public String getCt_poi() {
                return ct_poi;
            }

            public void setCt_poi(String ct_poi) {
                this.ct_poi = ct_poi;
            }

            public int getPoiid() {
                return poiid;
            }

            public void setPoiid(int poiid) {
                this.poiid = poiid;
            }
        }
    }
}
