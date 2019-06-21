package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class class11 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class11);
        ListView listView = (ListView) findViewById(R.id.listview11);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] = {"рисовать, -сую -суешь -суют 素描，画（素描）画 ","фотографйровать, -рую -руешь,-руюут拍照.摄影","симпатичный	讨人喜欢的，惹人 爱的","молодой	年轻的","высокий	高的","мужчйна 【阳】	男人","энергичный	精力充沛的","женщина女人","профессор,教授","декан	系主任","переводить, -ожу,	-oдишь, -oдят翻译；领过去，调任	","блог博客","писать в блог (блоге)写博客","посещать, -аю -аешь, -ают (когд- что)	拜访，访问，参观","родственник 【阳】","рoдственница[阴]亲戚，亲属","готовить, -вяю, -вишь -вят (что)准备","встречать, -аю -аешь, -ают (когд- что)	遇见；迎接","российский	俄罗斯的","делегация	代表团","зэропорт	航空港，飞机场","извенй(те)【命令式】对不起","немнбго 【副】	不多，一点","искусство	艺术","народный	民间的；人民的","красавица	美女，美人","?Спящая красавица》《睡美人》","прекрасный	非常美丽的","филологический	语文（学）的","первый 	第一的","курс	年级","история	历史；往亊；故事","другой	别的；不同的","предмет	(教学）课程","известный	著名的","поликлйника	门诊部","международный	国际的","Кинофестиваль【阳】电影节","иностранный	外国的","американский	美国的，关洲的","Журналист阳	","журналйстка 【阴】	新闻记者","свободный	空闲的；自由的","думать, -аю -аешь	 -ают (о ком-чём)	认为，以为"};
























}


