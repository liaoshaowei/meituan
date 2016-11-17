package com.xugang.meituan.foodpackage.classes;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by qf on 2016/11/1.
 */
public class Shop {


    /**
     * count : 24716
     */

    private PagingBean paging;
    /**
     * poi : {"poiid":"96496690","channel":"food","name":"淼鑫猪肚鸡(长兴店)","frontImg":"http://p0.meituan.net/w.h/mogu/b7975283f40747f4248a067073dfa91855359.jpg","avgPrice":39,"avgScore":3.7,"cateName":"火锅","areaName":"天河客运站","lat":23.171458,"lng":113.348504,"iUrl":"","isWaimai":0,"characteristicArea":{},"payAbstracts":[{"type":"group","abstract":"2-3人餐85元，2-3人餐88元，4-6人餐158元，7-10人餐288元","icon_url":"http://p1.meituan.net/tuanpic/group_ia_tuan_01.png"}],"extra":{"icons":[]},"campaignTag":"","extCampaign":{},"recommendation":{"tagId":528897,"content":"回头客多"}}
     */

    private List<DataBean> data;
    /**
     * position : 3
     * tipmsgs : [{"type":7,"valueId":0,"parentId":0,"name":"幸福烤肉","strategy":"216307913136231680%2b%e5%b9%b8%e7%a6%8f%e7%83%a4%e8%82%89","iUrl":"imeituan://www.meituan.com/search?q=%e5%b9%b8%e7%a6%8f%e7%83%a4%e8%82%89&push=false&ste=_b400011","iUrlType":"search","selectMsg":{}},{"type":7,"valueId":0,"parentId":0,"name":"嘿牛韩式烤肉料理","strategy":"216307913136231680%2b%e5%98%bf%e7%89%9b%e9%9f%a9%e5%bc%8f%e7%83%a4%e8%82%89%e6%96%99%e7%90%86","iUrl":"imeituan://www.meituan.com/search?q=%e5%98%bf%e7%89%9b%e9%9f%a9%e5%bc%8f%e7%83%a4%e8%82%89%e6%96%99%e7%90%86&push=false&ste=_b400011","iUrlType":"search","selectMsg":{}},{"type":7,"valueId":0,"parentId":0,"name":"斯维乐炸鸡汉堡","strategy":"216307913136231680%2b%e6%96%af%e7%bb%b4%e4%b9%90%e7%82%b8%e9%b8%a1%e6%b1%89%e5%a0%a1","iUrl":"imeituan://www.meituan.com/search?q=%e6%96%af%e7%bb%b4%e4%b9%90%e7%82%b8%e9%b8%a1%e6%b1%89%e5%a0%a1&push=false&ste=_b400011","iUrlType":"search","selectMsg":{}},{"type":7,"valueId":0,"parentId":0,"name":"粤潮兄弟牛肉火锅店","strategy":"216307913136231680%2b%e7%b2%a4%e6%bd%ae%e5%85%84%e5%bc%9f%e7%89%9b%e8%82%89%e7%81%ab%e9%94%85%e5%ba%97","iUrl":"imeituan://www.meituan.com/search?q=%e7%b2%a4%e6%bd%ae%e5%85%84%e5%bc%9f%e7%89%9b%e8%82%89%e7%81%ab%e9%94%85%e5%ba%97&push=false&ste=_b400011","iUrlType":"search","selectMsg":{}},{"type":0,"valueId":17,"parentId":1,"name":"火锅","strategy":"1657459778088657408%2b%e7%81%ab%e9%94%85","iUrl":"imeituan://www.meituan.com/deal/list","iUrlType":"sieve","selectMsg":{}},{"type":2,"valueId":0,"parentId":0,"name":"下午茶","strategy":"1945690154254899968%2b%e4%b8%8b%e5%8d%88%e8%8c%b6","iUrl":"imeituan://www.meituan.com/deal/list","iUrlType":"sieve","selectMsg":{"selectKey":"poi_attr_20043","selectValue":"20124"}},{"type":2,"valueId":0,"parentId":0,"name":"单人餐","strategy":"7710297677289138944%2b%e5%8d%95%e4%ba%ba%e9%a4%90","iUrl":"imeituan://www.meituan.com/deal/list","iUrlType":"sieve","selectMsg":{"selectKey":"deal_attr_25","selectValue":"115"}},{"type":0,"valueId":11,"parentId":1,"name":"甜点饮品","strategy":"1657459778088657408%2b%e7%94%9c%e7%82%b9%e9%a5%ae%e5%93%81","iUrl":"imeituan://www.meituan.com/deal/list","iUrlType":"sieve","selectMsg":{}}]
     */

