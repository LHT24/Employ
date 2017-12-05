package com.lht.employ.employ_next_year.Fragments.shouye;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lht.employ.employ_next_year.Fragments.shouye.tuijian.TuijianFragment;
import com.lht.employ.employ_next_year.Fragments.shouye.yingshi.YingShiFragment;
import com.lht.employ.employ_next_year.Fragments.shouye.zhibo.ZhiboFragment;
import com.lht.employ.employ_next_year.Fragments.shouye.zhuanlan.ZhuanLanFragment;
import com.lht.employ.employ_next_year.Fragments.shouye.zhuifan.ZhuiFanFragment;
import com.lht.employ.employ_next_year.R;
import com.lht.employ.employ_next_year.beans.FragmentBean.BasicFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页fragment
 * Created by LHT on 2017/11/30.
 */
public class ShouyeFrament extends BasicFragment {

    private final String TAG="ShouyeFrament";

    View content=null;

    //toolbar元素
    ImageView userHeadImg =null;//头像
    ImageView toobar_userHead_infoMark=null;//消息标记
    ImageView toobarQRIcon ;//二维码图标
    ImageView toolbarGameIcon;//游戏图标
    ImageView toobarHuancunIcon;//缓存图标
    ImageView toobarSousuoIcon;//搜索图标
    //首页顶部导航栏
    TabLayout topNavBar;

    ViewPager shouyeChildContainer;
    List<BasicFragment> childFrags;
    List<String> childFragsTabTittles;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG,"onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Log.v(TAG,"onCreateView");
        if (content==null) {
            content = inflater.inflate(R.layout.shouye_fragment_content, container, false);
            initData();
            initView();
            initEvent();
        }
        ViewGroup parent= (ViewGroup) content.getParent();
        if(parent!=null){
            Log.e(TAG,"parent is "+parent.getClass());
            parent.removeView(content);
        }

        return content;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v(TAG,"onActivityCreated");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v(TAG,"onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"onDestroy");
    }

    /**
     * onPase()之后调用
     * @param outState
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.v(TAG,"onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void initData() {
        super.initData();
        childFrags=new ArrayList<>();
        childFrags.add(ZhiboFragment.getInstance(getActivity()));
        childFrags.add(TuijianFragment.getInstance(getActivity()));
        childFrags.add(ZhuiFanFragment.getInstance(getActivity()));
        childFrags.add(YingShiFragment.getInstance(getActivity()));
        childFrags.add(ZhuanLanFragment.getInstance(getActivity()));

        childFragsTabTittles=new ArrayList<>();
        Resources resources=getActivity().getResources();
        childFragsTabTittles.add(resources.getString(R.string.zhibo));
        childFragsTabTittles.add(resources.getString(R.string.tuijian));
        childFragsTabTittles.add(resources.getString(R.string.zhuifan));
        childFragsTabTittles.add(resources.getString(R.string.yingshi));
        childFragsTabTittles.add(resources.getString(R.string.zhuanlan));
    }

    @Override
    protected void initView() {
        super.initView();
        shouyeChildContainer=content.findViewById(R.id.shouyeChildContainer);
        shouyeChildContainer.setAdapter(new MyFragmentAdapter(getActivity().getSupportFragmentManager()));
        //顶部导航栏
        topNavBar=content.findViewById(R.id.topNavBar);
        topNavBar.setupWithViewPager(shouyeChildContainer);
        topNavBar.getTabAt(1).select();
    }

    @Override
    protected void initEvent() {
        super.initEvent();
    }

    /**
     * 自定义ViewPager适配器，用于加载fragment
     */
    private class MyFragmentAdapter extends FragmentPagerAdapter{

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return childFrags.get(position);
    }

    @Override
    public int getCount() {
        return childFrags.size();
    }

        @Override
        public CharSequence getPageTitle(int position) {
            return childFragsTabTittles.get(position);
        }
    }

}
