package com.example.franklinzquantum.myapplication;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.KeyEvent.KEYCODE_BACK;

public class read_book extends Activity {

    private AssetManager assetManager;
    private MediaPlayer player = null;
   int isPlaying=0;
   int playtimes=0;
    private TextView bookContent = null ;//显示文本的组件
    private FloatingActionButton AButton=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_book_pro);

        bookContent = (TextView)findViewById(R.id.book_content_2);//绑定文本组件
        bookContent.setMovementMethod(ScrollingMovementMethod.getInstance());//给文本组件加入滚动条
        AButton=(FloatingActionButton)findViewById(R.id.floatingActionButton3);//播放按钮
        bookContent.setTextSize(通用读取.read("textSize"));
       // String txtFilePath = getIntent().getStringExtra("txtFilePath");//获取传进来的文本路径//Todo 根据传入intent调用文本
        String txtFilePath="/mnt/shared/Other/ddd.txt";

        Intent it = getIntent();
        int filename= it.getIntExtra("filename",1);
        int 册=filename/100;
        int 课=filename%100;
        setTitle("第"+册+"第"+课+"课文");







        if(txtFilePath != null||true){//如果有传进数据
           // int index = txtFilePath.lastIndexOf(File.separator);//用来截取文本的名字的第一个参数
           // String name = txtFilePath.substring(index+1, txtFilePath.length());//截取文本名字
           // setTitle(name);//设置标题为文本名字
            try {
                InputStream fr = getAssets().open("ddd.txt");
                //FileInputStream fr = new FileInputStream(txtFilePath);//文件输出流
                BufferedReader br = new BufferedReader(new InputStreamReader(fr, "utf-8"));//缓冲读取文件数据
                String line = "" ;//记录每一行数据
                String content = "" ;
                while((line = br.readLine()) != null){//如果还有下一行数据
                    content += line + "\n" ;
                }
                bookContent.setText(content);;//追加显示数据
                br.close();//关闭文件输出流
                fr.close();//关闭缓冲区
            } catch (IOException e) {//抛出异常
                Toast.makeText(read_book.this, "没有此文件！", Toast.LENGTH_SHORT).show();//提示异常
                finish();//直接关闭界面
            }
        }

        AButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if(isPlaying==0&&playtimes==0){
                    player = new MediaPlayer();

                    assetManager = getAssets();
                    try {
                        AssetFileDescriptor fileDescriptor = assetManager.openFd("201.mp3");
                        player.setDataSource(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getStartOffset());
                        player.prepare();
                        player.start();
                        isPlaying=1;
                        playtimes++ ;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                else if(isPlaying==1){
                    isPlaying=0;
                    player.pause();
                }
                else if(isPlaying==0&&playtimes>0){
                    player.start();
                    isPlaying=1;
                }








            }

        });//
    }
    public boolean onKeyDown(  int keyCode, KeyEvent event) {//直接跳回
        if ((keyCode == KEYCODE_BACK) ) {

            player.stop();
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


}

