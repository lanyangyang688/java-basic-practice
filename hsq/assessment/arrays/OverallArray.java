package hsq.assessment.arrays;

public class OverallArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("array");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("inverted order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        double sum = arr[0];
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            sum += arr[i];
        }

        System.out.println("max is " + max + " max index is " + maxIndex);
        System.out.println("sum = " + sum);
        System.out.println("average is " + (sum/ arr.length));

        int findNumber = 8;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (findNumber == arr[i]){
                index = i;
                System.out.println("success find! find number is " + findNumber + " index " + index);
                break;
            }
        }
        if (index == -1){
            System.out.println("can not find the nyumber" + findNumber);
        }
    }
}
