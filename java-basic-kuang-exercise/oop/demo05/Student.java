package kuang.oop.demo05;

//学生  人  子类 派生类
// 子类继承了父类，就会拥有父类的全部方法
public class Student extends Person{

    public Student() {
        //隐藏代码；默=调用了父类的无参构造
        super();//调用父类的构造器必须在子类构造器的第一行
        System.out.println("Student无参构造执行了");
    }

    private String name = "懒羊羊";

    public void print(){
        System.out.println("Student");
    }

    public void test1(){
        print();
        this.print();
        super.print();
    }



    public void test(String name){
        System.out.println(name);//413顶帅
        System.out.println(this.name);//懒羊羊
        System.out.println(super.name);//zzw
    }


}
/*

   //静态的方法和非静态的方法区别很大！
     //静态方法：方法的调用只和左边，定义的数据类型有关
//非静态：重写
public class Application {
    public static void main(String[] args) {

        A a = new A();
        a.test();//A

        //父类的引用指向了子类
        B b = new A();//子类重写了父类的方法
        b.test();//B



    }

}

 */







/*
//在java中，所有的类，都默认直接或者间接继承Object
//person人 ； 父亲
public class Person {

    //public
    //protected
    //default
    //private
    private int money = 10_0000_0000;

    public void say(){
        System.out.println("说了一句话");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

 */

/*
public class Application {
    public static void main(String[] args) {

        Student student = new Student();
        student.say();
        System.out.println(student.money);


    }

}

 */
