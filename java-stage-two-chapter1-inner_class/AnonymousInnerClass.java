package com.innerclass_;

/**
 * @author lanyangyang
 */
public class AnonymousInnerClass {
    static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {
        //基于接口的匿名内部类
        //解读
        //1.需求：想使用接口IA，并创建对象
        //2.传统方式，写一个类，并实现接口。并创建对象
        //3.我们想Tiger类只是使用一次，后面再不使用
        //4.可以使用匿名内部类来简化开发
        //5.tiger的编译类型 IA
        //6.tiger的运行类型 就是匿名内部类 XXX$1
        /*
            我们看底层
            class XXX implements IA {
                @Override
                public void cry() {
                    System.out.println("tiger～～～");
                }
            }
         */
        //7.jdk底层，才创建匿名内部类Outer04$1，立马创建了Outer04$1实例，并且把地址
        //返回给 tiger
        //8.匿名内部类使用一次就不能再使用
        IA tiger = new IA(){

            @Override
            public void cry() {
                System.out.println("tiger～～～");
            }
        };
        System.out.println("tiger的运行类型是 " + tiger.getClass());
        tiger.cry();

        //演示基于类的匿名内部类
        //1.father的编译类型 Father
        //2.father的运行类型 Outer04$2
        //3.底层会创建匿名内部类
        /*
            class Outer04$2 extends Father{
            @Override
                public void test() {
                    super.test();
                    System.out.println("11");
                }
            }
         */
        //4.同时也直接返回了 匿名内部类 Outer04¥2 的对象
        //5.注意（”jack“）参数列表会传递给构造器
        Father father = new Father("jack"){

            @Override
            public void test() {
                super.test();
                System.out.println("11");
            }
        };
        System.out.println("father对象的运行类型 " + father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){

            @Override
            void est() {
                System.out.println("eat～～");
            }
        };
        animal.est();

    }
}

interface IA{
    public void cry();
}
//class Tiger implements IA{
//
//    @Override
//    public void cry() {
//
//        System.out.println("tiger～～～");
//    }
//}


class Father{
    public Father(String name){
        System.out.println("接收到name = " + name);

    }
    public void test(){

    }
}

abstract class Animal{//抽象类
    abstract void est();
}