package exercise;

/**
 * @author lanyangyang
 */
public class Exercise04 {
    static void main(String[] args) {

        try {
            showExce();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");

    }

    public static void showExce()throws Exception{
        throw new Exception();
    }
}
