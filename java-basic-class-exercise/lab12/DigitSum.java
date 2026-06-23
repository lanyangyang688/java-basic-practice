package lab12;

public class DigitSum {
    public static int sumDigits(int n){
        if (n==0){
            return 0;
        }
        return (n%10)+sumDigits(n/10);
    }/* TODO 1: implement the recursive method
       public static int sumDigits(int n)
       - base case: if n == 0 → return 0
       - recursive step: return (n % 10) + sumDigits(n / 10)
     */

    public static void main(String[] args) {
        System.out.println(sumDigits(4729));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(12345));
        /* TODO 2: print the results of:
           sumDigits(4729)  // expected 22
           sumDigits(0)     // expected 0
           sumDigits(12345) // expected 15
         */
    }
}