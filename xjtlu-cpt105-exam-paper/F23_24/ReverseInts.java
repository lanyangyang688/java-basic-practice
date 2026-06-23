package cpt105.F23_24;

public class ReverseInts {
    public static void main(String[] args) {
     reverseInts(new int[]{1,2,3,4,5});
    }

    public static void reverseInts(int[] nums){

        for (int n = 0;2 * n <nums.length - 1 ; n++) {
            int a = nums[n];
            nums[n] = nums[nums.length - n - 1];
            nums[nums.length - n - 1] = a;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
