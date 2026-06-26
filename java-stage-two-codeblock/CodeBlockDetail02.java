package com.codeblock;

public class CodeBlockDetail02 {
    static void main(String[] args) {

        A a = new A();
    }
}

class A {
    //无參构造器
    public A(){
        System.out.println("A构造器被调用");
    }

    //普通属性初始化
    private int n2 = getN2();

    //普通代码块
    {
        System.out.println("A的普通代码块");
    }

    //静态属性的初始化
    private static int n1 = getN1();

    //静态代码块
    static {
        System.out.println("A静态代码块01");
    }

    //静态方法
    public static int getN1() {
        System.out.println("getN1被调用");
        return 100;
    }

    //普通方法
    public int getN2() {
        System.out.println("getN2被调用");
        return 200;
    }



}
