package lab3;
import java.util.Scanner;

public class Exe3_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();

        int windSpeed = Integer.parseInt(input);

        if (windSpeed < 74)
            System.out.println("Not a hurricane");
        else if (windSpeed < 96)
            System.out.println("Category 1 hurricane");
        else if (windSpeed < 111)
            System.out.println("Category 2 hurricane");
        else if (windSpeed < 131)
            System.out.println("Category 3 hurricane");
        else if (windSpeed < 156)
            System.out.println("Category 4 hurricane");
        else
            System.out.println("Category 5 hurricane");

    }
}
