package hsq.basicExercise.contral;

public class Dowhile1 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        int n = 200;
        do {
            if (i % 5 ==0 && i % 3 != 0){
                System.out.println(i);
                count++;
            }
            i++;

        }while(i<=n);
        System.out.println("count=" + count);



    }

}
