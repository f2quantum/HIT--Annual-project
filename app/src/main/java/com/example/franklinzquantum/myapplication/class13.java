package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class class13 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class13);
        ListView listView = (ListView) findViewById(R.id.listview13);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] = {"досада	懊丧，懊恼","далеко 远","бассейн	游泳池","спортзал	体育馆","Кажется【插入语】似乎，好像","вернуться, -нусь,.	-нёшься, -нуться【完】	回来，回到","из自，从，从……里 (往外）","впечатление	印象","помнить, -ню, -нишь，-нят(когд-что，о ком-чём)记得，记住","находиться, -ожусь，-одишься.	-ходятся【未】在，位于，处在","ЭКОНОМИСТ	经济学家","фамйлия 姓","артйст 【阳】","Артйстка【阴】 演员	","репортаж	报道","геолог	地质学家","спросить, -ошу -осишь -осят	问，打听","преподавать, -даю, -даёшь, -дают	教，教导","геология	地质学","отчество 父称	","геологический	地质学的","температура 体温：气温	","замечательный	特别好的.卓越的","Болеть【一、二人称不用】疼，痛-ит,-ят","пенсионер (阳)	退休者"," пенсионерка 【阴】	","Голова头","музыкальный	音乐的","потому что	因为","Ничего【用作谓语】不要紧，没有关系	","дружный	友好的，和睦的","по-моему	据我看来，我认为","экскурсия 游览，参观	","счастливый	幸福的","слушать, -шу，-шишь，【未】 //услышать (что)听说；听见 фотоаппарат	照相机，摄影机","аппарат	仪器","цифровой	数码的，数字的","Познакомиться【完】 //【未】знакoмиться, -млюсЬу -мишься, -мятся相识，结识；了 解,熟悉","понимать, -аю -аешь -ают 【未】 //【完】поять ，пойму， поймёщь，Поймут，понял， поняла, поняли (кого-что)	明白，理解","друг друга, друг у друга, друг о друге	互相","удобный	方便的",};
























}


