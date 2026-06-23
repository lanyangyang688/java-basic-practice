package kuang.array;

public class Demo01 {
    //变量的类型  变量的名字  =  变量的值
    //数组类型

    public static void main(String[] args) {
        int[] nums;//1.声明一个数组

        nums = new int[10];//创建一个数组    这里面可以存放10个int类型的数字

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;//若未赋值，则输出该类型的默认值

        //计算所有元素的和
        int sum = 0;
        //获取数组长度： arrays.length

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println("总和为"+sum);



    }



}
