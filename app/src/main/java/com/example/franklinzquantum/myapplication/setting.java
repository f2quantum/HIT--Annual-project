package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;


public class setting extends AppCompatActivity {




    File file = new File("/data/data/com.example.franklinzquantum.myapplication/save.txt");
    File file_size = new File( "/data/data/com.example.franklinzquantum.myapplication/textSize.txt");
    public int SizeText=14;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        final Button reset=(Button)findViewById(R.id.button26);//重置已经背诵单词
        final Button set_text_size=(Button)findViewById(R.id.button17);//设置字体大小
        final TextView set_text_size_t=(TextView)findViewById(R.id.textView_setTextsize);//重置已经背诵单词
        final EditText size=(EditText)findViewById(R.id.editText5);

        set_text_size_t.setText("当前大小"+通用读取.read("textSize"));
        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (file.exists()) {

                   file.delete();
                }



            }

        });//
        set_text_size.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int sizes =Integer.parseInt(size.getText().toString());
                if(sizes>=10&&sizes<=30){
                    通用读取.save(sizes,"textSize");
                    set_text_size_t.setText("当前大小"+通用读取.read("textSize"));
                    Toast.makeText(setting.this, "成功设置字体大小为"+通用读取.read("textSize"), Toast.LENGTH_SHORT).show();//提示异常
                }
                else{
                    Toast.makeText(setting.this, "请输入10-30的整数！", Toast.LENGTH_SHORT).show();//提示异常
                }
                set_text_size_t.setText("当前大小"+通用读取.read("textSize"));



            }

        });//








    }






















}


