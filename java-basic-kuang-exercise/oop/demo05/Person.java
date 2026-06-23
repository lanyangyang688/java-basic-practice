package kuang.oop.demo05;

//在java中，所有的类，都默认直接或者间接继承Object
//person人 ； 父亲
public class Person {

    public Person() {
        System.out.println("person无参执行了");
    }

    protected String name = "zzw";

    //私有的东西无法被继承
    public void print(){
        System.out.println("person");
    }

}
/*
public class Application {
    public static void main(String[] args) {

        Student student = new Student();

        //student.test("413顶帅");
        //student.test1();


    }

}

 */
