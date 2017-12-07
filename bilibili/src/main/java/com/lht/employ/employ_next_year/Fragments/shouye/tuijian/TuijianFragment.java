package com.lht.employ.employ_next_year.Fragments.shouye.tuijian;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lht.employ.employ_next_year.R;
import com.lht.employ.employ_next_year.beans.FragmentBean.BasicFragment;

/**
 * 推荐页面
 * Created by LHT on 2017/12/1.
 */

public class TuijianFragment extends BasicFragment {

    private static TuijianFragment instance;
    private static Context mContext;

    public static TuijianFragment getInstance( Context context){

        mContext=context;
        if (instance==null){
            instance=new TuijianFragment();
        }
        return instance;
    }

    View content;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        if(content==null){
            content= (ViewGroup) inflater.inflate(R.layout.tuijian_fragment_content,container,false);
            initData();
            initView();
        }
        ViewGroup parent= (ViewGroup) content.getParent();
        if (parent!=null){
            parent.removeView(content);
        }

        return content;
    }

    @Override
    protected void initData() {
        super.initData();

    }

    @Override
    protected void initView() {

    }

    /**
     * 向服务器请求推荐内容数据
     */
    private void requestData(){

    }


}
