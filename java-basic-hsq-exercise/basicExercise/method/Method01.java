package hsq.basicExercise.method;

public class Method01 {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.speak();//calling method
        P1.cal01();
        P1.cal02(1000);
        int returnRes = P1.cal03(2,3);//若使用return则需要接收
        System.out.println("cal03 return " + returnRes);
    }
}
class Person{
    String name;
    int age;

    public void speak(){
        System.out.println("I am a good man");
    }

    public void cal01(){
        int res = 0;
        for (int i = 1; i < 1000; i++) {
            res += i;
        }
        System.out.println("result is " +res);
    }

    public void cal02(int n){
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += i;
        }
        System.out.println("result is " +res);
    }
    public int cal03(int a ,int b){
        return a + b;
    }
}