package com.innerclass_;

/**
 * @author lanyangyang
 */
public class LocalInnerClass {
    static void main(String[] args) {

        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02 {//外部类
    private int n1 = 100;//属性
    private void m2(){
        System.out.println("outer01 m2");
    }//私有方法

    public void m1() {//方法
        //1.局部内部类是定义在外部类的局部位置，通常在方法中
        //3.不能添加访问修饰符,但是可以使用 final 修饰
        //4.作用域 : 仅仅在定义它的方法或代码块中
        final class Inner02 {//局部内部类，本质还是个类
            private int n1 = 800;//属性
            //2.可以直接访问外部类的所有成员，包含私有的
            public void f1() {
                //5. 局部内部类可以直接访问外部类的成员，比如下面 外部类 n1 和 m2()
                //7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，
                //使用外部类名.this.成员）去访问
                //Outer02.this 本质就是外部类的对象, 即哪个对象调用了 m1, Outer02.this 就是哪个对象
                System.out.println("ni = " + n1);
                System.out.println(Outer02.this.n1);//外部类的n1
                m2();
            }
        }
        //6. 外部类在方法中，可以创建 Inner02 对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }

}
