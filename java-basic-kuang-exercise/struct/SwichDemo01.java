package kuang.struct;

public class SwichDemo01 {
    public static void main(String[] args) {
        //case穿透
        //swich  匹配一个具体的值
        char grade = 'C';

        switch (grade){
            case'A':
                System.out.println("优秀");
                break;//可选
            case'B':
                System.out.println("良好");
                break;//可选
            case'C':
                System.out.println("及格");
                break;//可选
            case'D':
                System.out.println("power");
                break;//可选
            case'E':
                System.out.println("诗人？");
                break;//可选
            default:
                System.out.println("未知等级");
        }
    }
}
