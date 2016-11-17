package com.xugang.meituan.model;

import java.util.List;

/**
 * Created by ASUS on 2016-11-02.
 */
public class PingLun {

    /**
     * label : 服务态度很好
     * count : 3839
     * isPositive : 1
     */

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String label;
        private int count;
        private int isPositive;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getIsPositive() {
            return isPositive;
        }

        public void setIsPositive(int isPositive) {
            this.isPositive = isPositive;
        }
    }
}
