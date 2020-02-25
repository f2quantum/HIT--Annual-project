package com.example.franklinzquantum.myapplication;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

//spilt实现切割
//注意同时添加save和read
public class 通用读取 {
    public  static boolean save (int word,String name){

        try {

            String  writein= ""+word;//直接通过空字符串+数字的形式转换为字符串

            File file=null;

        switch (name){

            case "login": file = new File("/data/data/com.example.franklinzquantum.myapplication/login.txt");
                break;
            case "textSize": file = new File("/data/data/com.example.franklinzquantum.myapplication/textSize.txt");
                break;
            case "theme": file = new File("/data/data/com.example.franklinzquantum.myapplication/theme.txt");
                break;
        }



            FileOutputStream fos = new FileOutputStream(file);

            fos.write(writein.getBytes());
            fos.close();
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }





    }
    public static int read(String name){

        try{
            int x;
            File file=null;

            switch (name){

                case "login": file = new File("/data/data/com.example.franklinzquantum.myapplication/login.txt");
                    break;
                case "textSize": file = new File("/data/data/com.example.franklinzquantum.myapplication/textSize.txt");
                    break;
                case "theme": file = new File("/data/data/com.example.franklinzquantum.myapplication/theme.txt");
                    break;
            }
           // file = new File("/data/data/com.example.franklinzquantum.myapplication/save.txt");

            FileInputStream fis=new FileInputStream(file);
            BufferedReader bufr=new BufferedReader(new InputStreamReader(fis));
            String content =bufr.readLine();


            x=Integer.valueOf(content);//测试x

            fis.close();

            return x;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }




    }



}
