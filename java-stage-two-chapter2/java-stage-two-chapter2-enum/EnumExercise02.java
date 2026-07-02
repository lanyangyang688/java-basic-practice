package com.enum_;

/**
 * @author lanyangyang
 */
public class EnumExercise02 {
    static void main(String[] args) {
        //获取到所有的枚举对象，即数组
        Week[] weeks = Week.values();
        for (Week week : weeks) {
            System.out.println(week);
        }

    }
}

/*
声明 Week 枚举类，其中包含星期一至星期日的定义；
MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY , SUNDAY;
使用 values 返回所有的枚举数组, 并遍历 , 输出左图效果
*/

enum Week {
    MONDAY("星期一"), TUESDAY("星期二"),
    WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"),
    SUNDAY("星期天");
    //定义枚举对象
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}