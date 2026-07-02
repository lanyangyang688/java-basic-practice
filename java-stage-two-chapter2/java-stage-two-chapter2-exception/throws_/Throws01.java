package com.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author lanyangyang
 */
public class Throws01 {
    static void main(String[] args) {

    }

    public void f2() throws FileNotFoundException {
        //创建了一个文件流对象
        //1.这里的异常是FileNotFoundException 编译异常处理
        //2.可以使用try-catch-finally
        //3.使用throws，抛出异常让调用f2方法的调用者处理
        //4.throws后面的异常类型可以是方法中产生的异常，也可以是它的父类
        //5.throws 关键字后也可以是异常列表，即可以抛出多个异常
        FileInputStream fis = new FileInputStream("d://aa.txt");

    }

}


