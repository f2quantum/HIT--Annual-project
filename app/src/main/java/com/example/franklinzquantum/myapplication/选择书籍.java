package com.example.franklinzquantum.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.design.internal.BottomNavigationItemView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.view.View.OnClickListener;
import android.content.res.Configuration;
import android.widget.Toast;




public class 选择书籍 extends AppCompatActivity {



    public int times;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookchoose);

        Intent it = getIntent();
        times= it.getIntExtra("choose",1);

        ImageButton book1=(ImageButton)findViewById(R.id.imageButton);

        ImageButton book2=(ImageButton)findViewById(R.id.imageButton2);

        ImageButton book3=(ImageButton)findViewById(R.id.imageButton3);
        book1.setOnClickListener(new myClickListener());//
        book2.setOnClickListener(new myClickListener());//
        book3.setOnClickListener(new myClickListener());//







    }

    private    class myClickListener implements OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.imageButton: // 进入词表
                    Toast.makeText(选择书籍.this,"大学俄语第一册 ",Toast.LENGTH_SHORT).show();

                    //intent.putExtra("filename", i+1);//传入路径
                    if(times==1){
                        Intent intent_wordList=new Intent(选择书籍.this,词表.class);
                        startActivity(intent_wordList);
                    }
                    else if(times==2){
                        Intent intent_wordList=new Intent(选择书籍.this,课文列表.class);
                        intent_wordList.putExtra("filename", 1);//传入路径
                        startActivity(intent_wordList);

                    }


                    break;
                case R.id.imageButton2://单词查询


                    if(times==1){
                        Toast.makeText(选择书籍.this,"正在制作敬请期待 咕咕咕 ",Toast.LENGTH_SHORT).show();

                    }
                    else if(times==2){
                        Intent intent_wordList=new Intent(选择书籍.this,课文列表.class);
                        intent_wordList.putExtra("filename", 2);//传入路径
                        startActivity(intent_wordList);

                    }


                    break;
                case R.id.imageButton3://俄语新闻
                    Toast.makeText(选择书籍.this,"正在制作敬请期待 ",Toast.LENGTH_SHORT).show();

                    break;


            }
            //Toast.makeText(词表.this,"第一课单词 ",Toast.LENGTH_SHORT).show();
            //Intent intent_class1=new Intent(词表.this,class1.class);
            //startActivity();
        }
    }






}


