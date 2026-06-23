package A_lecture;

import java.util.Scanner;

public class NegZeroPos {
    public static void main(String[] args) {
        //use the scanner input your num
        Scanner scanner = new Scanner(System.in);
        String input;
        int num;
        input = scanner.nextLine();
        num = Integer.parseInt(input);
        if (num<0){
            System.out.println("Negative");
        }
        else if (num==0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Positive");
        }
        scanner.close();
    }
}
