package com.string_;

/**
 * @author lanyangyang
 */
public class StringExercise02 {
    static void main(String[] args) {
        String a = "lyy";//a指向常量池中的lyy
        String b = new String("lyy");//b指向堆中的对象
        System.out.println(a.equals(b));//T
        System.out.println(a==b);//F
        //b.intern()方法最终返回的是常量池的地址
        System.out.println(a==b.intern());//T
        System.out.println(b==b.intern());//F

    }
}
