package hsq.basicExercise.method;

public class MethodExercise02 {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "milan";
        h.age = 100;

        MyTool tool = new MyTool();
        Human h2 = tool.copyHuman(h);//此时 h 和 h2 是两个独立的对象

        System.out.println(h.age + h.name);
        System.out.println(h2.age + h2.name);
        //可以通过输出hashcode来比较是否为同一个对象
    }
}

class Human{
    String name;
    int age;
}

class MyTool{
    public Human copyHuman(Human h) {
        Human h2 = new Human();
        h2.name = h.name;
        h2.age = h.age;

        return h2;
    }
}
