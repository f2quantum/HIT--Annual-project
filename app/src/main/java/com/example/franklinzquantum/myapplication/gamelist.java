package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class gamelist extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelist);
        ListView listView = (ListView) findViewById(R.id.listview_game);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] ={"1","2","3","4"};





















}


