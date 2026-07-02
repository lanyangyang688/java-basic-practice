package com.enum_;

/**
 * @author lanyangyang
 */
public class Enumeration03 {
    static void main(String[] args) {

        System.out.println(Season2.SUMMER);

    }
}
//演示使用enum关键字来实现枚举
enum Season2{


//    //定义了四个对象
//    public static final Season SPRING = new Season("春天", "温暖");
//    public static final Season WINTER = new Season("冬天", "寒冷");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");
    //如果使用enum
    //1.使用关键字enum替代class
    //2.public static final Season SPRING = new Season("春天", "温暖");直接换成
    //SPRING("春天", "温暖");常量名（实参列表）
    //3.如果有多个使用逗号间隔即可
    //4.如果使用enum来实现枚举，要求将常量对象写在前面
    //5.如果我们使用的是无參构造器，则可以省略()

    SPRING("春天", "温暖"),WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热"),AUTUMN("秋天", "凉爽");

    private String name;
    private String desc;

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

