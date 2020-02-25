package com.example.franklinzquantum.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class forum extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forum);
        ListView listView = (ListView) findViewById(R.id.listview_forum);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);
        FloatingActionButton Button_upload=(FloatingActionButton)findViewById(R.id.floatingActionButton_upload);

        Button_upload.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent_back=new Intent(forum.this,upload.class);
                startActivity(intent_back);




            }

        });//






    }

    String data[] ={"欢迎使用俄语论坛功能"," ",""," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};





















}


