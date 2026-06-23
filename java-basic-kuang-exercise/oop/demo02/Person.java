package kuang.oop.demo02;

//java--->class
public class Person {

    //一个类即使什么都不写，它也会存在一个方法
    //显示的定义构造器

    String name;

    //1.使用new关键字，本质是在调用构造器构造器
    //2.用来初始化值
    public Person(){

        this.name = "aaa";
    }

    //有参构造:一旦定义了有参构造，无参就必须显式定义
    public Person(String name){
        this.name = name;
    }

    //alt+insert：一键生成构造器



}

/*
public class Application {
    public static void main(String[] args) {

        //new 实例化了一个对象
        Person person = new Person("lanyangyang");

        System.out.println(person.name);

    }
}

构造器：
1.和类名相同
2.没有返回值

作用：
1.new 本质在电泳构造方法
2.初始化对象的值

注意点：
1.定义有参构造之后，如果想使用无参构造，需要显示的定义一个无参的构造
 */
