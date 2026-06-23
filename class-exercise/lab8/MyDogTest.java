package lab8;

public class MyDogTest {
    public static void main(String[] args) {
        // Test Case 1
        MyDog dog1 = new MyDog("Buddy", 5, "Golden Retriever");
        System.out.println(dog1);

        // Test Case 2
        MyDog dog2 = new MyDog("Luna", 3, "Husky");
        System.out.println(dog2);

        // Test Case 3
        MyDog puppy = new MyDog("Coco", 1, "Poodle");
        System.out.println(puppy);

        // Test Case 4
        MyDog senior = new MyDog("Max", 10, "Beagle");
        System.out.println(senior);

        // Test Case 5
        MyDog stray = new MyDog("", 4, "Unknown");
        System.out.println(stray);
    }
}

class MyDog {
    private String name;
    private int age;
    private String breed;

    public MyDog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof! My name is " + name + " and I am a " + breed + ".");
    }

    public int getDogAgeInHumanYears() {
        return age * 7;
    }
    @Override
    public String toString() {
        int humanAge = getDogAgeInHumanYears();
        return "Dog[name=" + name + ", age=" + age + ", breed=" + breed + ", humanAge=" + humanAge + "]";
    }


    /* TODO: Override the toString() method here so that
       printing a MyDog instance produces exactly this format:
       Dog[name=<name>, age=<age>, breed=<breed>, humanAge=<humanAge>]
     */
}