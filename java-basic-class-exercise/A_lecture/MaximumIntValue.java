package A_lecture;

import java.util.Scanner;

public class MaximumIntValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int x,y;
        input = scanner.nextLine();
        x = Integer.parseInt(input);
        input = scanner.nextLine();
        y = Integer.parseInt(input);

        int max;
        if (x>y){
            max=x;
        }
        else  {
            max=y;
        }
        System.out.println(max);
        scanner.close();
    }
}
