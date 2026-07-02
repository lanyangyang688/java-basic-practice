package com.annotation;

import java.util.ArrayList;
@SuppressWarnings("all")

/**
 * @author lanyangyang
 */
public class Test01 extends Object{
    //@Override 重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated //不推荐程序员使用，但是可以使用，或者存在更好的方式
    public static void test(){
        System.out.println("@Deprecated");
    }

    static void main(String[] args) {
        test();
    }

    public void test02(){
        ArrayList list = new ArrayList();
    }
}
