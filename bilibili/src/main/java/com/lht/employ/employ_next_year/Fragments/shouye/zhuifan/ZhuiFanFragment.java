package com.lht.employ.employ_next_year.Fragments.shouye.zhuifan;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lht.employ.employ_next_year.Fragments.shouye.zhibo.ZhiboFragment;
import com.lht.employ.employ_next_year.R;
import com.lht.employ.employ_next_year.beans.FragmentBean.BasicFragment;

/**
 * Created by LHT on 2017/12/4.
 */

public class ZhuiFanFragment extends BasicFragment {

    private static ZhuiFanFragment instance;
    private static Context mContext;

    public static ZhuiFanFragment getInstance( Context context){

        mContext=context;
        if (instance==null){
            instance=new ZhuiFanFragment();
        }
        return instance;
    }

    View content;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (content==null){
            content=inflater.inflate(R.layout.fenqufrag_layout,container,false);
        }
        ViewGroup parent= (ViewGroup) content.getParent();
        if (parent!=null){
            parent.removeView(content);
        }
        return content;
    }
}
