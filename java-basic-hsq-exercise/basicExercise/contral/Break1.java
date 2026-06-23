package hsq.basicExercise.contral;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;//accumulate sum
        for (int i = 0; i <= 100; i++) {
            sum += i;
            if (sum >20){
                System.out.println(i);//output current i
                break;
            }
        }

    }
}
