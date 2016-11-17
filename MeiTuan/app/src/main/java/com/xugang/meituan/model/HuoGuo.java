package com.xugang.meituan.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ASUS on 2016-11-02.
 */
public class HuoGuo {

    /**
     * ktvplan : {}
     * mealcount : []
     * deposit : 0
     * tag : {}
     * terms : [{"content":["除酒水饮料外全场通用"],"title":"适用范围"},{"content":["2015.4.1 至 2016.11.30"],"title":"有效期"},{"content":["盐城傣妹火锅（建军东路店）周六，周日 ，法定节假日不可使用"],"title":"不可用日期"},{"content":["10:00-22:00"],"title":"使用时间"},{"content":["无需预约，消费高峰时可能需要等位","可叠加使用\n不兑现、不找零","店内无包间","仅限堂食，不提供餐前外带，餐毕未吃完可免费打包","团购用户不可同时享受商家其他优惠\n酒水饮料等问题，请致电商家咨询，以商家反馈为准","提供免费WiFi\n停车位收费标准：咨询商家","本单发票由商家提供，请在消费时向商家索取"],"title":"使用规则"}]
     * solds : 390132
     * festcanuse : 0
     * newrating : {"count":45482,"subcount":{"3":10595,"2":3084,"1":984,"5":17915,"4":12904},"rating":"3.9","recommend":91}
     * value : 50
     * dtype : 0
     * rate-count : 45482
     * imgurl : http://p0.meituan.net/w.h/deal/e2ff321002ecc8dc6feb01938eea346572962.jpg
     * pricecalendar : [{"endtime":0,"id":0,"desc":"平日","starttime":0,"price":45,"canbuyprice":-1,"range":[],"dealid":28634464,"buyprice":0,"type":1}]
     * optionalattrs : {"11":"{\"endDate\":\"\",\"specialCondition\":\"盐城傣妹火锅（建军东路店）周六，周日 ，法定节假日不可使用\",\"startDate\":\"\",\"useDay\":\"1\"}","13":"1"}
     * status : 0
     * bookingphone :
     * menu : [[{"content":"代金券","total":"50","price":"50","subtype":2,"specification":"1张","type":"128"},{"content":"店内人均消费参考价：38元","subtype":4,"type":"0"},{"content":"适用范围：除酒水饮料外全场通用","subtype":4,"type":"0"},{"content":"店内部分菜品价格参考：鱼丸（4.00元/份）虾丸（5.50元/份）","subtype":4,"type":"0"}]]
     * bookinginfo :
     * fakerefund : 0
     * campaigns : [{"longtitle":"新用户首购立减15元，限购1份","logo":"减","infourl":"http://i.meituan.com/firework/1yuanguize","color":"","tag":"新用户立减15元","buystatus":2,"festival":"","type":3,"shorttag":""}]
     * poiids : [1712670,5058275,71955095,894956,1710418,649133,1464514,84463766,42587901,6100749,40024129,2571566,91505336,5483889,41372497,4661103,2493717,2709448,1592688,1189130,1228357,1150728,2534349,42190945,2111429,42707174,41328773,631428,95347695,40191839]
     * price : 45
     * expireautorefund : 1
     * start : 1427865259
     * satisfaction : 67
     * payType : 0
     * slug : 28634464
     * isAvailableToday : true
     * dt : 237
     * securityinfo : []
     * cate : 1
     * range : 全国
     * voice :
     * curcityrdcount : 8
     * todayavaliable : true
     * state : 32
     * squareimgurl : http://p1.meituan.net/w.h/deal/51c17a0a48e2a7b7e1f8c78dd633673031379.jpg
     * mlls : 23.155636,113.235022;23.117078,113.614616;23.191391,113.259496;23.33514,113.295593;22.941485,113.365805;23.11571,113.249125;23.122841,113.267172;23.113471,113.24584
     * rdploc : [{"canSelfVerify":false,"multiType":"food,","phone":"020-86496913","districtname":"白云区","markNumbers":2691,"cityId":20,"areaid":1491,"frontimg":"http://p1.meituan.net/w.h/deal/__9351934__7071577.jpg","addr":"白云区西槎路99号鹅掌坦骐利广场三楼","lng":113.235022,"ktvAppointStatus":0,"brandId":0,"city":20,"poiid":1712670,"traffic":"","areaName":"同德围","avgScore":3.9,"iUrl":"","name":"傣妹火锅（同德围店）","showType":"food","showStatus":1,"isQueuing":0,"bizloginid":0,"districtid":26,"lat":23.155636}]
     * id : 28634464
     * title : 50元代金券1张，可叠加，免预约
     * refund : 3
     * coupontitle : 仅售45元！价值50元的代金券1张，除酒水饮料外全场通用，可叠加使用，提供免费WiFi。
     * murl :
     * end : 1480485600
     * campaignprice : 30
     * mname : 傣妹火锅
     * rdcount : 8
     * brandname : 傣妹火锅
     * isappointonline : false
     * ctype : 0
     * showtype : normal
     * subcate : 278,284,189
     * frontPoiCates : 402,17,1,393
     * sevenrefund : 0
     * howuse : {}
     * attrJson : [{"iconname":"免费WiFi","status":1,"key":3}]
     * canbuyprice : 30
     * iUrl :
     * digestion : 50元代金券1张，可叠加
     * rating : 3.9
     * channel : food
     * nobooking : 1
     */

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private KtvplanBean ktvplan;
        private String mealcount;
        private int deposit;
        private TagBean tag;
        private int solds;
        private int festcanuse;
        /**
         * count : 45482
         * subcount : {"3":10595,"2":3084,"1":984,"5":17915,"4":12904}
         * rating : 3.9
         * recommend : 91
         */

