package com.example.franklinzquantum.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.view.View.OnClickListener;
import android.content.res.Configuration;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

import static android.view.KeyEvent.KEYCODE_BACK;


public class MainActivity extends AppCompatActivity {


    public int static_Mode=0;
    public int login_or_not_stat=0;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_main);

        changeTheme();
        //加载主题界面




        Button enterList=(Button)findViewById(R.id.button10);
        Button wordLookUp=(Button)findViewById(R.id.button11);
        Button russianNews=(Button)findViewById(R.id.button12);
        Button reciteWord=(Button)findViewById(R.id.button13);
        Button contratUs=(Button)findViewById(R.id.button14);
        Switch nightMode=(Switch)findViewById(R.id.switch1);
        Button setting=(Button)findViewById(R.id.button25);
        Button button_workshop=(Button)findViewById(R.id.button_workshop);//俄语歌曲
        Button my_book=(Button)findViewById(R.id.my_book);//俄语歌曲
       final Button signin=(Button)findViewById(R.id.SignIn);//登录
       final TextView login_or_not=(TextView)findViewById(R.id.textView30);


        enterList.setOnClickListener(new myClickListener());//
        contratUs.setOnClickListener(new myClickListener());//
        wordLookUp.setOnClickListener(new myClickListener());//
        russianNews.setOnClickListener(new myClickListener());//
        nightMode.setOnClickListener(new myClickListener());//
        reciteWord.setOnClickListener(new myClickListener());//
        setting.setOnClickListener(new myClickListener());//
        button_workshop.setOnClickListener(new myClickListener());//
        my_book.setOnClickListener(new myClickListener());//
        signin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(login_or_not_stat==0){
                    Intent intent_signin=new Intent(MainActivity.this,登录界面.class);
                    startActivity(intent_signin);
                }else{
                    通用读取.save(0,"login");
                    login_or_not_stat=0;
                        login_or_not.setText("当前状态：未登录");
                        signin.setText("登录");
                }
            }
        });

        login_or_not_stat=0;// 配置初始化/再入登录状态
        login_or_not_stat=通用读取.read("login");
        if(login_or_not_stat==1){
            login_or_not.setText("已登录");
            signin.setText("注销登录");
        }

        File file_size = new File( "/data/data/com.example.franklinzquantum.myapplication/textSize.txt");
        if (!file_size.exists()) {
            通用读取.save(14,"textSize");

        }








    }
    private    class myClickListener implements OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button10: // 进入词表
                    // Toast.makeText(MainActivity.this,"词表进入 ",Toast.LENGTH_SHORT).show();
                    Intent intent_wordList=new Intent(MainActivity.this,选择书籍.class);
                    intent_wordList.putExtra("choose", 1);
                    startActivity(intent_wordList);

                    break;

                case R.id.button11://单词查询
                    Intent intent_wordlookup=new Intent(MainActivity.this,单词查询.class);
                    startActivity(intent_wordlookup);

                    break;
                case R.id.button12://俄语新闻
                    Intent intent_russiannews=new Intent(MainActivity.this,俄语咨询.class);
                    startActivity( intent_russiannews);
                    break;
                case R.id.button13://背单词
                    Intent intent_recite=new Intent(MainActivity.this,背单词.class);

                    startActivity( intent_recite);

                    break;
                case R.id.button14:// 联系我们
                    //Toast.makeText(MainActivity.this,"联系我们 ",Toast.LENGTH_SHORT).show();
                    Intent intent_contratUs=new Intent(MainActivity.this,联系我们.class);
                    startActivity(intent_contratUs);

                    break;
                case R.id.switch1://夜间模式

                    if(static_Mode==1) {
                        Toast.makeText(MainActivity.this, "假装已启动夜间模式 ", Toast.LENGTH_SHORT).show();

                        setTheme(R.style.AppTheme_NoActionBar);
                        static_Mode=0;
                    }
                    else {
                        Toast.makeText(MainActivity.this, "假装已启动日间模式 ", Toast.LENGTH_SHORT).show();
                        setTheme(R.style.AppTheme_NoActionBar);

                        static_Mode=1;
                    }


                    break;
                case R.id.button25:// 设置
                    //Toast.makeText(MainActivity.this,"联系我们 ",Toast.LENGTH_SHORT).show();
                    Intent intent_setting=new Intent(MainActivity.this,setting.class);
                    startActivity(intent_setting);

                    break;
                case R.id.button_workshop:// 创意工坊
                    //Toast.makeText(MainActivity.this,"联系我们 ",Toast.LENGTH_SHORT).show();
                    Intent intent_music=new Intent(MainActivity.this,Workshop.class);
                    startActivity(intent_music);

                    break;

                case R.id.my_book: // 课本
                    // Toast.makeText(MainActivity.this,"词表进入 ",Toast.LENGTH_SHORT).show();
                    Intent intent_mybook=new Intent(MainActivity.this,选择书籍.class);
                    intent_mybook.putExtra("choose", 2);
                    startActivity(intent_mybook);

                    break;





            }

        }
    }

    public boolean onKeyDown(  int keyCode, KeyEvent event) {//直接跳回
        if ((keyCode == KEYCODE_BACK) ) {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(0);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
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


