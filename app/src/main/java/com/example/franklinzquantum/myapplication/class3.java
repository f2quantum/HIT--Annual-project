package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class class3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class3);
        ListView listView = (ListView) findViewById(R.id.listview3);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] ={"Дом 房子","Дома 在家里","Вот 这就是，您看","Вы 您；你们","Выставка 展览；展览会","Суббота 星期六","Сабака 狗","Сумка 手提包","Стакан 杯子","Банк 银行","Буква 字母","Банан 香蕉","Косманавт 宇航员","Фото 照片","Кофта 女短上衣","Сад 花园；果园","Да 是的","Фонтан 喷泉","Кафе 咖啡馆，小吃店","Автобус 公共汽车","вус 高等学校","ваза 花瓶","повар 厨师","завод 工厂","Завтрак 早餐","Зовут （как завут？）叫（叫什么名字？）","музыка 音乐","музыкант 音乐家","когда 什么时候","погода 天气","Нога 脚；腿","Газ 天然气","Гора 山","город 城市","Бар 酒吧","спорт 运动","паспорт 护照","Торт 蛋糕","рано 早","урок 课；功课","утром 在早晨","Утро 早晨","работа 工作；作品","группа 班级；小组","друг 朋友","подруга 女朋友","брат 兄弟","рука 手","рынок 市场","Вход 入口","ухо 耳朵","Сухо 干燥","сахар 糖","стоит 站立着"};






















}


