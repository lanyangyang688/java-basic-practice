package hsq.basicExercise.method;

public class MethodExercise01 {
    public static void main(String[] args) {
        A a = new A();
        if (a.isOdd(3)){
            System.out.println("is odd");
        }else{
            System.out.println("is even");
        }

        a.pring(3,4,'*');

    }
}

class A{
    public boolean isOdd(int num){
//        if (num % 2 !=0){
//            return true;
//        }else {
//            return false;
//        }
        return num % 2 !=0;
    }

    public void pring(int row,int col,char c){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
