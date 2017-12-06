package com.lht.employ.employ_next_year.Fragments.shouye.tuijian;

import com.lht.employ.employ_next_year.beans.ObjectBean.ModuleDataResponse;

import java.util.List;

/**
 * Created by LHT on 2017/12/6.
 */

public class RecommendModule extends ModuleDataResponse {

    private List<String> viewPageImgPath;
    private List<RecommendItem> itemList;
    private RecommendItem bigItem;

    public List<String> getViewPageImgPath() {
        return viewPageImgPath;
    }

    public void setViewPageImgPath(List<String> viewPageImgPath) {
        this.viewPageImgPath = viewPageImgPath;
    }

    public List<RecommendItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<RecommendItem> itemList) {
        this.itemList = itemList;
    }

    public RecommendItem getBigItem() {
        return bigItem;
    }

    public void setBigItem(RecommendItem bigItem) {
        this.bigItem = bigItem;
    }
}
