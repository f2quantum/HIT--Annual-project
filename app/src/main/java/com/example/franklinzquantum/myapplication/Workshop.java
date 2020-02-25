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


public class Workshop extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workshop);

        final ImageButton game=(ImageButton)findViewById(R.id.imageButton6);//游戏
        final ImageButton forum=(ImageButton)findViewById(R.id.imageButton7);//论坛

        game.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(Workshop.this,gamelist.class);

                startActivity(intent);

            }
        });
        forum.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(Workshop.this,forum.class);

                startActivity(intent);

            }
        });






    }






















}


