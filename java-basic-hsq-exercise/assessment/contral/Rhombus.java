package hsq.assessment.contral;

public class Rhombus {
    public static void main(String[] args) {

        // 上半部分（包括中间层）
        for (int i = 1; i <= 5; i++) {
            // 打印空格（控制左对齐，形成菱形上半部分）
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("#");
            }
            // 打印星号（仅首尾星号，中间空格，形成空心）
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            //same
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("#");
            }
            System.out.println(); // 换行
        }

        // 下半部分（不包括中间层）
        for (int i = 5 - 1; i >= 1; i--) {
            // 打印空格（控制左对齐，形成菱形下半部分）
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("#");
            }
            // 打印星号（仅首尾星号，中间空格，保持空心）
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            //same
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("#");
            }
            System.out.println(); // 换行
        }
    }
}