package com.interface_;

public class InterfaceExercise {
    static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(B.a);
        System.out.println(AA.a);
    }
}
interface AA{
    int a = 10;
}
class B implements AA{

}
