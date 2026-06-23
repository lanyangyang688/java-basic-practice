package kuang.oop.demo06;

public class Student extends Person{
    public void go(){
        System.out.println("go");


    }

}
/*

public class Application {
    public static void main(String[] args) {

        //Object > Person > Student
        Object object = new Student();

        //System.out.println(X instanceof Y);能不能编译通过！

        System.out.println(object instanceof Student);//ture
        System.out.println(object instanceof Person);//ture
        System.out.println(object instanceof Object);//ture
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false
        System.out.println("=====================");

        Person person = new Student();
        System.out.println(person instanceof Student);//ture
        System.out.println(person instanceof Person);//ture
        System.out.println(person instanceof Object);//ture
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);//编译报错
        System.out.println("=====================");

        Student student = new Student();
        System.out.println(student instanceof Student);//ture
        System.out.println(student instanceof Person);//ture
        System.out.println(student instanceof Object);//ture
        //System.out.println(student instanceof Teacher);//编译报错
        //System.out.println(student instanceof String);//编译报错


    }

}
 */