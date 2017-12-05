package com.lht.employ.employ_next_year.Fragments.shouye.tuijian;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lht.employ.employ_next_year.R;
import com.lht.employ.employ_next_year.Views.DividerGridItemDecoration;
import com.lht.employ.employ_next_year.beans.FragmentBean.BasicFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * 推荐页面
 * Created by LHT on 2017/12/1.
 */

public class TuijianFragment extends BasicFragment {

    private static TuijianFragment instance;
    private static Context mContext;

    public static TuijianFragment getInstance( Context context){

        mContext=context;
        if (instance==null){
            instance=new TuijianFragment();
        }
        return instance;
    }

    View content;
    RecyclerView tuijianListContentContainer;
    List<String> testItems=null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        if(content==null){
            content= (ViewGroup) inflater.inflate(R.layout.tuijian_fragment_content,container,false);
        }
        ViewGroup parent= (ViewGroup) content.getParent();
        if (parent!=null){
            parent.removeView(content);
        }
        initData();
        initView();
        return content;
    }

    @Override
    protected void initData() {
        super.initData();
        testItems=new ArrayList<>();
        for (int i='A';i<='Z';i++){
            testItems.add(""+(char)i);
        }
    }

    @Override
    protected void initView() {
        super.initView();
        tuijianListContentContainer= (RecyclerView) content.findViewById(R.id.tuijianListContentContainer);
        tuijianListContentContainer.setAdapter(new MyRecyclerAdapter());
        tuijianListContentContainer.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        //设置Item增加、移除动画
        tuijianListContentContainer.setItemAnimator(new DefaultItemAnimator());
        //添加分割线
        tuijianListContentContainer.addItemDecoration(new DividerGridItemDecoration(getActivity()));
    }

    class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyHolder>{

        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            MyHolder myHolder=new MyHolder(LayoutInflater.from(getActivity()).
                    inflate(R.layout.test_recycler_item,parent,false));
            return myHolder;
        }

        @Override
        public void onBindViewHolder(MyHolder holder, int position) {

            holder.testText.setText(testItems.get(position));
        }

        @Override
        public int getItemCount() {
            return testItems.size();
        }

        class MyHolder extends RecyclerView.ViewHolder{

            TextView testText;
            public MyHolder(View itemView) {
                super(itemView);
                testText= (TextView) itemView.findViewById(R.id.testRecyclerItem);
            }
        }

    }
}
