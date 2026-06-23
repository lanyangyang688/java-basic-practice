package kuang.oop.demo01;

public class Demo02 {

    //静态方法 static  若有static则直接类名调用（student.say）

    //非静态方法
    public static void main(String[] args) {
        //实例化这个类 new
        //对象类型 对象名 = 对象值
        Student student = new Student();

        student.say();
    }

    //和类一起加载的
    public void a(){
        b();
    }

    //类实例化 之后才存在
    public void b(){

    }

}
