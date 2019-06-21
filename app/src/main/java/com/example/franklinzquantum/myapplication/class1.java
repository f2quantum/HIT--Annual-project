package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class class1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class1);
        ListView listView = (ListView) findViewById(R.id.listview1);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] = {"Папа 爸爸","Мама 妈妈","Там 那里","Тут 这里","От 从......；由......","У 在......旁边；在......那里","Ум 智慧","Томат 番茄","Потом 然后","Потому 因此，所以","Это 这是","Поэт 诗人","Поэтому 所以，因此","А 而"};

























}


