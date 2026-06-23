package hsq.basicExercise.array;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int [] arr = {1,2,3};

        while (true) {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            System.out.println("please input your new number");
            int newNumber = myscanner.nextInt();
            newArr[newArr.length - 1] = newNumber;
            arr = newArr;
            System.out.println("======");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("Whether to continue adding or not yes/no");
            char key = myscanner.next().charAt(0);
            if (key == 'n'){
                break;
            }
        }
        System.out.println();
    }
}