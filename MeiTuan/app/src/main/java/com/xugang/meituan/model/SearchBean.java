package com.xugang.meituan.model;

import java.util.List;

/**
 * Created by ASUS on 2016-11-08.
 */
public class SearchBean {


    /**
     * city : 20
     * markeduphotwords : [{"highlight":false,"wordColor":"","iconUrl":"","type":7,"word":"蜀风流火锅"},{"highlight":false,"wordColor":"","iconUrl":"","type":7,"word":"淼鑫猪肚鸡"},{"highlight":false,"wordColor":"","iconUrl":"","type":7,"word":"马来拉茶"},{"highlight":false,"wordColor":"","iconUrl":"","type":7,"word":"朝天门"},{"highlight":false,"wordColor":"","iconUrl":"","type":7,"word":"梅斯特"},{"highlight":false,"wordColor":"","iconUrl":"","type":7,"word":"鱼歌岁月"},{"highlight":false,"wordColor":"","iconUrl":"","type":7,"word":"正新鸡排"},{"highlight":false,"wordColor":"","iconUrl":"","type":111,"word":"万岁寿司"},{"highlight":false,"wordColor":"","iconUrl":"","type":5,"word":"江上城"},{"highlight":false,"wordColor":"","iconUrl":"","type":5,"word":"竹林小雨火锅"},{"highlight":false,"wordColor":"","iconUrl":"","type":5,"word":"渝合老灶火锅"},{"highlight":false,"wordColor":"","iconUrl":"","type":8,"word":"横店电影"},{"highlight":false,"wordColor":"","iconUrl":"","type":5,"word":"上上签"},{"highlight":false,"wordColor":"","iconUrl":"","type":111,"word":"尊宝比萨"},{"highlight":false,"wordColor":"","iconUrl":"","type":8,"word":"尊宝披萨"},{"highlight":false,"wordColor":"","iconUrl":"","type":111,"word":"华莱士"},{"highlight":false,"wordColor":"","iconUrl":"","type":111,"word":"贡茶"},{"highlight":false,"wordColor":"","iconUrl":"","type":111,"word":"真功夫"}]
     * globalId : 8956454788437824533
     * h_title :
     * title : 热门搜索
     * hotwords : ["蜀风流火锅","淼鑫猪肚鸡","马来拉茶","朝天门","梅斯特","鱼歌岁月","正新鸡排","万岁寿司","江上城","竹林小雨火锅","渝合老灶火锅","横店电影","上上签","尊宝比萨","尊宝披萨","华莱士","贡茶","真功夫"]
     */

    private DataBean data;
    /**
     * traceId : 8bfaeb24-eaf7-4d05-bdb2-b888aa14af09
     */

    private ServerInfoBean serverInfo;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public ServerInfoBean getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(ServerInfoBean serverInfo) {
        this.serverInfo = serverInfo;
    }

    public static class DataBean {
        private int city;
        private String globalId;
        private String h_title;
        private String title;
        /**
         * highlight : false
         * wordColor :
         * iconUrl :
         * type : 7
         * word : 蜀风流火锅
         */

        private List<MarkeduphotwordsBean> markeduphotwords;
        private List<String> hotwords;

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public String getGlobalId() {
            return globalId;
        }

        public void setGlobalId(String globalId) {
            this.globalId = globalId;
        }

        public String getH_title() {
            return h_title;
        }

        public void setH_title(String h_title) {
            this.h_title = h_title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<MarkeduphotwordsBean> getMarkeduphotwords() {
            return markeduphotwords;
        }

        public void setMarkeduphotwords(List<MarkeduphotwordsBean> markeduphotwords) {
            this.markeduphotwords = markeduphotwords;
        }

        public List<String> getHotwords() {
            return hotwords;
        }

        public void setHotwords(List<String> hotwords) {
            this.hotwords = hotwords;
        }

        public static class MarkeduphotwordsBean {
            private boolean highlight;
            private String wordColor;
            private String iconUrl;
            private int type;
            private String word;

            public boolean isHighlight() {
                return highlight;
            }

            public void setHighlight(boolean highlight) {
                this.highlight = highlight;
            }

            public String getWordColor() {
                return wordColor;
            }

            public void setWordColor(String wordColor) {
                this.wordColor = wordColor;
            }

            public String getIconUrl() {
                return iconUrl;
            }

            public void setIconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getWord() {
                return word;
            }

            public void setWord(String word) {
                this.word = word;
            }
        }
    }

    public static class ServerInfoBean {
        private String traceId;

        public String getTraceId() {
            return traceId;
        }

        public void setTraceId(String traceId) {
            this.traceId = traceId;
        }
    }
}
