package cpt105.R24_25;

public class ArmstrongNumbers {
    public static int countArmstrongNumbers(int n) {
        int count = 0;
        for (int i = 100; i < n; i++) {
            if (isArmstrongNumber(i)) { // BLOCK 1
                count++;
            }
        }
        return count; // BLOCK 2
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3); // BLOCK 3
            num /= 10; // BLOCK 4
        }
        return sum == originalNum; // BLOCK 5
    }

    public static void main(String[] args) {
        int n = 1000; // Example: Count Armstrong numbers up to 1000
        int count = countArmstrongNumbers(n);
        System.out.println("Number of Armstrong numbers up to " + n + ": " + count);
    }
}