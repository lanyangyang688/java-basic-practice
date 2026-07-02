package com.innerclass_;

/**
 * @author lanyangyang
 */
public class InnerClassExercise01 {
    static void main(String[] args) {

        //匿名内部类可以当作实參直接传递，简介高效
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("show");
            }
        });
        //传统方法
        f1(new Picture());
    }

    //静态方法，形參是接口类型
    public static void f1(IL il) {
        il.show();
    }
}

//接口
interface IL {
    void show();
}

//传统方法
//类--实现IL
class Picture implements IL {


    @Override
    public void show() {
        System.out.println("show");
    }
}
