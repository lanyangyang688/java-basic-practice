package com.innerclass_;

/**
 * @author lanyangyang
 */
public class MemberInnerClass {
    static void main(String[] args) {

        Outer08 outer08 = new Outer08();
        outer08.t1();

        //外部其他类，使用成员内部类
        //第一种
        //outer08.new Inner08();相当于把new Inner08()当作Outer08的成员
        Outer08.Inner08 inner08 = outer08.new Inner08();

        //第二种 在外部类中编写方法可以返回inner08对象
        Outer08.Inner08 inner9 = outer08.getInner08();
    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "张三";

    public void hi() {
        System.out.println("hi method");
    }

    //1.注意: 成员内部类，是定义在外部内的成员位置上
    //2.可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员
    class Inner08 {
        private int sal = 99;

        private void say() {
            //可以访问外部类的所有成员，包括私有的
            System.out.println(n1 + name);
            hi();
        }
    }

    public Inner08 getInner08() {
        return new Inner08();
    }

    //写方法
    public void t1() {
        //使用成员内部类
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}