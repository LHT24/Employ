package com.lht.employ.test;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomView view= (CustomView) findViewById(R.id.testView);
        List<PercentData> dataList=new ArrayList<>();
        dataList.add(new PercentData(10));
        dataList.add(new PercentData(20));
        dataList.add(new PercentData(30));
        dataList.add(new PercentData(40));
        view.setData(dataList);
    }

}
