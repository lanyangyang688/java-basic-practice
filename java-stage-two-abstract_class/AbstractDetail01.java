package com.abstract_;

public class AbstractDetail01 {
    static void main(String[] args) {

        //抽象类不能被实例化
        //new A();
    }
}
abstract class A{

    public void Hi(){
        System.out.println("hi");
    }
}
//抽象类不一定要包含抽象方法，而且还可以有实现的方法
//一个类一旦包含了抽象方法，则必须声明为抽象类
//抽象只能修饰类和方法，不能修饰属性和其他的
