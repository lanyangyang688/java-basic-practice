package lab12;

public class Test {
    public static void main(String[] args) {
        MountainBike mb=new MountainBike(3,100,25);
        System.out.println(mb.toString()); // TODO: create a MountainBike with gear=3, speed=18, startHeight=25
        //       and print it via toString().
    }
}

/* ---------- 1. Base class ---------- */
class Bicycle {
    public int gear;
    public int speed;/* TODO: add two public fields:
       int gear;
       int speed;
     */
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public String toString() {
        return "Bicycle [gear=" + gear + ",speed=" + speed + "]";
    }

    /* TODO: add constructor
       public Bicycle(int gear, int speed) { ... }
     */

    /* TODO: add methods
       public void applyBrake(int decrement) { ... }
       public void speedUp(int increment)   { ... }
     */
/* TODO: override toString()
       public String toString() { ... }
     */
}

/* ---------- 2. Subclass ---------- */
class MountainBike extends Bicycle {
    public int seatHeight;

    // 构造方法：初始化父类字段 + 子类字段
    public MountainBike(int gear, int speed, int startHeight) {
        // 调用父类构造方法
        super(gear, speed);
        this.seatHeight = startHeight;
    }

    // 设置座椅高度的方法
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // 重写 toString()，返回 MountainBike 的完整信息
    @Override
    public String toString() {
        return "No of gears are "+gear+"\n"+"speed of bicycle is "+speed+"\n"+"seat height is "+seatHeight;
    }/* TODO: add public field
       int seatHeight;
     */

    /* TODO: add constructor
       public MountainBike(int gear, int speed, int startHeight) { ... }
     */

    /* TODO: add method
       public void setHeight(int newValue) { ... }
     */

    /* TODO: override toString()
       public String toString() { ... }
     */
}