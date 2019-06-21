package Algo;
import com.example.franklinzquantum.myapplication.背单词词库;

public  class getClass {

    public static int getclass(int times){

        String [][]data=背单词词库.load();
        int cls=1;//基数
        int base=data[1].length;//基标是第一的长度
        int mod=0;
        while(times>=base){
            cls++;
            base+=data[cls].length;



        }

        return cls;
    }
    public static int getmod(int times){

        String [][]data=背单词词库.load();
        int cls=1;//基数
        int base=data[1].length;//基标是第一的长度
        int  mod=times;
        while(times>=base){
            mod=times-base;
            cls++;
            base+=data[cls].length;

        }

            return mod;
    }


}

