package com.stringbuilder_;

/**
 * @author lanyangyang
 */
public class StringVsStringBufferVsStringBuilder {
    static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuffer 拼接 20000 次
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer 的执行时间： " + (endTime - startTime));
        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuilder 拼接 20000 次
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 的执行时间： " + (endTime - startTime));
        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//String 拼接 20000
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 的执行时间： " + (endTime - startTime));
    }
}
/*
使用原则：
如果字符串存在大量修改操作，一般使用stringBuffer和stringBuilder
如果字符串存在大量修改操作，并且在单线程的情况下 stringBuilder
如果字符串存在大量修改操作，并且在多线程的情况下 stringBuffer
如果字符串很少被修改，被多个对象引用，使用string，比如配置信息等
 */