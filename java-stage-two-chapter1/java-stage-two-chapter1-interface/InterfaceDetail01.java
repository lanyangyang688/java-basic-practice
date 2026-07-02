package com.interface_;

public class InterfaceDetail01 {
    static void main(String[] args) {

    }
}

//1.接口不能被实例化
//2.接口中的方法是public方法，接口中抽象方法可以不用abstract修饰
//3.一个普通类实现接口，就需要将接口的所有方法都实现。
//4抽象类实现接口，可以不用实现接口的方法
interface IA {

    void say();

    void hi();
}

class Cat implements IA {


    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
abstract class a implements IA{

}