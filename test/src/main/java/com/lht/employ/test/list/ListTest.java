package com.lht.employ.test.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

/**
 * Created by LHT on 2017/12/7.
 */

public class ListTest {

    ListView listView;

    public ListView getListView(Context context){

        listView=new ListView(context);
        return listView;
    }

    private class MyListAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}
