package com.interface_;

public class InterfaceDetail02 {
    static void main(String[] args) {

    }
}

interface IB {
    //接口中的属性，只能是final，而且是public static final 修饰符
    //接口中属性的访问方式，接口名.属性名
    int n1 = 10;//等价与public static final int n1 = 10
    void hi();
}

interface IC {
    void say();

}
//接口不能继承其他类，但是可以继承多个别的接口
interface ID extends IB,IC{

}

//一个类同时可以同时实现多个接口
class pig implements IB, IC {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}

