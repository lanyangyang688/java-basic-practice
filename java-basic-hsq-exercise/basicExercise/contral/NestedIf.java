package hsq.basicExercise.contral;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入成绩");

        double score = myscanner.nextDouble();
        if (score>8.0){
            System.out.println("请输入性别");
            char gender = myscanner.next().charAt(0);
            if (gender=='男'){
                System.out.println("进入男子组");
            }else if(gender=='女'){
                System.out.println("进入女子组");
            }else{
                System.out.println("输入有误");
            }

        }else {
            System.out.println("你被淘汰了");
        }




    }
}
