package com.example.franklinzquantum.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;


public class upload extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload);
        final Button forum_up=(Button)findViewById(R.id.button_upload);//论坛

        forum_up.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(upload.this,"发帖失败，请检查网络连接 ",Toast.LENGTH_SHORT).show();

            }
        });






    }
























}


