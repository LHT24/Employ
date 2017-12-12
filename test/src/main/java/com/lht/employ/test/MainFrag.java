package com.lht.employ.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by LHT on 2017/12/12.
 */

public class MainFrag extends Fragment implements View.OnClickListener {

    View page;
    Button animBtn;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        page=inflater.inflate(R.layout.main_layout,container,false);

        animBtn= (Button) page.findViewById(R.id.animBtn);
        animBtn.setOnClickListener(this);
        return page;
    }

    @Override
    public void onClick(View v) {

        FragmentManager manager=getActivity().getSupportFragmentManager();
        switch (v.getId()){

            case R.id.animBtn:
                AnimFragment fragment=new AnimFragment();
                MainActivity.getInstance().turnPage(fragment);
                break;
        }
    }
}
