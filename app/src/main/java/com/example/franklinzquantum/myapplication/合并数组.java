package com.example.franklinzquantum.myapplication;

public class 合并数组 {
    public static String [] contact(String a[], String b[]){
        String[] f = new String[a.length+b.length];
        for(int i = 0 ; i < f.length; i++) {
            if (i < a.length)
                f[i] = a[i];
            else
                f[i] = b[i - a.length];
        }
        return f;
    }

}