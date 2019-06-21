package com.example.franklinzquantum.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


import static android.view.KeyEvent.KEYCODE_BACK;


public class 俄语咨询 extends AppCompatActivity {


    private WebView webView;
    private FloatingActionButton AButton ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.russianinf);
        Toast.makeText(俄语咨询.this,"正在载入请稍候 ",Toast.LENGTH_SHORT).show();
        //webView.getSettings().setJavaScriptEnabled(true);
        AButton=(FloatingActionButton)findViewById(R.id.floatingActionButton);
        AButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent_back=new Intent(俄语咨询.this,MainActivity.class);
                startActivity(intent_back);




            }

        });//

        webView = findViewById(R.id.webView);
        webView.loadUrl("https://yandex.ru/");
        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url){
               view.loadUrl(url);
                return true;
            }
        });



    }
    public boolean onKeyDown(  int keyCode, KeyEvent event) {
        if ((keyCode == KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
