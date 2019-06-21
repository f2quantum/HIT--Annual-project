package Algo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//去中文正则
public class regex {
    public static String regex(String str){

        String reg = "[\u2E80-\u9FFF]";//中文正则
        Pattern pat = Pattern.compile(reg);
        Matcher mat = pat.matcher(str);
        String repickStr = mat.replaceAll("");

        String reg2 ="‘’“”,，。.";
        Pattern pat2 = Pattern.compile(reg2);
        Matcher mat2 = pat2.matcher(repickStr);
        String repickStr2 = mat2.replaceAll("");
        return repickStr2;
    }

}
