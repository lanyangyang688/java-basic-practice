package hsq.basicExercise.contral;

import java.util.Scanner;

public class Swich1 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        double score = myscanner.nextDouble();
        if (score >= 0 && score<=100){

        switch ((int)score / 60){
            case 0 :
                System.out.println("不及格");
                break;
            case 1 :
                System.out.println("及格");
                break;
//            default:
//                System.out.println("输入有误");
        }
    }else {
            System.out.println("输入需要为0-100的成绩");
        }
    }
}
