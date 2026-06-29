package com.innerclass_;

/**
 * @author lanyangyang
 */
public class AnonymousInnerClassDetail {
    static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.fi();

    }
}

class Outer05 {
    private int n1 = 99;

    public void fi() {
        //创建一个基于类的匿名内部类
        //不能添加访问修饰符，它的地位就是一个局部变量
        //作用域：仅仅在定义它的方法或者代码块中
        Person p = new Person() {
            private int n1 = 88;

            @Override
            public void hi() {
                //可以访问外部类的所有成员包括私有的
                //可以直接访问外部类的所有成员，包含私有的
                //如果外部类和匿名内部类的成员重名时，匿名内部类访问的话，
                //默认遵循就近原则，如果想访问外部类的成员，则可以使用 （外部类名.this.成员）去访问
                System.out.println("匿名内部类重写了hi()方法" + n1);
                System.out.println("匿名内部类重写了hi()方法" + Outer05.this.n1);
            }
        };
        p.hi();//动态绑定，运行类型是 Outer05$1

        //也可以直接调用,匿名内部类本身也是返回对象
        new Person() {

            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi()方法，hhhh");
            }

            @Override
            public void ok(String string) {
                super.ok(string);
            }
        }.ok("jack");
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }

    public void ok(String string) {
        System.out.println("Person ok() " + string);
    }
}
