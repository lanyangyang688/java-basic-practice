package com.enum_;

/**
 * @author lanyangyang
 */
public class EnumDetail {
    static void main() {


    }
}

class A{

}
//enum实现的枚举类，仍然是个类，可以实现接口
interface Playing{
    public void playing();
}
enum Season3 implements Playing{
    ;

    @Override
    public void playing() {

    }
}