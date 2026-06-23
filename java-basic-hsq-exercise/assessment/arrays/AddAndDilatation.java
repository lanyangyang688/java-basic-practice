package hsq.assessment.arrays;

import java.util.Scanner;

public class AddAndDilatation {
    public static void main(String[] args) {
        int[] arr = {10,12,45,90};
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your number");
        int insertNumber = sc.nextInt();
        int index = -1;//index !=0 because original array have index0

        for (int i = 0; i < arr.length; i++) {
            if (insertNumber < arr[i]){
                index = i;
                break;
            }
        }
        if (index == -1){
            index = arr.length;
        }
        System.out.println("index is " + index);

        int[] newArr = new int[arr.length + 1];
//        for (int i = 0; i < arr.length + 1; i++) {
//            if (i < index){
//                newArr[i] = arr[i];
//            } else if (i == index) {
//                newArr[index] = insertNumber;
//            }else {
//                newArr[i] = arr[i - 1];
//            }
//        }


        //more clearer !!!!!!!!!!!!!!
        for (int i = 0,j = 0; i < newArr.length; i++) {

            if (i != index){
                newArr[i] = arr[j];
                j++;
            }else {
                newArr[i] = insertNumber;
            }
        }

        arr = newArr;
        System.out.println("new arrays");
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
