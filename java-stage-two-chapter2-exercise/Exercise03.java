package exercise;

/**
 * @author lanyangyang
 */
public class Exercise03 {
    static void main(String[] args) {

        try {
            fun();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void fun() {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }
}
