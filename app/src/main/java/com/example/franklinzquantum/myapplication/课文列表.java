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

        changeTheme();

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
                      //  Toast.makeText(课文列表.this,"你点击了"+i+"按钮",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(课文列表.this,read_book.class);//还是跳转到改Activity
                        intent.putExtra("filename", (filename*100)+i+1);//传入路径
                        startActivity(intent);
                        break;//当我们点击某一项就能吐司我们点了哪一项

                    case 1:
                      //  Toast.makeText(课文列表.this,"你点击了"+i+"按钮",Toast.LENGTH_SHORT).show();
                        break;


                }
            }
        });








    }

    String data_of_1[] = {"B1Урок 1","B1Урок 2","B1Урок 3","B1Урок 4","B1Урок 5","B1Урок 6","B1Урок 7","B1Урок 8","B1Урок 9","B1Урок 10"};
    String data_of_2[] = {"B2Урок 1","B2Урок 2","B2Урок 3","B2Урок 4","B2Урок 5","B2Урок 6","B2Урок 7","B2Урок 8","B2Урок 9","B2Урок 10"};









    public void changeTheme(){
        int state_of_theme=通用读取.read("theme");
        switch ( state_of_theme){
            case 0:
                break;
            case 1:

                getWindow().setBackgroundDrawableResource(R.mipmap.background1);
                break;
            case 2:

                getWindow().setBackgroundDrawableResource(R.mipmap.background2);
                break;

        }
    }










}


