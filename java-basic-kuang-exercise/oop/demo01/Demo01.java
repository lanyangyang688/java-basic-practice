package kuang.oop.demo01;

import java.io.IOException;

//Demo01类
public class Demo01 {

    //main  方法
    public static void main(String[] args) {

    }
    /*
    修饰符  返回值类型   方法名（...）{
        //方法体
        return 返回值；
    }
     */
    //return 结束方法返回一个结果
    public String sayHello(){
        return "Hello,world";
    }

    public void hello(){
        return;
    }

    public int max(int a,int b){
        return a>b ? a : b;//三元运算符
    }

    //数组下标越界： Arraysindexoutofbounds
    public void readFile(String file) throws IOException {

    }


}
