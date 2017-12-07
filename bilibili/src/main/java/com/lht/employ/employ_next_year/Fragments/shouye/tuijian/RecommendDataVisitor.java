package com.lht.employ.employ_next_year.Fragments.shouye.tuijian;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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

    private final String TAG="RecommendDataVisitor";
    private static RecommendDataVisitor visitor;

    private RecommendDataVisitor(){}

    public static RecommendDataVisitor getVisitor(){

            if (visitor==null){
                visitor=new RecommendDataVisitor();
            }
            return visitor;
    }

    public List<RecommendModule> getRecData(){

        return parseData(TestServer.response());
    }

    private List<RecommendModule> parseData(String jsonStrFromServer){

        Gson gson=new Gson();
        List<RecommendModule> moduleList=new ArrayList<>();
        moduleList=gson.fromJson(jsonStrFromServer,new TypeToken<List<RecommendModule>>(){}.getType());
        Log.e(TAG,"推荐模块数量："+moduleList);
        return  moduleList;
    }



}
