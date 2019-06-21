package com.example.franklinzquantum.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class 课文列表 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.classlist);

        Intent it = getIntent();
        final int filename= it.getIntExtra("filename",2);
        String data[]=null;

        ListView listView = (ListView) findViewById(R.id.listview_class);//在视图中找到ListView
        switch (filename){
            case 1:data=data_of_1;
            break;

            case 2:data=data_of_2;
            break;


        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Toast.makeText(课文列表.this,"你点击了"+i+"按钮",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(课文列表.this,read_book.class);//还是跳转到改Activity
                        intent.putExtra("filename", (filename*100)+i+1);//传入路径
                        startActivity(intent);
                        break;//当我们点击某一项就能吐司我们点了哪一项

                    case 1:
                        Toast.makeText(课文列表.this,"你点击了"+i+"按钮",Toast.LENGTH_SHORT).show();
                        break;


                }
            }
        });








    }

    String data_of_1[] = {"B1Урок 1"};
    String data_of_2[] = {"B2Урок 1"};




















}


