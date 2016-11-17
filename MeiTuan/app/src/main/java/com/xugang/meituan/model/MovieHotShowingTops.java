package com.xugang.meituan.model;

import java.util.List;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class MovieHotShowingTops {
    /**
     * id : 17386
     * name : 驴得水 预售
     * commonTitle :
     * imgUrl : http://p0.meituan.net/mmc/d42a847dea14360643a8c0554bd7853962223.jpg
     * imgUrlSize : (640, 150)
     * bigImgTypeUrl : http://p0.meituan.net/mmc/d42a847dea14360643a8c0554bd7853962223.jpg
     * bigImgUrlSize : (640, 150)
     * app : group
     * type : 3
     * typeDesc : 链接到应用内部页面
     * standIdList : [99]
     * startTime : 1476620940000
     * endTime : 1508243340000
     * level : 3
     * newUser : -1
     * closable : 2
     * channelType : 0
     * channelListMap : {}
     * businessName :
     * businessIds :
     * url : imeituan://www.meituan.com/web?url=http://m.maoyan.com/newGuide/ldsys
     */

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int id;
        private String name;
        private String commonTitle;
        private String imgUrl;
        private String imgUrlSize;
        private String bigImgTypeUrl;
        private String bigImgUrlSize;
        private String app;
        private int type;
        private String typeDesc;
        private long startTime;
        private long endTime;
        private int level;
        private int newUser;
        private int closable;
        private int channelType;
        private ChannelListMapBean channelListMap;
        private String businessName;
        private String businessIds;
        private String url;
        private List<Integer> standIdList;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCommonTitle() {
            return commonTitle;
        }

        public void setCommonTitle(String commonTitle) {
            this.commonTitle = commonTitle;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getImgUrlSize() {
            return imgUrlSize;
        }

        public void setImgUrlSize(String imgUrlSize) {
            this.imgUrlSize = imgUrlSize;
        }

        public String getBigImgTypeUrl() {
            return bigImgTypeUrl;
        }

        public void setBigImgTypeUrl(String bigImgTypeUrl) {
            this.bigImgTypeUrl = bigImgTypeUrl;
        }

        public String getBigImgUrlSize() {
            return bigImgUrlSize;
        }

        public void setBigImgUrlSize(String bigImgUrlSize) {
            this.bigImgUrlSize = bigImgUrlSize;
        }

        public String getApp() {
            return app;
        }

        public void setApp(String app) {
            this.app = app;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getTypeDesc() {
            return typeDesc;
        }

        public void setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
        }

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getNewUser() {
            return newUser;
        }

        public void setNewUser(int newUser) {
            this.newUser = newUser;
        }

        public int getClosable() {
            return closable;
        }

        public void setClosable(int closable) {
            this.closable = closable;
        }

        public int getChannelType() {
            return channelType;
        }

        public void setChannelType(int channelType) {
            this.channelType = channelType;
        }

        public ChannelListMapBean getChannelListMap() {
            return channelListMap;
        }

        public void setChannelListMap(ChannelListMapBean channelListMap) {
            this.channelListMap = channelListMap;
        }

        public String getBusinessName() {
            return businessName;
        }

        public void setBusinessName(String businessName) {
            this.businessName = businessName;
        }

        public String getBusinessIds() {
            return businessIds;
        }

        public void setBusinessIds(String businessIds) {
            this.businessIds = businessIds;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<Integer> getStandIdList() {
            return standIdList;
        }

        public void setStandIdList(List<Integer> standIdList) {
            this.standIdList = standIdList;
        }

        public static class ChannelListMapBean {
        }
    }
}
