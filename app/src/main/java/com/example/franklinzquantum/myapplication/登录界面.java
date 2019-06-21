package com.example.franklinzquantum.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;


public class 登录界面 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        final EditText host=(EditText)findViewById(R.id.editText3);
        final EditText password=(EditText)findViewById(R.id.editText4);

        Button signin=(Button)findViewById(R.id.button_login);
        signin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){


                String number = host.getText().toString().trim();
                String pw =  password.getText().toString().trim();


                if("admin".equals(number)&&"myhappyisall".equals(pw)) {
                    Toast.makeText(登录界面.this,"成功登录",Toast.LENGTH_SHORT).show();
                    Intent it=new Intent(登录界面.this,MainActivity.class);
                 //   it.putExtra("word", findx);
                    通用读取.save(1,"login");
                    startActivity(it);
                    return;
                }
                else{
                    Toast.makeText(登录界面.this,"用户名或者密码错误",Toast.LENGTH_SHORT).show();

                }





            }

        });//








    }























}


