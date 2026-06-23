package hsq.basicExercise.method;

public class MethodParameter02 {
    public static void main(String[] args) {
        WW ww = new WW();
        int[] arr = {1,2,3};
        ww.test100(arr);
        System.out.println("this is main's arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();

        pp p = new pp();
        p.name = "jack";
        p.age = 10;
        ww.test200(p);
        System.out.println("main's p.age " + p.age);
    }
}

class pp {
    String name;
    int age;
}

class WW {
    public void test200(pp p){
        p.age = 10000;
    }

    public void test100(int[] arr){
        arr[0] = 200;
        System.out.println("this is tes100's arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();
    }
}
