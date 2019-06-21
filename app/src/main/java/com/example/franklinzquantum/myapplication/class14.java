package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class class14 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class14);
        ListView listView = (ListView) findViewById(R.id.listview14);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] = {"одйн, одна, одно, одни 一","два, две	二","три	三","одйннадцать	十一","двенадцать	十二","тринадцать	十三","четырнадцать	十四","пятнадцать	十五","шестнадцать	十六","семнадцать	十七","восемнадцать	十八","девятнадцать	十九","двадцать	二十","трйдцать	三十","больше всего	最","композйтор	作曲家","скажй(те)【命令式】请问","какой Ш怎样的，什么样的","победа	胜利","государственный 国立的.国家的 ","дружба	友谊","разный不同的","страна国家","юридический法律（上）的","дорогой贵重的；宝贵的； 亲爱的","принимать, -аю -аешь, -ают【未】// 【完】 принять, приму примешь, npимym: принял -яла, -яли录取；接受","редко稀少地，很少地","наверное大槪","забыть, -буду, -будешь, -будут 【完】//забывать,	аюешь,ают忘记；忽略","занятый, занят, -а -ы忙，有亊，没空儿 ","просить, прошу  просишь, просят попросйть (когд-что 接不定式）	请求","удовольствие	偷快，高兴","с удовольствием	很髙兴","коротко	简短地","Мапо【用作不定量数词】少，不多 ","тысяча 	一千","опытный	有经验的","сорок	四十","японский	曰本的","французский	法国的","нсмёцкий	德国的"};
























}


