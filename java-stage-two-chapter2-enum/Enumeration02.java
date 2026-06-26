package com.enum_;

public class Enumeration02 {
    static void main(String[] args) {
        System.out.println(Season1.SPRING);

    }
}

//自定义枚举实现
class Season1{
    private String name;
    private String desc;

    //定义了四个对象
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season WINTER = new Season("冬天", "寒冷");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("春天", "凉爽");

    //1.将构造器私有化，防止直接new
    //2.去掉setxxx方法，防止属性被修改。
    //3.在Season内部，直接创建固定的对象
    //4.优化可以再加入final
    private Season1(String name, String desc) {
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

