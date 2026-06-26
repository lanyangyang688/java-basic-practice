package com.interface_;

public class Interface01 {
    static void main(String[] args) {

        //创建手机相机对象
        Phone phone = new Phone();
        Camera camera = new Camera();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);//把手机接入计算机
        System.out.println("=========");
        computer.work(camera);
    }
}
