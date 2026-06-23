package lab2;
import java.util.Scanner;

public class Cw01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //System.out.printf("please input your s");
            //System.out.println("please input your s");
            double s = scanner.nextDouble();

            double r = s / 2;
            double volume = (4.0/3.0)*3.14*Math.pow(r,3);
            System.out.printf("%.2f", volume);
            scanner.close();
        }
}