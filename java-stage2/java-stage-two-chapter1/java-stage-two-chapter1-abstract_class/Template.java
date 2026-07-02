package com.abstract_;

abstract public class Template {//抽象类模版设计模式

    public abstract void job();
    public void calculateTime(){
        //得到开始的时间
        long start = System.currentTimeMillis();
        job();
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("time is " + (end - start));
    }
}
