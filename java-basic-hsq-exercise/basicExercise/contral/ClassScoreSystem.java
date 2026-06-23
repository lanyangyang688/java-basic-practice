package hsq.basicExercise.contral;

import java.util.Scanner;

public class ClassScoreSystem {
    public static void main(String[] args) {
        //create scanner object
        Scanner myscanner = new Scanner(System.in);
        double totalScoore = 0;//accumulate total score
        int classNum = 2;
        int studentNum = 5;
        int totalCorrectNum = 0;
        int totalPassNum = 0;
        int totalUnpassNum = 0;
        for (int i = 1; i <= classNum; i++) {
            int sum = 0;
            int passNum = 0;
            int unpassNum = 0;
            for (int j = 1; j <= studentNum; j++) {
                System.out.println("please input the score of the " + j + " student in " + i + " class");
                double score = myscanner.nextDouble();
                //if score >=600,accumulate the number of pass exam
                if (score >= 60 && score <= 100){
                    passNum++;
                    totalPassNum++;
                    sum += score;
                    totalCorrectNum++;
                    System.out.println("the score is " + score + "congratulation! pass the exam");
                }else if (score >= 0 && score < 60){
                    unpassNum++;
                    totalUnpassNum++;
                    sum += score;
                    totalCorrectNum++;
                    System.out.println("the score is " + score + "regrettable! please keep up the good workcon");
                }else {
                    System.out.println("error input");
                }
                int correctNum = passNum + unpassNum;
                System.out.println("the sum is " + sum + ";" + " the average is " + sum/correctNum);
            }
            System.out.println("the pass number is " + passNum);
            System.out.println("the unpass number is " + unpassNum);
            totalScoore += sum;//accumulate sum into totalScore
        }
        System.out.println("the total pass number is " + totalPassNum);
        System.out.println("the total unpass number is " + totalUnpassNum);
        System.out.println("the total score is " + totalScoore
                + "the average of total class is " + totalScoore/totalCorrectNum);
    }
}
