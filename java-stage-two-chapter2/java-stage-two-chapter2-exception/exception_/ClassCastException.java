package com.exception_;

/**
 * @author lanyangyang
 */
public class ClassCastException {
    static void main(String[] args) {

        A b = new B();//向上转型
        B b2 = (B)b;//想下转型
        C c2 = (C)b;//这里抛出ClassCastException
    }
}

class A {
}

class B extends A {
}

class C extends A {
}
