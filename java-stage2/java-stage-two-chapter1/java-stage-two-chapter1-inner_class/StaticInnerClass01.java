package com.innerclass_;

/**
 * @author lanyangyang
 */
public class StaticInnerClass01 {
    static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.mq();

        //外部其他类访问静态内部类
        //方式1
        //因为静态内部类，是可以通过类名直接访问（前提是满足访问权限）
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //方式二
        //编写一个方法可以返回静态内部类实例
        Outer10.Inner10 inner11 = outer10.GetInner10();
        inner11.say();

        Outer10.Inner10 inner12 = Outer10.GetInner10_();
        inner12.say();

    }
}
class Outer10{
    private int n1 = 10;
    private static String name = "张三";
    private static void cry(){}
    //Inner10就是静态内部类
    //1.放在外部类的成员位置
    //2.使用static修饰
    //3. 可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
    //4. 可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员
    //5. 作用域 ：同其他的成员，为整个类体
    static class Inner10{
        public void say(){
            System.out.println(name);
            cry();
        }
    }
    public void mq(){
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 GetInner10(){
        return new Inner10();
    }
    public static Inner10 GetInner10_(){
        return new Inner10();
    }
}