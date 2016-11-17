package com.xugang.meituan.model;

import java.util.List;

/**
 * Created by ASUS on 2016-10-31.
 */
public class MainI {

    /**
     * status : 1
     * data : {"entryid":10034,"color":"#aabbcc","resource":[{"deputytypefacecolor":"#333333","sharemessage":"拉上小伙伴，1元吃喝玩乐嗨翻天！","maintitle":"1元吃","typefacecolor":"#333333","imgurlreward":"http://p1.meituan.net/feop/e54513456b71b6c21c539cc4a9780602167863.png","type":1,"deputytitle":"新客独享特权","rewardtypefacecolor":"#FF5353","id":4101,"imgurl50":"http://p1.meituan.net/feop/4797eabccc8a7a90ee03b29eee4dec2126525.png","shareurl":"http://i.meituan.com/firework/1yuanqi","rewardtitle":"吃喝省钱攻略","start":0,"imgurl69":"http://p1.meituan.net/feop/4cb123a43be3e3b40415dd76d3041cf529764.png","tplurl":"imeituan://www.meituan.com/web?url=http://i.meituan.com/firework/1yuanqi","end":0},{"deputytypefacecolor":"#333333","sharemessage":"注册就送最高15元外卖券！马上参加>>","maintitle":"领15元券","typefacecolor":"#333333","imgurlreward":"http://p0.meituan.net/feop/e9f1ff9f0cdd5fbf845a8c2539f6da5866881.png","type":1,"deputytitle":"注册就拿豪礼","rewardtypefacecolor":"#FF5353","id":4096,"imgurl50":"http://p0.meituan.net/feop/1a7d97cce1b4131f9bf08a6ff92de59a24040.png","shareurl":"http://activity.waimai.meituan.com/coupon/channel/D8839C7DC0E0445CB38ECA5CB7564314","rewardtitle":"外卖专享红包","start":0,"imgurl69":"http://p1.meituan.net/feop/85f11d9cb9e5c9fb0b3efe51a2146f3a21440.png","tplurl":"imeituan://www.meituan.com/web?url=http://activity.waimai.meituan.com/coupon/channel/D8839C7DC0E0445CB38ECA5CB7564314","end":0}],"display":{"style":[[{"width":"a"},{"width":"a"}]]},"entrytitle":"新客专享"}
     * server : {"time":1477922884}
     */

    private int status;
    /**
     * entryid : 10034
     * color : #aabbcc
     * resource : [{"deputytypefacecolor":"#333333","sharemessage":"拉上小伙伴，1元吃喝玩乐嗨翻天！","maintitle":"1元吃","typefacecolor":"#333333","imgurlreward":"http://p1.meituan.net/feop/e54513456b71b6c21c539cc4a9780602167863.png","type":1,"deputytitle":"新客独享特权","rewardtypefacecolor":"#FF5353","id":4101,"imgurl50":"http://p1.meituan.net/feop/4797eabccc8a7a90ee03b29eee4dec2126525.png","shareurl":"http://i.meituan.com/firework/1yuanqi","rewardtitle":"吃喝省钱攻略","start":0,"imgurl69":"http://p1.meituan.net/feop/4cb123a43be3e3b40415dd76d3041cf529764.png","tplurl":"imeituan://www.meituan.com/web?url=http://i.meituan.com/firework/1yuanqi","end":0},{"deputytypefacecolor":"#333333","sharemessage":"注册就送最高15元外卖券！马上参加>>","maintitle":"领15元券","typefacecolor":"#333333","imgurlreward":"http://p0.meituan.net/feop/e9f1ff9f0cdd5fbf845a8c2539f6da5866881.png","type":1,"deputytitle":"注册就拿豪礼","rewardtypefacecolor":"#FF5353","id":4096,"imgurl50":"http://p0.meituan.net/feop/1a7d97cce1b4131f9bf08a6ff92de59a24040.png","shareurl":"http://activity.waimai.meituan.com/coupon/channel/D8839C7DC0E0445CB38ECA5CB7564314","rewardtitle":"外卖专享红包","start":0,"imgurl69":"http://p1.meituan.net/feop/85f11d9cb9e5c9fb0b3efe51a2146f3a21440.png","tplurl":"imeituan://www.meituan.com/web?url=http://activity.waimai.meituan.com/coupon/channel/D8839C7DC0E0445CB38ECA5CB7564314","end":0}]
     * display : {"style":[[{"width":"a"},{"width":"a"}]]}
     * entrytitle : 新客专享
     */

    private DataBean data;
    /**
     * time : 1477922884
     */

    private ServerBean server;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public ServerBean getServer() {
        return server;
    }

    public void setServer(ServerBean server) {
        this.server = server;
    }

