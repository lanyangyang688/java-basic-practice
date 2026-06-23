package hsq.basicExercise.contral;

import java.util.Scanner;

public class Dowhile2 {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        char answer ;
        do {
            System.out.println("Do i look handsome? y/n");
            answer = myscanner.next().charAt(0);
            if (answer =='y'){
                System.out.println("l do think son");
            }else if (answer == 'n'){
            }else {
                System.out.println("error enter, please input y/n");
            }
        }while(answer !='y');
        System.out.println("ending");

    }
}
