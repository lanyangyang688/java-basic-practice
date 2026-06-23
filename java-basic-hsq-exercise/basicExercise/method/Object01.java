package hsq.basicExercise.method;

public class Object01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "kaso";
        cat1.age = 3;
        cat1.color = "balck";

        Cat cat2 = new Cat();
        cat2.name = "seven";
        cat2.age = 100;
        cat2.color = "red";

        System.out.println("the information of first cat " + cat1.name + " " + cat1.age + " " + cat1.color);
        System.out.println("the information of second cat " + cat2.name + " " + cat2.age + " " + cat2.color);
    }
}
class Cat{
    String name;
    int age;
    String color;

}
