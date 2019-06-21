package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class class4 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class4);
        ListView listView = (ListView) findViewById(R.id.listview4);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] ={"НА 在......上面；往，向......上面","Футбол 足球","вокзал 火车站","лампа 灯","яблоко 苹果","Стол 桌子","стул 椅子","Молоко 牛奶","лодка 船","салат 沙拉","Слово 单词","полка 书架","Класс （中小学的）年级，班","цех 车间","центр 中心","конценрт 音乐会","цена 价格","цирк 杂技","я 我","Яйцо 鸡蛋","Ем （我）吃","есть （他，她）吃","Ты 你","мы 我们","Они 他们","мой 我的","твой 你的","сайт 网站","Её 她的","его 他的，它的","поезд 火车","ёлка 新年枞树","новый 新的","старый 旧的","какой 什么样的","наш 我们的","Ваш 你们的","что 什么","шкаф 柜子","Груша 梨","шапка 帽子","машина 机器","картошка 土豆","кошка 猫；母猫","школа 中，小学校","Здравствуй 你(您)好","муж 丈夫","жена 妻子","инженер 工程师","нож 刀子","тоже 也","ужин 晚饭","живу （我）住在","живут （他们）住在"};





















}


