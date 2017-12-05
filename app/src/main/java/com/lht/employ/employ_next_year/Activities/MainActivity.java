package com.lht.employ.employ_next_year.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.lht.employ.employ_next_year.Fragments.dongtai.DongTaiFragment;
import com.lht.employ.employ_next_year.Fragments.fengqu.FenquFragment;
import com.lht.employ.employ_next_year.Fragments.shouye.ShouyeFrament;
import com.lht.employ.employ_next_year.Fragments.xiaoxi.XiaoXiFragment;
import com.lht.employ.employ_next_year.R;
import com.lht.employ.employ_next_year.beans.ActivityBean.BasicAppCpmpatActivity;

public class MainActivity extends BasicAppCpmpatActivity {

    FragmentTabHost tabhost;
    String[] fragTags;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    @Override
    protected void initData() {

        fragTags=new String[]{
                "shouye","fenqu","dongtai","xiaoxi"
        };
    }

    @Override
    protected void initView() {

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        tabhost= (FragmentTabHost) findViewById(android.R.id.tabhost );
        tabhost.setup(this,getSupportFragmentManager(),android.R.id.tabcontent);
        tabhost.getTabWidget().setDividerDrawable(null);//去掉分割线

        Class[] fraClass = {ShouyeFrament.class, FenquFragment.class, DongTaiFragment.class, XiaoXiFragment.class};
        String[] fragTittle = {  "首页","分区","动态","消息"};
        int[] icon = {R.drawable.bottomnav_shouye_icon_selector, R.drawable.bottomnav_fenqu_icon_selector,
                R.drawable.bottomnav_dongtai_icon_selector,  R.drawable.bottomnav_xiaoxi_icon_selector};
        for (int i = 0; i < fragTittle.length; i++) {
            //newTabSpec生成选项卡，参数：表示Tag
            TabHost.TabSpec mTabSpec = tabhost.newTabSpec(fragTags[i]);
            //设置选项卡样式
            mTabSpec.setIndicator(getTabHostItemView(icon[i], fragTittle[i]));
            //添加选项卡
            tabhost.addTab(mTabSpec, fraClass[i], null);
        }

    }


    public View getTabHostItemView(int icon, String itemText) {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.bottom_tabitem, null);
        TextView mItemText = view.findViewById(R.id.bootomTab_itemText);
        ImageView mItemImg = view.findViewById(R.id.bootomTab_itemView);
        mItemImg.setImageResource(icon);
        mItemText.setText(itemText);
        return view;
    }

}
