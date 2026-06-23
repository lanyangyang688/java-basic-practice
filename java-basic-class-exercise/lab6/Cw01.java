package lab6;

class Dog {
    // 私有属性：姓名、年龄、品种
    private String name;
    private int age;
    private String breed;

    // 构造方法，用于初始化属性
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // bark 方法，输出指定格式的字符串
    public void bark() {
        System.out.println("Woof! My name is " + name + " and I am a " + breed + ".");
    }

    // 计算狗的年龄相当于人类的年龄（狗1岁相当于人类7岁）
    public int getDogAgeInHumanYears() {
        return age * 7;
    }

    // main 方法，程序入口
    public static void main(String[] args) {
        // 创建第一个 Dog 对象
        Dog dog1 = new Dog("Buddy", 5, "Chinese Pastoral Dog");
        // 调用 bark 方法
        dog1.bark();
        // 调用 getDogAgeInHumanYears 方法并输出结果
        System.out.println(dog1.getDogAgeInHumanYears());

        // 创建第二个 Dog 对象
        Dog dog2 = new Dog("Luna", 3, "Chinese Pastoral Dog");
        // 调用 bark 方法
        dog2.bark();
        // 调用 getDogAgeInHumanYears 方法并输出结果
        System.out.println(dog2.getDogAgeInHumanYears());
    }
}