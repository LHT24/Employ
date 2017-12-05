package com.lht.employ.employ_next_year.Fragments.dongtai;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lht.employ.employ_next_year.R;
import com.lht.employ.employ_next_year.beans.FragmentBean.BasicFragment;

/**
 * Created by LHT on 2017/11/30.
 */

public class DongTaiFragment extends BasicFragment {

    View content;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (content==null){
            content=inflater.inflate(R.layout.dongtaifrag_layout,container,false);
        }
        ViewGroup parent= (ViewGroup) content.getParent();
        if (parent!=null){
            parent.removeView(content);
        }
        return content;
    }
}
