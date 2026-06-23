package kuang.oop.demo06;

public class Person {

    public void run(){
        System.out.println("run");
    }
}

/*
多态注意事项：
1.多态是方法的多态，属性没有多态
2.父类和子类， 有联系  类型转换异常！   ClassCastException
3.多态存在的必要条件：  继承关系，方法需要重写，父类的引用指向子类对象！   father  f1 = new son（）；

     1.static 方法，属于类，它不属于实例
     2.final  常量；
     3.private方法；
 */
/*
public class Application {
    public static void main(String[] args) {
        //类型之间的转换：父类  子类

        //高                  低
        Person s1 = new Student();

        ((Student) s1).go();

        //子类转化为父类，可能丢失一些自己本来的一些方法！
    }
}

/*
1.父类引用指向子类对象
2.把子类转换为父类，向上转型；
3.把父类转发为子类，向下转型；强制转换。
4.方便方法的调用，减少重复的代码！

抽象：封装  继承  多态!!!    抽象类，接口
 */



