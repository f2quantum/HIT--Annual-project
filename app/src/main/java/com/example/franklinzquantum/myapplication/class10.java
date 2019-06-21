package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class class10 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class10);
        ListView listView = (ListView) findViewById(R.id.listview10);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] = {"городской 市立的；城市的","Детство 童年","детский 儿童的","молодой 年轻的","красный 红色的","домашний 家庭的","синйй 蓝色的","вечернйй 晚上的；参加晚会穿的","английский 英国的；英语的","плохой 不好的","свежий 新鲜的","горячий 热的；热烈的","Пальто 大衣","дерево 树","человек 人","зимний 冬天的；冬季用的","Квартира 一套房间（独户的）住房","вода 复воды 水","рабочий 办公的；工人的；工人","средний 中间的；中等的；平均的","Китайский 中国的","Маленький 小的；","лекция （大学的）讲座，讲课","родители 父母，双亲","дворец 宫殿；馆","летний 夏天的","Занятие 课堂，课","или 或者","Старший 年长的；年岁最大的","младший 年级较小的","московский 莫斯科的","кинотеатр 电影院","Больница 医院","свой своя своё свои 自己的","сидеть сижу сидишь сидят 坐着","Торговый 贸易的","Фирма 公司","Медицинский 医学的","пекинский 北京的","Исторический 历史的","факультет 系","почему 为什么","больной 有病的；病人","Москвич 【阳】","Москвичка 【阴】莫斯科人","родиться 出生；产生","уже 已经","Педагогический 师范的","звать зову зовёшь зовут 招呼；叫来；叫做","Специальность 专业","Литература 文学","недавно 不久","каждый 每个；每","Кроме того 除此之外，此外","видеофильм 影视剧","даже 甚至","весёлый 快乐的","Добрый 善良的","Родной 家乡的；亲爱的","рассказ 讲述，故事，短篇小说","знаменитый 著名的","Место 地方，座位","ли 是否，吗"};






















}


