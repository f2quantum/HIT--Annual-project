package com.example.franklinzquantum.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import Algo.*;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Algo.*;
//暂时前15课
public class 背单词 extends AppCompatActivity {

    int times;
    int stage;
    File file = new File("/data/data/com.example.franklinzquantum.myapplication/save.txt");


    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.recite);

        final Button A=(Button)findViewById(R.id.button21);//太简单
        final Button B=(Button)findViewById(R.id.button19);//认识
        final Button C=(Button)findViewById(R.id.button20);//不认识
        final TextView  tv=(TextView) findViewById(R.id.textView25);//单词
        final TextView  av=(TextView) findViewById(R.id.textView24);//进度
        final  TextView  cl=(TextView) findViewById(R.id.textView27);//第X课





        final String [][]data=背单词词库.load();


         if (file.exists()) {

            times=读取与保存.read();
        }
        else times=1;

        int  cls=getClass.getclass(times);
        int mod=getClass.getmod(times);//第X课第mod个


        av.setText( "已背诵了"+times+"个单词");
        cl.setText("当前课：第"+cls+"课");

        if(times==1){//初始化



            tv.setText(regex.regex(data[1][1]));

        }
        if(times!=1){

            tv.setText(regex.regex(data[cls][mod]));
        }












            //点击后再加载
        A.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){//太简单
                    times++;
                     读取与保存.save(times);

               int cls=getClass.getclass(times);
                av.setText( "您已背诵了"+times+"个单词");
                cl.setText("当前课：第"+cls+"课");
                int mod=getClass.getmod(times);
                tv.setText(regex.regex(data[cls][mod]));


            }

        });//
        B.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){//认识
                times++;


                读取与保存.save(times);
                int cls=getClass.getclass(times);
                av.setText( "您已背诵了"+times+"个单词");
                cl.setText("当前课：第"+cls+"课");
                int mod=getClass.getmod(times);
                tv.setText(regex.regex(data[cls][mod]));

            }

        });//
        C.setOnClickListener(new View.OnClickListener(){//不认识
            public void onClick(View v){
                times++;

                读取与保存.save(times);
//                int cls=getClass.getclass(times);
//                av.setText( "您已背诵了"+times+"个单词");
//                cl.setText("当前课：第"+cls+"课");
//                int mod=getClass.getmod(times);
//                tv.setText(regex.regex(data[cls][mod]));

                Intent intent_recite=new Intent(背单词.this,Notknow.class);
                intent_recite.putExtra("time", times-1);

                 startActivity( intent_recite);

            }

        });//

    }

}