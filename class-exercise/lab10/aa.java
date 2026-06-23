package lab10;
import java.util.Scanner;

// TODO 1: create the custom exception
// class DivisionByZeroException extends Exception { ... }
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
class Calculator {
    public static double divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}

public class aa {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {               // safe against EOF
            try {
                System.out.print("Enter numerator: ");
                if (!sc.hasNextInt()) {      // invalid token guard
                    System.out.println("Invalid input—numbers only.");
                    sc.next();               // discard
                    continue;
                }
                int a = sc.nextInt();

                System.out.print("Enter denominator: ");
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input—numbers only.");
                    sc.next();
                    continue;
                }
                int b = sc.nextInt();

                // TODO 3: call Calculator.divide
                // double res = Calculator.divide(a, b);
                double result = Calculator.divide(a, b);
                // System.out.printf("Result: %.2f%n", res);
                System.out.printf("Result：%d ÷ %d = %.2f%n", a , b, result);
                break;

            } catch (DivisionByZeroException e) {

                System.out.println("Error：" + e.getMessage());
            } catch (java.util.InputMismatchException e) {

                System.out.println("Error：Please enter a valid interger! ！");
            }
        }
        sc.close();
    }
}