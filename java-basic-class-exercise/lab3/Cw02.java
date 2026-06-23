package lab3;
import java.util.Scanner;
public class Cw02 {

        public static long fibonacci(int n) {
            // 函数用于计算第n个斐波那契数，采用迭代方法提高效率
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            long a = 0;
            long b = 1;
            for (int i = 2; i <= n; i++) {
                long c = a + b;
                a = b;
                b = c;
            }
            return b;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            // 我们需要找到p>2，使得fib(p-2)<=m且fib(p)>m
            int p = 3; // 从p=3开始，因为p>2
            while (true) {
                long fibPminus2 = fibonacci(p - 2);
                long fibP = fibonacci(p);
                if (fibPminus2 <= m && fibP > m) {
                    System.out.println(p);
                    break;
                }
                p++;
        }
    }
}
