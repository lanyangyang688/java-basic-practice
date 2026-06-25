package com.abstract_;

public class Abstract01 {
    static void main(String[] args) {

    }

    abstract class Animal{

        private String name;

        public Animal(String name) {
            this.name = name;
        }

        //此时实现了eat，但其实没有什么意义
        //即：父类方法不确定性
        //考虑：将该方法设计为抽象方法，即没有实现，没有方法体的方法
        //当一个类中存在抽象方法则需要讲这个类声明为abstract类
        //一般来说这个抽象类会被继承，并由其子类来实现抽象方法
//        public void eat(){
//            System.out.println("这是一个动物但不知道吃什么");
//        }
        public abstract void eat();
    }
}
