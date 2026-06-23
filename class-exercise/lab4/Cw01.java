package lab4;

public class Cw01 {
    public static void main(String[] args) {

    }
    public static int sol(int[] list) {
        int count = 0;
        for (int num : list) {
            if (num % 3 == 0) {
                count++;
            }
        }
        return count;
    }
}
