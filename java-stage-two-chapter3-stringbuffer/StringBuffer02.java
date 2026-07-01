package com.stringbuffer_;

/**
 * @author lanyangyang
 */
public class StringBuffer02 {
    static void main(String[] args) {

        //构造器的使用
        //创建一个大小为 16 的 char[],用于存放字符内容。
        StringBuffer stringBuffer = new StringBuffer();

        //通过构造器指定 char[] 大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //通过给一个String 创建 StringBuffer，char[]大小就是string.length + 16
        StringBuffer stringBuffer2 = new StringBuffer("hello");
    }
}
