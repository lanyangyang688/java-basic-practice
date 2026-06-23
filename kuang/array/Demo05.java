package kuang.array;

public class Demo05 {
    public static void main(String[] args) {

        //[4] [2]
        /*
        1,2   array[0]
        3,4   array[1]
        5,6   array[2]
        7.8   array[3]
         */
        int[][] array = {{1,2},{3,4},{5,6},{7,8}};
        printArray(array[0]);
        System.out.println(array[0][0]);
        System.out.println("-------------");

        for (int[] ints : array) {
            for (int a : ints) {
                System.out.println(a);
            }
        }
    }
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
}
