package com.interface_;

public interface AInterface {
    //写属性
    public int n1 = 10;
    //写方法
    //在接口中抽象方法可以省略abstract关键字
    public abstract void hi();
    //在jdk8及以后，可以有默认实现方法，需要使用default关键字修饰。
    default public void a(){
        System.out.println("a");
    }
    //可以实现静态方法
    public static void b(){
        System.out.println("b");
    }
}
