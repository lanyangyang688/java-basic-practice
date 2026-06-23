package kuang.oop.demo04;

//类
public class Student {

    //封装重点对于属性，很少对应方法


    //属性私有
    private String name;//名字
    private int id;//学号
    private char sex;//性别
    private int age;


    //提供一些可以操作这个属性的方法！
    //提供一些public的get ，set方法

    //get 获得这个数据
    public String getName(){
        return this.name;
    }

    //set 给这个数据设置值
    public void setName(String name){
        this.name = name;
    }

    //alt + insert


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>120 || age<0){
            this.age = 3;
        }else {
            this.age = age;
        }
    }
}

/*
import lanyangyang.oop.demo03.Pet;
/*
1.提高程序的安全性，保护数据
2.隐藏代码的实现细节
3.统一接口
4系统可维护性增加了

public class Application {
    public static void main(String[] args) {
        Student s1 = new lanyangyang.oop.demo04.Student();

        s1.setName("zzw");

        System.out.println(s1.getName());

        s1.setAge(999);
        System.out.println(s1.getAge());


    }

}
 */
