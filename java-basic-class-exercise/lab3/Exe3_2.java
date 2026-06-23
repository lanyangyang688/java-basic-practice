package lab3;

import java.util.Scanner;

public class Exe3_2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();

        int n = Integer.parseInt(input);

        int num1 = 0, num2 = 1;

        // since n is positive, 0 is always printed
        System.out.print(num1 + " ");

        while (num2 < n) {
            System.out.print(num2 + " ");
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        System.out.println();

    }
}

