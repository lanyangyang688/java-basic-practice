package com.string_;

/**
 * @author lanyangyang
 */
public class StringExercise04 {
    static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "lyy";
        Person p2 = new Person();
        p2.name = "lyy";

        System.out.println(p1.name.equals(p2.name));//T
        System.out.println(p1.name == p2.name);//T
        System.out.println(p1.name == "lyy");//T

        String s1 = new String("a");
        String s2 = new String("a");
        System.out.println(s1 == s2);//F

    }
}

class Person {
    public String name;
}