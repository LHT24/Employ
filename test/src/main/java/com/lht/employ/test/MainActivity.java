package com.lht.employ.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LinearLayout fragGroup;
    FragmentManager manager=getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivity=this;

        fragGroup= (LinearLayout) findViewById(R.id.fragGroup);

        FragmentTransaction transaction= manager.beginTransaction();
        MainFrag mainFrag=new MainFrag();
        transaction.add(R.id.fragGroup,mainFrag);
        transaction.show(mainFrag);
        transaction.commit();
    }


    public void turnPage(Fragment fragment){

        FragmentTransaction transaction= manager.beginTransaction();
        transaction.replace(R.id.fragGroup,fragment);
        transaction.commit();
        //transaction.addToBackStack(null);
    }

    private static MainActivity mainActivity;

    public static MainActivity getInstance(){

        return mainActivity;
    }

}
