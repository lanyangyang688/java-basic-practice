package kuang.oop.demo01;

//引用传递： 对象，本质还是值传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null

        Demo05.change(person);

        System.out.println(person.name);//lanyangyang
    }


    public static void change(Person person){
        //person是一个对象：指向的是--->Person person = new Person();这是一个具体的人，可以改变属性！
        person.name = "kuang";
    }
}



//定义一个person类，有一个属性：name
class Person{
    String name;//null
}