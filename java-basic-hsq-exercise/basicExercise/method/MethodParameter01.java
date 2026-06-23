package hsq.basicExercise.method;

public class MethodParameter01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        W w = new W();
        w.swap(a,b);

        System.out.println("a=" + a +" b=" + b);
    }
}

class W{

    public void swap(int a,int b){
        System.out.println("a=" + a + "\tb=" + b);
        //exchange the value of a and b
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a=" + a + "\tb=" + b);
    }
}