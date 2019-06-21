package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class class9 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class9);
        ListView listView = (ListView) findViewById(R.id.listview9);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] = {"Скажи(те) 请问","Болишой 大的","великий 伟大的，大的","стоять стою","стоишь стоят 站着，立放","университет 大学","столовая 食堂；饭厅","телевизор 电视","учиться учусь учишься учатся 学习","раньше 以前，从前","лежать лежу лежишь лежат 平放，躺","упражнение 练习","деревня 农村","рассказывать рассказываю рассказываешь рассказывают 讲述","быть 在；有；是","позавчера 前天","Парк 公园；场；库","кремль （古俄罗斯城堡的）内墙","товарищ 同学，同事，同志","домой 回家，往家里","площадь 广场","Ученик 【阳】","Ученица 【阴】（中小学的）学生","учить учу учишь учат 学，背诵；教","сочинение 作文","давно 很早以前，早就；很久","видеть вижу видишь видят 看见","ждать жду ждёшь ждут 等待；等","школьник 中小学的","петь пою","поёшь поют 唱歌","гитара 吉他","играть на","гитара 弹吉他","песня 歌曲","жаль 遗憾，可惜；可怜","весь вся всё все 全部；整个","гулять гуляю гуляешь гуляют 散步","Фотографироваться фотографируюсь фотографируешься фотографируются 摄影，照相","ну 是吗？真的吗？","   喂（表示催促、号召等）","оба 两者都","математика 数学","вместе 在一起","задание 作业；任务","теперь 现在","выходной 休息的；休假的","день 天；日子","собраться 聚到一起；集合","ребята 小伙子们；同学们，同伴们","вспоминать вспоминаю вспоминаешь вспоминают 回忆起，想起","жизнь 生活；生命","Такой 这样的","кто такой? 究竟是谁？","Что такое? 究竟是什么?"};























}


