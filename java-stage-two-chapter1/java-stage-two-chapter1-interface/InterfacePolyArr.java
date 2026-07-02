package com.interface_;

public class InterfacePolyArr {
    static void main(String[] args) {

        //多态数组  接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new MyPhone();
        usbs[1] = new MyCamera();
        /*
        给 Usb 数组中，存放 Phone 和 相机对象，Phone 类还有一个特有的方法 call（），
        请遍历 Usb 数组，如果是 Phone 对象，除了调用 Usb 接口定义的方法外，
        还需要调用 Phone 特有方法 call
        */
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();//动态绑定
            //和前面一样，我们仍然需要进行了类型转型
            if (usbs[i] instanceof MyPhone){
                ((MyPhone) usbs[i]).call();
            }

        }

    }
}

interface Usb {
    void work();
}

class MyPhone implements Usb {
    public void call() {
        System.out.println("can call");
    }

    @Override
    public void work() {

        System.out.println("Phone is working");
    }
}

class MyCamera implements Usb {
    @Override
    public void work() {
        System.out.println("Camera is working");

    }
}


