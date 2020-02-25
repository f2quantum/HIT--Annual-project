package com.example.franklinzquantum.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.*;

import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.view.View.OnClickListener;
import android.content.res.Configuration;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;


public class 联系我们 extends AppCompatActivity {


    private AssetManager assetManager;
    private MediaPlayer player = null;


    int x=0;
    int soviet=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contratus);
        final Button grilfriend=(Button)findViewById(R.id.button16);
        final ImageView yyc=(ImageView)findViewById(R.id.imageView2);
        final ImageView hit=(ImageView)findViewById(R.id.imageView);
        final Button  一个神秘按钮 =(Button)findViewById(R.id.button_x);//妓院强者
        final TextView text1=(TextView)findViewById(R.id.textView18);//妓院强者
        final TextView text2=(TextView)findViewById(R.id.textView19);//帅
        final TextView text3=(TextView)findViewById(R.id.textView20);//本项目
        final TextView text4=(TextView)findViewById(R.id.textView17);//单身
        final TextView text5=(TextView)findViewById(R.id.textView13);//学分绩神仙
        final TextView text6=(TextView)findViewById(R.id.textView12);//妓院强者


        // 获取系统剪贴板
        x=0;
        soviet=0;
        // 创建一个剪贴数据集，包含一个普通文本数据条目（需要复制的数据）
     //  final ClipData clipData = ClipData.newPlainText(null, "2446172093");

        // 把数据集设置（复制）到剪贴板


        grilfriend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                x++;
                if(x>=11)
                {
//                    setContentView(R.layout.contratus);
//                    x=0;
                    if(player.isPlaying()){
                        player.pause();
                        grilfriend.setText("播放");
                    }
                    else {
                        player.start();
                        grilfriend.setText("暂停播放");
                    }



                }
                if(x==9){
                    grilfriend.setText("一键苏维埃");
                    soviet++;
                }
                if(x==10){


                    player = new MediaPlayer();

                    assetManager = getAssets();
                    try {
                        AssetFileDescriptor fileDescriptor = assetManager.openFd("music_demo.mp3");
                        player.setDataSource(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getStartOffset());
                        player.prepare();
                        player.start();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    yyc.setImageDrawable(getResources().getDrawable(R.mipmap.yyc2));
                    hit.setImageDrawable(getResources().getDrawable(R.mipmap.cccp));

                    text1.setText("第三十八近卫步兵师政委");
                    text2.setText("We can do it !--尼古拉·翌辰夫斯基");
                    text3.setText("余古拉·翌辰夫斯基同志！");
                    text4.setText(" Союз Советских ");
                    text5.setText("If Lenin could see us now");
                    text6.setText("Социалистических Республик");
                    text6.setTextColor(Color.parseColor("#FF0000"));
                    grilfriend.setText("暂停播放");
                    一个神秘按钮.setVisibility(View.VISIBLE);

                    Toast.makeText(联系我们.this,"政委羿辰夫斯基QQ号已复制到您的剪切板 "+x,Toast.LENGTH_SHORT).show();


                }
                if(x==1)

                Toast.makeText(联系我们.this,"计院强者余羿辰QQ号已复制到您的剪切板 "+x,Toast.LENGTH_SHORT).show();

                final ClipboardManager clipboard = (ClipboardManager) 联系我们.this.getSystemService(Context.CLIPBOARD_SERVICE);

                final ClipData clipData = ClipData.newPlainText(null, "2446172093");
                clipboard.setPrimaryClip(clipData); // 把数据集设置（复制）到剪贴板
            }



        });







    }




}


