package kuang.struct;

public class SwichDemo02 {
    public static void main(String[] args) {
        String name = "kuang";

        //反编译  java---class（字节码文件）----反编译（IDEA)



        switch (name){
            case "kuang":
                System.out.println("shuai");
                break;
            case"666":
                System.out.println("0");
                break;
            default:
                System.out.println("zhaobudao");
        }
    }
}
