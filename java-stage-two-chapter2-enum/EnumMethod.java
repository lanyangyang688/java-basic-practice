package com.enum_;

/**
 * @author lanyangyang
 * Enum类方法的使用
 */
public class EnumMethod {
    static void main(String[] args) {
        //使用season2枚举类，来掩饰各种方法
        Season2 autumn = Season2.AUTUMN;
        //输出枚举对象的名称
        System.out.println(autumn.name());
        //ordinal()输出为该枚举对象的编号，从0开始
        System.out.println(autumn.ordinal());
        //含定义的所有枚举对象
        Season2[] values = Season2.values();
        for (Season2 season : values) {
            System.out.println(season);
        }
        //valueOf：将字符串转换成枚举对象，要求字符串必须
        //为已有的常量名，否则报异常！

        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println(autumn1);
        //1. 根据你输入的"AUTUMN" 到 Season2 的枚举对象去查找
        //2. 如果找到了，就返回，如果没有找到，就报错
        System.out.println(autumn == autumn1);

        //compareTo：比较两个枚举常量，比较的就是编号
        //结果返回 。Season2.AUTUMN 的编号[3] - Season2.SPRING 的编号[0]
        System.out.println(Season2.AUTUMN.compareTo(Season2.SPRING));


    }
}
