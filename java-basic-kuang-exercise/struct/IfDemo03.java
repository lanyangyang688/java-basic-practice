package kuang.struct;

import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        //考试分数等于100为满分，大于60就为及格，小于60就不及格。

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩");
        int score = scanner.nextInt();

        if (score==100){
            System.out.println("满分");
        }
        else if (score>100){
            System.out.println("厉害啊比满分都高");
        }
        else if (score<100 && score>=80){
            System.out.println("A");
        }
        else if (score<80 && score>=60){
            System.out.println("B");
        }
        else if (score<60 && score>=0){
            System.out.println("60都考不到，跳了吧兄弟");
        }
        else {
            System.out.println("能考出负数你也是个人物");
        }
        scanner.close();
    }
}
