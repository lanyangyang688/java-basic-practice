package com.interface_;

public class ExtendsVsInterface {
    static void main(String[] args) {

        LittleMonkey houge = new LittleMonkey("猴哥");
        houge.climbing();
        houge.swimming();
        houge.flying();
    }
}

//猴子
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + "会爬树");
    }

    public String getName() {
        return name;
    }
}

//接口
interface Fishable{
    void swimming();
}
interface Birdable{
    void flying();
}


//继承
//小结：当子类继承了父类，就自动拥有了父类的功能。
//如果子类需要扩展功能，可以通过接口的方式来扩展。
//实现接口是java对于单继承机制的补充
class LittleMonkey extends Monkey implements Fishable,Birdable {

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习可以游泳了");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习可以飞翔了");
    }
}