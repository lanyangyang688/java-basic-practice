package hsq.basicExercise.contral;

public class Continue2 {
    public static void main(String[] args) {

        label1:
        for (int i = 0; i < 4; i++) {
            label2:
            for (int j = 0; j < 5; j++) {
                if (j == 2){
                    continue label1;
                }
                System.out.println("j = " + j);
            }
        }
    }
}
