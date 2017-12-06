package com.lht.employ.employ_next_year.Fragments.shouye.tuijian;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 推荐数据访问独享，用于获取推荐页面所需要的各种数据
 * 单例类
 * Created by LHT on 2017/12/6.
 */

public class RecommendDataVisitor {

    private static RecommendDataVisitor visitor;

    private RecommendDataVisitor(){}

    public static RecommendDataVisitor getVisitor(){

            if (visitor==null){
                visitor=new RecommendDataVisitor();
            }
            return visitor;
    }

    /**
     * 用于测试的json字符串
     */
    private String testJsonString;

    private void initJsonString(){

        List<RecommendModule> itemList=new ArrayList<>();

    }

    private JSONObject reqRecData(){

        JSONArray jsonArray=new JSONArray();

        return null;
    }

    private void parseData(List<RecommendItem> list){


    }

    private List<RecommendItem> getItems(){

        List<RecommendItem> items=new ArrayList<>();

        return items;
    }



}
