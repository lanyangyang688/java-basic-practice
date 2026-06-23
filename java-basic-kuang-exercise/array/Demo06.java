package kuang.array;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {

        int [] a = {1,333,444,515,5353,3,864};

        System.out.println(a);//[I@14ae5a5
        //打印数组元素
        System.out.println(Arrays.toString(a));
        printArray(a);

        Arrays.sort(a);//数组进行排序:升序

        System.out.println(Arrays.toString(a));

        Arrays.fill(a,1,6,0);//数组填充
        System.out.println(Arrays.toString(a));
    }


    public static void printArray(int [] a){
        for (int i = 0; i < a.length; i++) {
            if (i==0){
                System.out.print("{");
            }
            if (i==a.length-1){
                System.out.print("}");
            }else {
                System.out.print(a[i]+",");
            }
        }
    }
}
