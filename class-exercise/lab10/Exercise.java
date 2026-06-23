package lab10;
// 父类 Animal
class Animal {
    // 成员变量（题目隐含访问权限为 protected，子类可直接访问）
    protected String name;
    protected boolean canFly;

    // 1. 单参构造方法：仅接收 name，canFly 默认 false
    public Animal(String name) {
        this.name = name;
        this.canFly = false;
    }

    // 2. 双参构造方法：接收 name 和 canFly
    public Animal(String name, boolean canFly) {
        this.name = name;
        this.canFly = canFly;
    }

    // 父类的 active() 方法（子类将重写）
    public void active() {
        if (canFly) {
            System.out.println(name + " can fly");
        } else {
            System.out.println(name + " cannot fly");
        }
    }
}

// 子类 AnimalPlus，继承自 Animal
class AnimalPlus extends Animal {
    // 新增成员变量：速度（double 类型）
    private double speed;

    // 子类构造方法：接收 name、canFly、speed 三个参数
    public AnimalPlus(String name, boolean canFly, double speed) {
        // 调用父类的双参构造方法初始化 name 和 canFly
        super(name, canFly);
        // 初始化子类新增的 speed 变量
        this.speed = speed;
    }

    // 重写父类的 active() 方法
    @Override
    public void active() {
        if (canFly) {
            // canFly 为 true 时，输出“[name] runs with speed [speed]”
            System.out.println(name + " runs with speed " + speed);
        } else {
            // canFly 为 false 时，输出“[name] flies with speed [speed]”（题目示例规则）
            System.out.println(name + " flies with speed " + speed);
        }
    }
}

// 测试类（验证功能）
public class Exercise {
    public static void main(String[] args) {
        // 示例 1：创建会飞的鹰（canFly=true，speed=25.5）
        AnimalPlus eagle = new AnimalPlus("Eagle", true, 25.5);
        eagle.active(); // 输出：Eagle runs with speed 25.5

        // 示例 2：创建不会飞的猎豹（canFly=false，speed=100）
        AnimalPlus cheetah = new AnimalPlus("Cheetah", false, 100);
        cheetah.active(); // 输出：Cheetah flies with speed 100.0

        // 额外验证：测试父类方法（可选）
        Animal cat = new Animal("Cat");
        cat.active(); // 输出：Cat cannot fly（父类默认逻辑）
    }
}