        private NewratingBean newrating;
        private int value;
        private int dtype;
        @SerializedName("rate-count")
        private int rateCount;
        private String imgurl;
        /**
         * 11 : {"endDate":"","specialCondition":"盐城傣妹火锅（建军东路店）周六，周日 ，法定节假日不可使用","startDate":"","useDay":"1"}
         * 13 : 1
         */

        private OptionalattrsBean optionalattrs;
        private int status;
        private String bookingphone;
        private String bookinginfo;
        private int fakerefund;
        private int price;
        private int expireautorefund;
        private int start;
        private int satisfaction;
        private int payType;
        private String slug;
        private boolean isAvailableToday;
        private int dt;
        private String cate;
        private String range;
        private String voice;
        private int curcityrdcount;
        private boolean todayavaliable;
        private int state;
        private String squareimgurl;
        private String mlls;
        private int id;
        private String title;
        private int refund;
        private String coupontitle;
        private String murl;
        private int end;
        private int campaignprice;
        private String mname;
        private int rdcount;
        private String brandname;
        private boolean isappointonline;
        private int ctype;
        private String showtype;
        private String subcate;
        private String frontPoiCates;
        private int sevenrefund;
        private int canbuyprice;
        private String iUrl;
        private String digestion;
        private double rating;
        private String channel;
        private int nobooking;
        /**
         * content : ["除酒水饮料外全场通用"]
         * title : 适用范围
         */

        private List<TermsBean> terms;
        /**
         * endtime : 0
         * id : 0
         * desc : 平日
         * starttime : 0
         * price : 45
         * canbuyprice : -1
         * range : []
         * dealid : 28634464
         * buyprice : 0
         * type : 1
         */

        private List<PricecalendarBean> pricecalendar;
        /**
         * content : 代金券
         * total : 50
         * price : 50
         * subtype : 2
         * specification : 1张
         * type : 128
         */

        private List<List<MenuBean>> menu;
        /**
         * longtitle : 新用户首购立减15元，限购1份
         * logo : 减
         * infourl : http://i.meituan.com/firework/1yuanguize
         * color :
         * tag : 新用户立减15元
         * buystatus : 2
         * festival :
         * type : 3
         * shorttag :
         */

