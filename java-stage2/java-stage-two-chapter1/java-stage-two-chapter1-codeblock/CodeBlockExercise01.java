package com.codeblock;

public class CodeBlockExercise01 {
    static void main(String[] args) {
        System.out.println(Person.total);
        System.out.println(Person.total);
    }
}
class Person{
    public static int total;
    static {
        total = 100;
        System.out.println("STATIC CODE BLOCK");
    }
}
