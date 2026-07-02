package exercise;

/**
 * @author lanyangyang
 */
public class Exercise02 {
    static void main(String[] args) {
        //args.length = 0
        //发生ArrayIndexOutOfBoundsException
        if (args[4].equals("john")) {//可能发生NullPointerException
            System.out.println("AA");
        } else {
            System.out.println("BB");
        }
        Object o = args[2];//向上转型
        Integer i = (Integer) o;
    }
}
