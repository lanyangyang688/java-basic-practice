package com.exception_;

/**
 * @author lanyangyang
 */
public class NumberFormatException {
    static void main(String[] args) {
        String name = "lyy";
        //将string转成int
        int num = Integer.parseInt(name);//抛出NumberFormatException
        System.out.println(num);
    }
}
