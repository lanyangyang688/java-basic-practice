package lab2;
import java.util.Scanner;
public class Exe2_1 {
        public static void main(String[] args) {
            //take input min and max from users
            Scanner scanner = new Scanner(System.in);
            String input;

            int min, max, rand1, rand2;

            System.out.println("Input the main value: ");
            input = scanner.nextLine();
            min = Integer.parseInt(input);
            System.out.println("Input the max value: ");
            input = scanner.nextLine();
            max = Integer.parseInt(input);

            //generate two random integers
            rand1 = min + (int) (Math.random() * (max - min + 1));
            rand2 = min + (int) (Math.random() * (max - min + 1));

            //printing the random integers and their compararions
            System.out.println(rand1);
            System.out.println(rand2);
            System.out.println((rand1 < rand2));
            System.out.println((rand1 == rand2));
            System.out.println((rand1 > rand2));
        }
    }
