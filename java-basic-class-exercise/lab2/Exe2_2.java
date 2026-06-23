package lab2;
import java.util.Scanner;
public class Exe2_2 {
        public static void main(String[] args){

            //read input radius from the user

            Scanner scanner = new Scanner(System.in);
            String input;

            double radius, a;
            int area;

            System.out.println("Input the circle radius : ");
            input = scanner.nextLine();
            radius = Double.parseDouble(input);

            //compute and round the area to the nearest int
            a = Math.PI * Math.pow(radius, 2);
            area = (int)Math.round(a);

            System.out.println(a);
            System.out.println(area);
    }
}
