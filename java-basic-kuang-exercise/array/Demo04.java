package kuang.array;

public class Demo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
        //没有下标
        for (int array : arrays) {
            System.out.println(array);
        }
        printArray(arrays);

        int[] reverse = reverse(arrays);
        printArray(reverse);
    }

    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        //反转的操作
        int j = result.length-1;
        for (int i = 0; i < arrays.length; i++) {
            result[j] = arrays[i];
            j--;
        }
        return result;
    }
}
