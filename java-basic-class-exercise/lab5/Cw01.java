package lab5;

import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class Cw01 {
    public static void main(String[] args) {
        String test1 ="Hello123!";
        System.out.println(Cw01.sol(test1,'D'));
    }
    public static int sol(String input, char type) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (type) {
                case 'L':
                    if (Character.isLetter(ch)) {
                        count++;
                    }
                    break;
                case 'D':
                    if (Character.isDigit(ch)) {
                        count++;
                    }
                    break;
                case 'S':
                    if (!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)) {
                        count++;
                    }
                    break;
                case 'W':
                    if (Character.isWhitespace(ch)) {
                        count++;
                    }
                    break;
                default:
                    break;
            }
        }
        return count;
    }
}
