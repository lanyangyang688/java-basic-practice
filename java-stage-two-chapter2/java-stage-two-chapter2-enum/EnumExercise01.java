package com.enum_;

/**
 * @author lanyangyang
 */
public class EnumExercise01 {
    static void main(String[] args) {

        Gender boy = Gender.Boy;
        Gender boy2 = Gender.Boy;

        System.out.println(boy);
        System.out.println(boy == boy2);

    }
}

enum Gender{
    Boy,Girl;
}