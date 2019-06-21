package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class class6 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class6);
        ListView listView = (ListView) findViewById(R.id.listview6);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] ={"словарь 字典","Рис 米饭；大米","адрес 地址","море 大海","время 时间","река 河","среда 星期三","Четверг 星期四","часто 经常","Говорить говорю говоришь говорят 说","Смотреть смотрю смотришь смотрят 看","Хотеть хочу хочешь хочет хотим хотите хотят 想","Три 三","Четыре 四","пять 五","шесть 六","Девять 九","Рюмка 高脚酒杯","Аудитория 教室","санатории 疗养院","песня 歌词","хорошо 好","       【语气词】好吧","пиво 啤酒","перерыв 休息","о(об) 关于","Проспект 护照","компьютер 电脑","шофёр 司机","буфет 小卖部","конфета 糖果","обувь 鞋","обед 午饭","Тебя ты的第四格","обедать 吃午饭","вечером 在晚上","весна 春天","весной （在）春天","очень 很；非常","много 很多","писать пишу пишешь пишут 写","почему 为什么"};



















}