    private List<TipsBean> tips;
    /**
     * poiid : 96496690
     * ct_poi : 7494125309565778944_a96496690_c0_e12559676256937273994_h528897_idefault
     */

    private List<CtPoisBean> ct_pois;

    public PagingBean getPaging() {
        return paging;
    }

    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public List<TipsBean> getTips() {
        return tips;
    }

    public void setTips(List<TipsBean> tips) {
        this.tips = tips;
    }

    public List<CtPoisBean> getCt_pois() {
        return ct_pois;
    }

    public void setCt_pois(List<CtPoisBean> ct_pois) {
        this.ct_pois = ct_pois;
    }

    public static class PagingBean {
        private int count;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    public static class DataBean {
        /**
         * poiid : 96496690
         * channel : food
         * name : 淼鑫猪肚鸡(长兴店)
         * frontImg : http://p0.meituan.net/w.h/mogu/b7975283f40747f4248a067073dfa91855359.jpg
         * avgPrice : 39.0
         * avgScore : 3.7
         * cateName : 火锅
         * areaName : 天河客运站
         * lat : 23.171458
         * lng : 113.348504
         * iUrl :
         * isWaimai : 0
         * characteristicArea : {}
         * payAbstracts : [{"type":"group","abstract":"2-3人餐85元，2-3人餐88元，4-6人餐158元，7-10人餐288元","icon_url":"http://p1.meituan.net/tuanpic/group_ia_tuan_01.png"}]
         * extra : {"icons":[]}
         * campaignTag :
         * extCampaign : {}
         * recommendation : {"tagId":528897,"content":"回头客多"}
         */

        private PoiBean poi;

        public PoiBean getPoi() {
            return poi;
        }

        public void setPoi(PoiBean poi) {
            this.poi = poi;
        }

        public static class PoiBean {
            private String poiid;
            private String channel;
            private String name;
            private String frontImg;
            private double avgPrice;
            private double avgScore;
            private String cateName;
            private String areaName;
            private double lat;
            private double lng;
            private String iUrl;
            private int isWaimai;
            private CharacteristicAreaBean characteristicArea;
            private ExtraBean extra;
            private String campaignTag;
            private ExtCampaignBean extCampaign;
            /**
             * tagId : 528897
             * content : 回头客多
             */

            private RecommendationBean recommendation;
            /**
             * type : group
             * abstract : 2-3人餐85元，2-3人餐88元，4-6人餐158元，7-10人餐288元
             * icon_url : http://p1.meituan.net/tuanpic/group_ia_tuan_01.png
             */

            private List<PayAbstractsBean> payAbstracts;

            public String getPoiid() {
                return poiid;
            }

            public void setPoiid(String poiid) {
                this.poiid = poiid;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFrontImg() {
                return frontImg;
            }

            public void setFrontImg(String frontImg) {
                this.frontImg = frontImg;
            }

            public double getAvgPrice() {
                return avgPrice;
            }

            public void setAvgPrice(double avgPrice) {
                this.avgPrice = avgPrice;
            }

            public double getAvgScore() {
                return avgScore;
            }

            public void setAvgScore(double avgScore) {
                this.avgScore = avgScore;
            }

            public String getCateName() {
                return cateName;
            }

            public void setCateName(String cateName) {
                this.cateName = cateName;
            }

            public String getAreaName() {
                return areaName;
            }

            public void setAreaName(String areaName) {
                this.areaName = areaName;
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

            public String getIUrl() {
                return iUrl;
            }

            public void setIUrl(String iUrl) {
                this.iUrl = iUrl;
            }

            public int getIsWaimai() {
                return isWaimai;
            }

            public void setIsWaimai(int isWaimai) {
                this.isWaimai = isWaimai;
            }

            public CharacteristicAreaBean getCharacteristicArea() {
                return characteristicArea;
            }

            public void setCharacteristicArea(CharacteristicAreaBean characteristicArea) {
                this.characteristicArea = characteristicArea;
            }

            public ExtraBean getExtra() {
                return extra;
            }

            public void setExtra(ExtraBean extra) {
                this.extra = extra;
            }

            public String getCampaignTag() {
                return campaignTag;
            }

            public void setCampaignTag(String campaignTag) {
                this.campaignTag = campaignTag;
            }

            public ExtCampaignBean getExtCampaign() {
                return extCampaign;
            }

            public void setExtCampaign(ExtCampaignBean extCampaign) {
                this.extCampaign = extCampaign;
            }

            public RecommendationBean getRecommendation() {
                return recommendation;
            }

            public void setRecommendation(RecommendationBean recommendation) {
                this.recommendation = recommendation;
            }

            public List<PayAbstractsBean> getPayAbstracts() {
                return payAbstracts;
            }

            public void setPayAbstracts(List<PayAbstractsBean> payAbstracts) {
                this.payAbstracts = payAbstracts;
            }

            public static class CharacteristicAreaBean {
            }

            public static class ExtraBean {
                private List<?> icons;

                public List<?> getIcons() {
                    return icons;
                }

                public void setIcons(List<?> icons) {
                    this.icons = icons;
                }
            }

            public static class ExtCampaignBean {
            }

            public static class RecommendationBean {
                private int tagId;
                private String content;

                public int getTagId() {
                    return tagId;
                }

                public void setTagId(int tagId) {
                    this.tagId = tagId;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }
            }

            public static class PayAbstractsBean {
                private String type;
                @SerializedName("abstract")
                private String abstractX;
                private String icon_url;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getAbstractX() {
                    return abstractX;
                }

                public void setAbstractX(String abstractX) {
                    this.abstractX = abstractX;
                }

                public String getIcon_url() {
                    return icon_url;
                }

                public void setIcon_url(String icon_url) {
                    this.icon_url = icon_url;
                }
            }
        }
    }

    public static class TipsBean {
        private int position;
        /**
         * type : 7
         * valueId : 0
         * parentId : 0
         * name : 幸福烤肉
         * strategy : 216307913136231680%2b%e5%b9%b8%e7%a6%8f%e7%83%a4%e8%82%89
         * iUrl : imeituan://www.meituan.com/search?q=%e5%b9%b8%e7%a6%8f%e7%83%a4%e8%82%89&push=false&ste=_b400011
         * iUrlType : search
         * selectMsg : {}
         */

        private List<TipmsgsBean> tipmsgs;

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public List<TipmsgsBean> getTipmsgs() {
            return tipmsgs;
        }

        public void setTipmsgs(List<TipmsgsBean> tipmsgs) {
            this.tipmsgs = tipmsgs;
        }

        public static class TipmsgsBean {
            private int type;
            private int valueId;
            private int parentId;
            private String name;
            private String strategy;
            private String iUrl;
            private String iUrlType;
            private SelectMsgBean selectMsg;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getValueId() {
                return valueId;
            }

            public void setValueId(int valueId) {
                this.valueId = valueId;
            }

            public int getParentId() {
                return parentId;
            }

            public void setParentId(int parentId) {
                this.parentId = parentId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getStrategy() {
                return strategy;
            }

            public void setStrategy(String strategy) {
                this.strategy = strategy;
            }

            public String getIUrl() {
                return iUrl;
            }

            public void setIUrl(String iUrl) {
                this.iUrl = iUrl;
            }

            public String getIUrlType() {
                return iUrlType;
            }

            public void setIUrlType(String iUrlType) {
                this.iUrlType = iUrlType;
            }

            public SelectMsgBean getSelectMsg() {
                return selectMsg;
            }

            public void setSelectMsg(SelectMsgBean selectMsg) {
                this.selectMsg = selectMsg;
            }

            public static class SelectMsgBean {
            }
        }
    }

    public static class CtPoisBean {
        private int poiid;
        private String ct_poi;

        public int getPoiid() {
            return poiid;
        }

        public void setPoiid(int poiid) {
            this.poiid = poiid;
        }

        public String getCt_poi() {
            return ct_poi;
        }

        public void setCt_poi(String ct_poi) {
            this.ct_poi = ct_poi;
        }
    }
}
