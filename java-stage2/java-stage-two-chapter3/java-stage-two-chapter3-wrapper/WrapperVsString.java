package com.wrapper;

/**
 * @author lanyangyang
 */
public class WrapperVsString {
    static void main(String[] args) {
        //包装类(Integer)->String
        Integer i = 100;//自动装箱
        //方式一
        String str1 = i + "";
        //方式二
        String str2 = i.toString();
        //方式三
        String str3 = String.valueOf(i);

        //String -> 包装类(Integer)
        String str4 = "1234";
        Integer i2 = Integer.parseInt(str4);//使用到自动装箱
        Integer i3 = Integer.valueOf(str4);

    }
}
