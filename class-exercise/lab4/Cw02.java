package lab4;

public class Cw02 {
    public static int sol(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i += 2) {
            sum += list[i] * list[i + 1];
        }
        return sum;
    }
}
