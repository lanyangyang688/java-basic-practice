package com.try_;

/**
 * @author lanyangyang
 */
public class TryCatchDetail01 {
    static void main(String[] args) {

        //command + option + t
        //1.如果异常发生了，则异常发生后面的代码不会执行，直接进入catch块
        //2.如果异常没有发生，则顺序执行try代码块，不会进入catch
        //3. 如果希望不管是否发生异常，都执行某段代码(比如关闭连接，释放资源等)则使用如下代码- finally
        try {
            String str = "13";
            int a = Integer.parseInt(str);
            System.out.println("数字： " + a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally 代码块被执行");
        }

        System.out.println("程序继续");
    }
}

