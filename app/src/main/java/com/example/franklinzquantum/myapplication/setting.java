package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
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

        changeTheme();
        final Spinner myspinner=(Spinner)findViewById(R.id.spinner_UI);//声明spinner
        final Button reset=(Button)findViewById(R.id.button26);//重置已经背诵单词
        final Button set_text_size=(Button)findViewById(R.id.button17);//设置字体大小
        final Button set_UI=(Button)findViewById(R.id.button_UI);//设置字体大小
        final TextView set_text_size_t=(TextView)findViewById(R.id.textView_setTextsize);//重置已经背诵单词
        final EditText size=(EditText)findViewById(R.id.editText5);

        String[] value_of_UI = new String[]
                { "无","主题一","主题二" };

        set_text_size_t.setText("当前大小"+通用读取.read("textSize"));
        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (file.exists()) {

                   file.delete();
                }



            }

        });//
        ArrayAdapter<String> adapter_UI = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, value_of_UI);//选书适配

        String chooseTheme=(String)myspinner.getSelectedItem();
        myspinner.setAdapter(adapter_UI);


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




            }

        });//
        set_UI.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){//保存设置的UI主题

                //通用读取.save(sizes,"textSize");
                String chooseTheme=(String)myspinner.getSelectedItem();
                int chooseTheme_int=0;
                Toast.makeText(setting.this,"重启APP后即可更换主题 ",Toast.LENGTH_SHORT).show();
                switch (chooseTheme){
                    case "无":
                        chooseTheme_int=0;
                        break;
                    case "主题一":
                        chooseTheme_int=1;
                        break;
                    case "主题二":
                        chooseTheme_int=2;
                        break;


                }
                通用读取.save(chooseTheme_int,"theme");



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


