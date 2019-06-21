package com.example.franklinzquantum.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class 查词显示 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lookup2);
        Intent it = getIntent();
        String word=it.getStringExtra("word");
        TextView display=(TextView)findViewById(R.id.textView7);
        display.setText(word);










    }























}


