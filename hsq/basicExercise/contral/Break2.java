package hsq.basicExercise.contral;

import java.util.Scanner;

public class Break2 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        String name = "";
        String password = "";
        int chance = 3;//when you log in,chance--
        for (int i = 1; i <= 3; i++) {
            System.out.println("hello please input your name");
            name = myscanner.next();
            System.out.println("hello" + name + "," + "please input your password");
            password = myscanner.next();
            if ("lanyangyang".equals(name) && "666".equals(password)){
                System.out.println("success log in");
                break;
            }
                chance--;
                System.out.println("residue chance is " + chance);
        }
    }
}
