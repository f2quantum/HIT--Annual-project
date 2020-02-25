package com.example.franklinzquantum.myapplication;
import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;


import com.example.franklinzquantum.myapplication.R;
import com.example.franklinzquantum.myapplication.考研6000词;
import com.example.franklinzquantum.myapplication.考研6001词;



public class 单词查询 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordlookup);
        changeTheme();
        String[] value = new String[]
                { "大学俄语东方","6000考研俄语高频词汇" };

        String[] value2 = new String[]
                { "大学俄语东方" };
        String[]  词库=合并数组.contact(考研6000词.getArray(),考研6001词.getArray());


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,词库);//查词适配

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, value);//选书适配

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, value);


        final AutoCompleteTextView autoCompleteTextView =
                (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter);     // 绑定adapter

        final Spinner myspinner=(Spinner)findViewById(R.id.spinner2);
        myspinner.setAdapter(adapter2);
        String 选择的单词书=(String)myspinner.getSelectedItem();


       final  Button find=(Button)findViewById(R.id.button_find);
        find.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                 Editable findss= autoCompleteTextView.getText();
                 String  findx=findss.toString();
                 if("".equals(findx)) {
                     Toast.makeText(单词查询.this,"请输入有效内容 ",Toast.LENGTH_SHORT).show();
                     return;
                 }
                Intent it=new Intent(单词查询.this,查词显示.class);
                 it.putExtra("word", findx);
                startActivity(it);




            }

        });//













    }
    public void changeTheme(){
        int state_of_theme=通用读取.read("theme");
        switch ( state_of_theme){
            case 0:
                break;
            case 1:

                getWindow().setBackgroundDrawableResource(R.mipmap.background1);
                break;
            case 2:

                getWindow().setBackgroundDrawableResource(R.mipmap.background2);
                break;

        }
    }





}



