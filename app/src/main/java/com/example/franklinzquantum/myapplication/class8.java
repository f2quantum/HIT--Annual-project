package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class class8 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class8);
        ListView listView = (ListView) findViewById(R.id.listview8);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] = {"Календарь 日历","Январь 一月","февраль 二月","март 三月","апрель 四月","май 五月","июнь 六月","август 八月","сентябрь 九月","октябрь 十月","ноябрь 十一月","декабрь 十二月","Вставать встаю встаёшь встают 起来；起床","завтракать завтракаю завтракаешь завтракают 吃早饭"};
























}


