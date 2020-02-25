package com.example.franklinzquantum.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.view.View.OnClickListener;
import android.content.res.Configuration;
import android.widget.Toast;


public class 词表 extends AppCompatActivity {





    public int static_Mode=1;
    private Button button_lesson1;
    private  Button button_night1;
    private  Button  button_lesson2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeTheme();

        button_lesson1=(Button)findViewById(R.id.button1);

        button_lesson2=(Button)findViewById(R.id.button2);
        Button button_lesson3=(Button)findViewById(R.id.button);//第三课
        Button button_lesson4=(Button)findViewById(R.id.button3);
        Button button_lesson5=(Button)findViewById(R.id.button4);
        Button button_lesson6=(Button)findViewById(R.id.button5);
        Button button_lesson7=(Button)findViewById(R.id.button6);
        Button button_lesson8=(Button)findViewById(R.id.button7);
        Button button_lesson9=(Button)findViewById(R.id.button8);
        Button button_lesson10=(Button)findViewById(R.id.button9);
        Button button_lesson11=(Button)findViewById(R.id.button_class11);
        Button button_lesson12=(Button)findViewById(R.id.button_class12);
        Button button_lesson13=(Button)findViewById(R.id.button_class13);
        Button button_lesson14=(Button)findViewById(R.id.button_class14);
        Button button_lesson15=(Button)findViewById(R.id.button_class15);


        button_lesson1.setOnClickListener(new myClickListener());//第一课

        button_lesson2.setOnClickListener(new myClickListener2());//第二课
        button_lesson3.setOnClickListener(new myClickListener3());//第一课
        button_lesson4.setOnClickListener(new myClickListener4());//第一课
        button_lesson5.setOnClickListener(new myClickListener5());//第一课
        button_lesson6.setOnClickListener(new myClickListener6());//第一课
        button_lesson7.setOnClickListener(new myClickListener7());//第一课
        button_lesson8.setOnClickListener(new myClickListener8());//第一课
        button_lesson9.setOnClickListener(new myClickListener9());//第一课
        button_lesson10.setOnClickListener(new myClickListener10());//第一课
        button_lesson11.setOnClickListener(new myClickListener11());//第一课
        button_lesson12.setOnClickListener(new myClickListener12());//第一课
        button_lesson13.setOnClickListener(new myClickListener13());//第一课
        button_lesson14.setOnClickListener(new myClickListener14());//第一课
        button_lesson15.setOnClickListener(new myClickListener15());//第一课






    }


    private    class myClickListener implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第一课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class1.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener2 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第二课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class2.class);
            startActivity(intent_class1);
        }
    }


    private    class myClickListener3 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第三课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class3.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener4 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第四课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class4.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener5 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第五课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class5.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener6 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第六课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class6.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener7 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第七课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class7.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener8 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第八课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class8.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener9 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第九课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class9.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener10 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第十课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class10.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener11 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第十一课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class11.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener12 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第十二课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class12.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener13 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第十三课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class13.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener14 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第十四课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class14.class);
            startActivity(intent_class1);
        }
    }
    private    class myClickListener15 implements OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(词表.this,"第十五课单词 ",Toast.LENGTH_SHORT).show();
            Intent intent_class1=new Intent(词表.this,class15.class);
            startActivity(intent_class1);
        }
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