        private List<CampaignsBean> campaigns;
        private List<Integer> poiids;
        private List<?> securityinfo;
        /**
         * canSelfVerify : false
         * multiType : food,
         * phone : 020-86496913
         * districtname : 白云区
         * markNumbers : 2691
         * cityId : 20
         * areaid : 1491
         * frontimg : http://p1.meituan.net/w.h/deal/__9351934__7071577.jpg
         * addr : 白云区西槎路99号鹅掌坦骐利广场三楼
         * lng : 113.235022
         * ktvAppointStatus : 0
         * brandId : 0
         * city : 20
         * poiid : 1712670
         * traffic :
         * areaName : 同德围
         * avgScore : 3.9
         * iUrl :
         * name : 傣妹火锅（同德围店）
         * showType : food
         * showStatus : 1
         * isQueuing : 0
         * bizloginid : 0
         * districtid : 26
         * lat : 23.155636
         */

        private List<RdplocBean> rdploc;
        /**
         * iconname : 免费WiFi
         * status : 1
         * key : 3
         */

        private List<AttrJsonBean> attrJson;

        public KtvplanBean getKtvplan() {
            return ktvplan;
        }

        public void setKtvplan(KtvplanBean ktvplan) {
            this.ktvplan = ktvplan;
        }

        public String getMealcount() {
            return mealcount;
        }

        public void setMealcount(String mealcount) {
            this.mealcount = mealcount;
        }

        public int getDeposit() {
            return deposit;
        }

        public void setDeposit(int deposit) {
            this.deposit = deposit;
        }

        public TagBean getTag() {
            return tag;
        }

        public void setTag(TagBean tag) {
            this.tag = tag;
        }

        public int getSolds() {
            return solds;
        }

        public void setSolds(int solds) {
            this.solds = solds;
        }

        public int getFestcanuse() {
            return festcanuse;
        }

        public void setFestcanuse(int festcanuse) {
            this.festcanuse = festcanuse;
        }

        public NewratingBean getNewrating() {
            return newrating;
        }

