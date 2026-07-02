package com.abstract_;

public class AbstractDetail02 {
    static void main(String[] args) {

    }
}
//抽象类的本质还是类，所以可以有类的各种成员
abstract class D{
    public int n1 = 10;
    public static String name = "lyy";
    public void hi(){
        System.out.println("hi");
    }
    public abstract void hello();

}
//如果一个类继承了抽象类，则它必须实现抽象类的所有方法，除非他自己也声明为抽象类
abstract class E{
    public abstract void hi();
}
abstract class F extends E{

}
abstract class G extends E{//这里相当于G子类实现了父类E的抽象方法，所有实现方法，就是有方法体
    @Override
    public void hi(){

    }
}
//抽象方法不能使用private final static来修饰，因为这些关键字是与重写相违背的
