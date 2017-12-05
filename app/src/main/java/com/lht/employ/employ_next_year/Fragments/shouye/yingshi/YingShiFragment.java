package com.lht.employ.employ_next_year.Fragments.shouye.yingshi;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lht.employ.employ_next_year.Fragments.shouye.tuijian.TuijianFragment;
import com.lht.employ.employ_next_year.R;
import com.lht.employ.employ_next_year.beans.FragmentBean.BasicFragment;

/**
 * Created by LHT on 2017/12/4.
 */

public class YingShiFragment extends BasicFragment {

    private static YingShiFragment instance;
    private static Context mContext;

    public static YingShiFragment getInstance( Context context){

        mContext=context;
        if (instance==null){
            instance=new YingShiFragment();
        }
        return instance;
    }

    View content;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (content==null){
            content=inflater.inflate(R.layout.yingshifrag_layout,container,false);
        }
        ViewGroup parent= (ViewGroup) content.getParent();
        if (parent!=null){
            parent.removeView(content);
        }
        return content;
    }
}