        public void setNewrating(NewratingBean newrating) {
            this.newrating = newrating;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getDtype() {
            return dtype;
        }

        public void setDtype(int dtype) {
            this.dtype = dtype;
        }

        public int getRateCount() {
            return rateCount;
        }

        public void setRateCount(int rateCount) {
            this.rateCount = rateCount;
        }

        public String getImgurl() {
            return imgurl;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }

        public OptionalattrsBean getOptionalattrs() {
            return optionalattrs;
        }

        public void setOptionalattrs(OptionalattrsBean optionalattrs) {
            this.optionalattrs = optionalattrs;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getBookingphone() {
            return bookingphone;
        }

        public void setBookingphone(String bookingphone) {
            this.bookingphone = bookingphone;
        }

        public String getBookinginfo() {
            return bookinginfo;
        }

        public void setBookinginfo(String bookinginfo) {
            this.bookinginfo = bookinginfo;
        }

        public int getFakerefund() {
            return fakerefund;
        }

        public void setFakerefund(int fakerefund) {
            this.fakerefund = fakerefund;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getExpireautorefund() {
            return expireautorefund;
        }

        public void setExpireautorefund(int expireautorefund) {
            this.expireautorefund = expireautorefund;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getSatisfaction() {
            return satisfaction;
        }

        public void setSatisfaction(int satisfaction) {
            this.satisfaction = satisfaction;
        }

        public int getPayType() {
            return payType;
        }

        public void setPayType(int payType) {
            this.payType = payType;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public boolean isIsAvailableToday() {
            return isAvailableToday;
        }

        public void setIsAvailableToday(boolean isAvailableToday) {
            this.isAvailableToday = isAvailableToday;
        }

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public String getCate() {
            return cate;
        }

        public void setCate(String cate) {
            this.cate = cate;
        }

        public String getRange() {
            return range;
        }

        public void setRange(String range) {
            this.range = range;
        }

        public String getVoice() {
            return voice;
        }

        public void setVoice(String voice) {
            this.voice = voice;
        }

        public int getCurcityrdcount() {
            return curcityrdcount;
        }

        public void setCurcityrdcount(int curcityrdcount) {
            this.curcityrdcount = curcityrdcount;
        }

        public boolean isTodayavaliable() {
            return todayavaliable;
        }

        public void setTodayavaliable(boolean todayavaliable) {
            this.todayavaliable = todayavaliable;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public String getSquareimgurl() {
            return squareimgurl;
        }

        public void setSquareimgurl(String squareimgurl) {
            this.squareimgurl = squareimgurl;
        }

        public String getMlls() {
            return mlls;
        }

        public void setMlls(String mlls) {
            this.mlls = mlls;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getRefund() {
            return refund;
        }

        public void setRefund(int refund) {
            this.refund = refund;
        }

        public String getCoupontitle() {
            return coupontitle;
        }

        public void setCoupontitle(String coupontitle) {
            this.coupontitle = coupontitle;
        }

        public String getMurl() {
            return murl;
        }

        public void setMurl(String murl) {
            this.murl = murl;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public int getCampaignprice() {
            return campaignprice;
        }

        public void setCampaignprice(int campaignprice) {
            this.campaignprice = campaignprice;
        }

        public String getMname() {
            return mname;
        }

        public void setMname(String mname) {
            this.mname = mname;
        }

        public int getRdcount() {
            return rdcount;
        }

        public void setRdcount(int rdcount) {
            this.rdcount = rdcount;
        }

        public String getBrandname() {
            return brandname;
        }

        public void setBrandname(String brandname) {
            this.brandname = brandname;
        }

        public boolean isIsappointonline() {
            return isappointonline;
        }

        public void setIsappointonline(boolean isappointonline) {
            this.isappointonline = isappointonline;
        }

        public int getCtype() {
            return ctype;
        }

        public void setCtype(int ctype) {
            this.ctype = ctype;
        }

        public String getShowtype() {
            return showtype;
        }

        public void setShowtype(String showtype) {
            this.showtype = showtype;
        }

        public String getSubcate() {
            return subcate;
        }

        public void setSubcate(String subcate) {
            this.subcate = subcate;
        }

        public String getFrontPoiCates() {
            return frontPoiCates;
        }

        public void setFrontPoiCates(String frontPoiCates) {
            this.frontPoiCates = frontPoiCates;
        }

        public int getSevenrefund() {
            return sevenrefund;
        }

        public void setSevenrefund(int sevenrefund) {
            this.sevenrefund = sevenrefund;
        }

        public int getCanbuyprice() {
            return canbuyprice;
        }

        public void setCanbuyprice(int canbuyprice) {
            this.canbuyprice = canbuyprice;
        }

        public String getIUrl() {
            return iUrl;
        }

        public void setIUrl(String iUrl) {
            this.iUrl = iUrl;
        }

        public String getDigestion() {
            return digestion;
        }

        public void setDigestion(String digestion) {
            this.digestion = digestion;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public int getNobooking() {
            return nobooking;
        }

        public void setNobooking(int nobooking) {
            this.nobooking = nobooking;
        }

        public List<TermsBean> getTerms() {
            return terms;
        }

        public void setTerms(List<TermsBean> terms) {
            this.terms = terms;
        }

        public List<PricecalendarBean> getPricecalendar() {
            return pricecalendar;
        }

        public void setPricecalendar(List<PricecalendarBean> pricecalendar) {
            this.pricecalendar = pricecalendar;
        }

        public List<List<MenuBean>> getMenu() {
            return menu;
        }

        public void setMenu(List<List<MenuBean>> menu) {
            this.menu = menu;
        }

        public List<CampaignsBean> getCampaigns() {
            return campaigns;
        }

        public void setCampaigns(List<CampaignsBean> campaigns) {
            this.campaigns = campaigns;
        }

        public List<Integer> getPoiids() {
            return poiids;
        }

        public void setPoiids(List<Integer> poiids) {
            this.poiids = poiids;
        }

        public List<?> getSecurityinfo() {
            return securityinfo;
        }

        public void setSecurityinfo(List<?> securityinfo) {
            this.securityinfo = securityinfo;
        }

        public List<RdplocBean> getRdploc() {
            return rdploc;
        }

        public void setRdploc(List<RdplocBean> rdploc) {
            this.rdploc = rdploc;
        }

        public List<AttrJsonBean> getAttrJson() {
            return attrJson;
        }

        public void setAttrJson(List<AttrJsonBean> attrJson) {
            this.attrJson = attrJson;
        }

        public static class KtvplanBean {
        }

        public static class TagBean {
        }

        public static class NewratingBean {
            private int count;
            /**
             * 3 : 10595
             * 2 : 3084
             * 1 : 984
             * 5 : 17915
             * 4 : 12904
             */

            private SubcountBean subcount;
            private String rating;
            private int recommend;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public SubcountBean getSubcount() {
                return subcount;
            }

            public void setSubcount(SubcountBean subcount) {
                this.subcount = subcount;
            }

            public String getRating() {
                return rating;
            }

            public void setRating(String rating) {
                this.rating = rating;
            }

            public int getRecommend() {
                return recommend;
            }

            public void setRecommend(int recommend) {
                this.recommend = recommend;
            }

            public static class SubcountBean {
                @SerializedName("3")
                private int value3;
                @SerializedName("2")
                private int value2;
                @SerializedName("1")
                private int value1;
                @SerializedName("5")
                private int value5;
                @SerializedName("4")
                private int value4;

                public int getValue3() {
                    return value3;
                }

                public void setValue3(int value3) {
                    this.value3 = value3;
                }

                public int getValue2() {
                    return value2;
                }

                public void setValue2(int value2) {
                    this.value2 = value2;
                }

                public int getValue1() {
                    return value1;
                }

                public void setValue1(int value1) {
                    this.value1 = value1;
                }

                public int getValue5() {
                    return value5;
                }

                public void setValue5(int value5) {
                    this.value5 = value5;
                }

                public int getValue4() {
                    return value4;
                }

                public void setValue4(int value4) {
                    this.value4 = value4;
                }
            }
        }

        public static class OptionalattrsBean {
            @SerializedName("11")
            private String value11;
            @SerializedName("13")
            private String value13;

            public String getValue11() {
                return value11;
            }

            public void setValue11(String value11) {
                this.value11 = value11;
            }

            public String getValue13() {
                return value13;
            }

            public void setValue13(String value13) {
                this.value13 = value13;
            }
        }

        public static class TermsBean {
            private String title;
            private List<String> content;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<String> getContent() {
                return content;
            }

            public void setContent(List<String> content) {
                this.content = content;
            }
        }

        public static class PricecalendarBean {
            private int endtime;
            private int id;
            private String desc;
            private int starttime;
            private int price;
            private int canbuyprice;
            private int dealid;
            private int buyprice;
            private int type;
            private List<?> range;

            public int getEndtime() {
                return endtime;
            }

            public void setEndtime(int endtime) {
                this.endtime = endtime;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public int getStarttime() {
                return starttime;
            }

            public void setStarttime(int starttime) {
                this.starttime = starttime;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getCanbuyprice() {
                return canbuyprice;
            }

            public void setCanbuyprice(int canbuyprice) {
                this.canbuyprice = canbuyprice;
            }

            public int getDealid() {
                return dealid;
            }

            public void setDealid(int dealid) {
                this.dealid = dealid;
            }

            public int getBuyprice() {
                return buyprice;
            }

            public void setBuyprice(int buyprice) {
                this.buyprice = buyprice;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public List<?> getRange() {
                return range;
            }

            public void setRange(List<?> range) {
                this.range = range;
            }
        }

        public static class MenuBean {
            private String content;
            private String total;
            private String price;
            private int subtype;
            private String specification;
            private String type;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getSubtype() {
                return subtype;
            }

            public void setSubtype(int subtype) {
                this.subtype = subtype;
            }

            public String getSpecification() {
                return specification;
            }

            public void setSpecification(String specification) {
                this.specification = specification;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class CampaignsBean {
            private String longtitle;
            private String logo;
            private String infourl;
            private String color;
            private String tag;
            private int buystatus;
            private String festival;
            private int type;
            private String shorttag;

            public String getLongtitle() {
                return longtitle;
            }

            public void setLongtitle(String longtitle) {
                this.longtitle = longtitle;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getInfourl() {
                return infourl;
            }

            public void setInfourl(String infourl) {
                this.infourl = infourl;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public int getBuystatus() {
                return buystatus;
            }

            public void setBuystatus(int buystatus) {
                this.buystatus = buystatus;
            }

            public String getFestival() {
                return festival;
            }

            public void setFestival(String festival) {
                this.festival = festival;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getShorttag() {
                return shorttag;
            }

            public void setShorttag(String shorttag) {
                this.shorttag = shorttag;
            }
        }

        public static class RdplocBean {
            private boolean canSelfVerify;
            private String multiType;
            private String phone;
            private String districtname;
            private int markNumbers;
            private int cityId;
            private int areaid;
            private String frontimg;
            private String addr;
            private double lng;
            private int ktvAppointStatus;
            private int brandId;
            private int city;
            private int poiid;
            private String traffic;
            private String areaName;
            private double avgScore;
            private String iUrl;
            private String name;
            private String showType;
            private int showStatus;
            private int isQueuing;
            private int bizloginid;
            private int districtid;
            private double lat;

            public boolean isCanSelfVerify() {
                return canSelfVerify;
            }

            public void setCanSelfVerify(boolean canSelfVerify) {
                this.canSelfVerify = canSelfVerify;
            }

            public String getMultiType() {
                return multiType;
            }

            public void setMultiType(String multiType) {
                this.multiType = multiType;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getDistrictname() {
                return districtname;
            }

            public void setDistrictname(String districtname) {
                this.districtname = districtname;
            }

            public int getMarkNumbers() {
                return markNumbers;
            }

            public void setMarkNumbers(int markNumbers) {
                this.markNumbers = markNumbers;
            }

            public int getCityId() {
                return cityId;
            }

            public void setCityId(int cityId) {
                this.cityId = cityId;
            }

            public int getAreaid() {
                return areaid;
            }

            public void setAreaid(int areaid) {
                this.areaid = areaid;
            }

            public String getFrontimg() {
                return frontimg;
            }

            public void setFrontimg(String frontimg) {
                this.frontimg = frontimg;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getKtvAppointStatus() {
                return ktvAppointStatus;
            }

            public void setKtvAppointStatus(int ktvAppointStatus) {
                this.ktvAppointStatus = ktvAppointStatus;
            }

            public int getBrandId() {
                return brandId;
            }

            public void setBrandId(int brandId) {
                this.brandId = brandId;
            }

            public int getCity() {
                return city;
            }

            public void setCity(int city) {
                this.city = city;
            }

            public int getPoiid() {
                return poiid;
            }

            public void setPoiid(int poiid) {
                this.poiid = poiid;
            }

            public String getTraffic() {
                return traffic;
            }

            public void setTraffic(String traffic) {
                this.traffic = traffic;
            }

            public String getAreaName() {
                return areaName;
            }

            public void setAreaName(String areaName) {
                this.areaName = areaName;
            }

            public double getAvgScore() {
                return avgScore;
            }

            public void setAvgScore(double avgScore) {
                this.avgScore = avgScore;
            }

            public String getIUrl() {
                return iUrl;
            }

            public void setIUrl(String iUrl) {
                this.iUrl = iUrl;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getShowType() {
                return showType;
            }

            public void setShowType(String showType) {
                this.showType = showType;
            }

            public int getShowStatus() {
                return showStatus;
            }

            public void setShowStatus(int showStatus) {
                this.showStatus = showStatus;
            }

            public int getIsQueuing() {
                return isQueuing;
            }

            public void setIsQueuing(int isQueuing) {
                this.isQueuing = isQueuing;
            }

            public int getBizloginid() {
                return bizloginid;
            }

            public void setBizloginid(int bizloginid) {
                this.bizloginid = bizloginid;
            }

            public int getDistrictid() {
                return districtid;
            }

            public void setDistrictid(int districtid) {
                this.districtid = districtid;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }
        }

        public static class AttrJsonBean {
            private String iconname;
            private int status;
            private int key;

            public String getIconname() {
                return iconname;
            }

            public void setIconname(String iconname) {
                this.iconname = iconname;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getKey() {
                return key;
            }

            public void setKey(int key) {
                this.key = key;
            }
        }
    }
}
