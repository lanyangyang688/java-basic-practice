package lab3;

import java.util.Scanner;

public class Cw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int k= scanner.nextInt();

        if (m+n>k&&n+k>m&&m+k>n){
            System.out.println("1");
        }
        else {
            System.out.println("-1");
        }
    }
}
