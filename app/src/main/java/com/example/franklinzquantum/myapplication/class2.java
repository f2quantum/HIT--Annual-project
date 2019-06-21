package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class class2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class2);
        ListView listView = (ListView) findViewById(R.id.listview2);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] ={"Кто 这是","Кот 猫","Он 他，它","Она 她，它","Оно 它","Но 但是","Окно 窗户","У окна 在窗户旁","И 和","Пока 暂时 【语气词】再见 当......的时候","Утка 鸭子","Касса 收银台","Капуста 白菜","Комната 房间","Нос 鼻子","Опасно 危险","Сок 果汁","Суп 汤","Сон 梦","Мост 桥","Сто 一百","Соус 调味汁","Уксус 醋","Сын 儿子","Космос 宇宙","Так 这样","Как 如何，怎样","Ананас 菠萝"};























}


