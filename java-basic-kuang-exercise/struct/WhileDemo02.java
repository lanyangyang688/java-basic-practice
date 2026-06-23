package kuang.struct;

public class WhileDemo02 {
    public static void main(String[] args) {
        //1+2+...+100
        int i=0;
        int sum=0;

        while (i<=100){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);

    }
}
