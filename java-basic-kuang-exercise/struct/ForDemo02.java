package kuang.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //0-100之间奇数和偶数的和
        int oddsum=0;
        int evensum=0;

        for (int i = 0; i < 100; i++) {
            if (i%2!=0){//奇数
                oddsum+=i;//oddsum = oddsum + i;
            }
            else {
                evensum+=i;
            }

        }
        System.out.println("奇数的和"+oddsum);
        System.out.println("偶数的和"+evensum);
    }
}
