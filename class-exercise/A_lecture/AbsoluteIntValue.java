package A_lecture;

import java.util.Scanner;

public class AbsoluteIntValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int num;
        input = scanner.nextLine();
        num = Integer.parseInt(input);

        if (num<0){
            num = -num;
        }
        System.out.println(num);
        scanner.close();
    }
}
