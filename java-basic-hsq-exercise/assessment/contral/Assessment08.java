package hsq.assessment.contral;

public class Assessment08 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0){
                sum += 1.0/i;
            }else{
                sum -= 1.0/i;
            }
        }
        System.out.println(sum);
//        for (double i = 1; i <= 100; i++) {
//            if (i % 2 != 0){
//                sum += 1/i;
//            }else{
//                sum -= 1/i;
//            }
//        }
    }
}
