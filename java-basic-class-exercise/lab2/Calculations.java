package lab2;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        double num1, num2;
        String input;

        System.out.println("Input first number?");
        input = keyboard.nextLine();
        num1 = Double.parseDouble(input);
        System.out.println("Input scanned number : ?");
        input = keyboard.nextLine();
        num2 = Double.parseDouble(input);

        System.out.println("Calculation : " + num1 + "*" + num2 + "=" + (num1+num2));
    }
}