    public static class DataBean {
        private int entryid;
        private String color;
        private DisplayBean display;
        private String entrytitle;
        /**
         * deputytypefacecolor : #333333
         * sharemessage : 拉上小伙伴，1元吃喝玩乐嗨翻天！
         * maintitle : 1元吃
         * typefacecolor : #333333
         * imgurlreward : http://p1.meituan.net/feop/e54513456b71b6c21c539cc4a9780602167863.png
         * type : 1
         * deputytitle : 新客独享特权
         * rewardtypefacecolor : #FF5353
         * id : 4101
         * imgurl50 : http://p1.meituan.net/feop/4797eabccc8a7a90ee03b29eee4dec2126525.png
         * shareurl : http://i.meituan.com/firework/1yuanqi
         * rewardtitle : 吃喝省钱攻略
         * start : 0
         * imgurl69 : http://p1.meituan.net/feop/4cb123a43be3e3b40415dd76d3041cf529764.png
         * tplurl : imeituan://www.meituan.com/web?url=http://i.meituan.com/firework/1yuanqi
         * end : 0
         */

        private List<ResourceBean> resource;

        public int getEntryid() {
            return entryid;
        }

        public void setEntryid(int entryid) {
            this.entryid = entryid;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public DisplayBean getDisplay() {
            return display;
        }

        public void setDisplay(DisplayBean display) {
            this.display = display;
        }

        public String getEntrytitle() {
            return entrytitle;
        }

        public void setEntrytitle(String entrytitle) {
            this.entrytitle = entrytitle;
        }

        public List<ResourceBean> getResource() {
            return resource;
        }

        public void setResource(List<ResourceBean> resource) {
            this.resource = resource;
        }

        public static class DisplayBean {
            /**
             * width : a
             */

            private List<List<StyleBean>> style;

            public List<List<StyleBean>> getStyle() {
                return style;
            }

            public void setStyle(List<List<StyleBean>> style) {
                this.style = style;
            }

            public static class StyleBean {
                private String width;

                public String getWidth() {
                    return width;
                }

                public void setWidth(String width) {
                    this.width = width;
                }
            }
        }

        public static class ResourceBean {
            private String deputytypefacecolor;
            private String sharemessage;
            private String maintitle;
            private String typefacecolor;
            private String imgurlreward;
            private int type;
            private String deputytitle;
            private String rewardtypefacecolor;
            private int id;
            private String imgurl50;
            private String shareurl;
            private String rewardtitle;
            private int start;
            private String imgurl69;
            private String tplurl;
            private int end;

            public String getDeputytypefacecolor() {
                return deputytypefacecolor;
            }

            public void setDeputytypefacecolor(String deputytypefacecolor) {
                this.deputytypefacecolor = deputytypefacecolor;
            }

            public String getSharemessage() {
                return sharemessage;
            }

            public void setSharemessage(String sharemessage) {
                this.sharemessage = sharemessage;
            }

            public String getMaintitle() {
                return maintitle;
            }

            public void setMaintitle(String maintitle) {
                this.maintitle = maintitle;
            }

            public String getTypefacecolor() {
                return typefacecolor;
            }

            public void setTypefacecolor(String typefacecolor) {
                this.typefacecolor = typefacecolor;
            }

            public String getImgurlreward() {
                return imgurlreward;
            }

            public void setImgurlreward(String imgurlreward) {
                this.imgurlreward = imgurlreward;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getDeputytitle() {
                return deputytitle;
            }

            public void setDeputytitle(String deputytitle) {
                this.deputytitle = deputytitle;
            }

            public String getRewardtypefacecolor() {
                return rewardtypefacecolor;
            }

            public void setRewardtypefacecolor(String rewardtypefacecolor) {
                this.rewardtypefacecolor = rewardtypefacecolor;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImgurl50() {
                return imgurl50;
            }

            public void setImgurl50(String imgurl50) {
                this.imgurl50 = imgurl50;
            }

            public String getShareurl() {
                return shareurl;
            }

            public void setShareurl(String shareurl) {
                this.shareurl = shareurl;
            }

            public String getRewardtitle() {
                return rewardtitle;
            }

            public void setRewardtitle(String rewardtitle) {
                this.rewardtitle = rewardtitle;
            }

            public int getStart() {
                return start;
            }

            public void setStart(int start) {
                this.start = start;
            }

            public String getImgurl69() {
                return imgurl69;
            }

            public void setImgurl69(String imgurl69) {
                this.imgurl69 = imgurl69;
            }

            public String getTplurl() {
                return tplurl;
            }

            public void setTplurl(String tplurl) {
                this.tplurl = tplurl;
            }

            public int getEnd() {
                return end;
            }

            public void setEnd(int end) {
                this.end = end;
            }
        }
    }

    public static class ServerBean {
        private int time;

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }
    }
}
