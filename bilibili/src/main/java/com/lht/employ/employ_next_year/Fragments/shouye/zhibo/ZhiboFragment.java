package com.lht.employ.employ_next_year.Fragments.shouye.zhibo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lht.employ.employ_next_year.Fragments.shouye.yingshi.YingShiFragment;
import com.lht.employ.employ_next_year.R;
import com.lht.employ.employ_next_year.beans.FragmentBean.BasicFragment;

/**
 * Created by LHT on 2017/12/4.
 */

public class ZhiboFragment extends BasicFragment {

    private static ZhiboFragment instance;
    private static Context mContext;

    public static ZhiboFragment getInstance( Context context){

        mContext=context;
        if (instance==null){
            instance=new ZhiboFragment();
        }
        return instance;
    }

    View content;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (content==null){
            content=inflater.inflate(R.layout.zhibofrag_layout,container,false);
        }
        ViewGroup parent= (ViewGroup) content.getParent();
        if (parent!=null){
            parent.removeView(content);
        }
        return content;
    }
}
