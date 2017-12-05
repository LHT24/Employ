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

    ViewPager viewPager;
    List<View> viewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewList=new ArrayList<>();
        LayoutInflater inflater=getLayoutInflater().from(this);
        viewList.add(inflater.inflate(R.layout.first,null));
        viewList.add(inflater.inflate(R.layout.second,null));
        initViews();
    }

    private void initViews(){

        viewPager= (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyAdapter());
    }


    class MyAdapter extends PagerAdapter{


        @Override
        public int getCount() {
            return viewList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
            container.removeView(viewList.get(position));
        }

        @Override
        public int getItemPosition(Object object) {
            return super.getItemPosition(object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(viewList.get(position));
            return viewList.get(position);
        }
    }

}
