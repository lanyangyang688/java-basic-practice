package com.interface_;

public class Computer {
    //编写一个方法,计算机工作
    public void work(UsbInterface useInterface){
        useInterface.start();
        useInterface.stop();
    }
}
