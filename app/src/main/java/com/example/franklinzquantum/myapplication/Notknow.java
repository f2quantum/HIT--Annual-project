package com.example.franklinzquantum.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.File;

import Algo.getClass;
import Algo.regex;

import static android.view.KeyEvent.KEYCODE_BACK;


public class Notknow extends AppCompatActivity {




    public int  times;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notknow);
        changeTheme();

        final String [][]data=背单词词库.load();
        Intent it = getIntent();
       times= it.getIntExtra("time",1);

       Button A=(Button)findViewById(R.id.button24);//下一个单词
        TextView Tv=(TextView)findViewById(R.id.textView28);
        TextView av=(TextView)findViewById(R.id.textView29);
        int cls=getClass.getclass(times);
        int mod=getClass.getmod(times);
        Tv.setText(data[cls][mod]);
        av.setText("您已背诵了"+(times)+"个单词");


        A.setOnClickListener(new View.OnClickListener(){//下一个单词
            public void onClick(View v){//
                Intent intent_recite=new Intent(Notknow.this,背单词.class);

                startActivity( intent_recite);


            }

        });









    }
//    public boolean onKeyDown(  int keyCode, KeyEvent event) {//直接跳回
//        if ((keyCode == KEYCODE_BACK) ) {
//            读取与保存.save(times);
//            Intent intent_back=new Intent(Notknow.this,MainActivity.class);
//
//            startActivity( intent_back);
//
//            return true;
//        }
//        return super.onKeyDown(keyCode, event);
//    }


















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


