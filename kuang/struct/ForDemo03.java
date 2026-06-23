package kuang.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //用while或for循环输出1-1000之间可以被5整除的数，并且每行输出三个。

        for (int i = 0; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.println();
                //System.out.print("\n");

                //print 输出不会换行
                //println 输出会换行
            }
        }
    }
}
