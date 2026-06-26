package com.abstract_;

public class AA extends Template{
    //计算任务
    //1+....+ 800000
//    public void calculateTime(){
//        //得到开始的时间
//        long start = System.currentTimeMillis();
//        job();
//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("time is " + (end - start));
//    }
    @Override
    public void job() {
        long num = 0;
        for (long i = 1; i <= 80000000; i++) {
            num += i;
        }
    }
}
