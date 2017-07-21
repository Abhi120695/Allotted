package com.au.allotedv5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class contributers extends AppCompatActivity {
    private ListView contributerList;
    private SimpleAdapter contributerList1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contributers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        contributerList= (ListView) findViewById(R.id.listView3);
        String[] list = new String[]{"Abhishek Upadhyay","Hussain Khan","Uttkarsh Singh"};
        String[] list2 = new String[]{"Android developer","Project manager","UX/UI designer"};
        List<Map<String, String>> data = new ArrayList<Map<String, String>>();

        for(int i=0;i<3;i++) {
            Map<String, String> datum = new HashMap<String, String>(2);
            datum.put("title",list[i]);
            datum.put( "subtitle",list2[i]);data.add(datum);
        }
        final String [] mapkey =new String[]{"title","subtitle"};
        contributerList1 = new SimpleAdapter(this, data,
                 R.layout.customlist2,mapkey,new int[]{android.R.id.text1,
                android.R.id.text2,});
        contributerList.setAdapter(contributerList1);


    }

}
