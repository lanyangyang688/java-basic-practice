package lab2;
import java.util.Scanner;
public class Cw02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //输出读取
            double l = scanner.nextDouble();
            double n = scanner.nextDouble();
            double m = scanner.nextDouble();
            //计算长度
            double length = (l/2) * (n/(n+m));
            //计算宽度
            double width = (l/2) * (m/(n+m));
            //输出长度和宽度
            System.out.println(length);
            System.out.println(width);

        }
    }

