package com.codeblock;

public class CodeBlock01 {
    static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
        Movie movie1 = new Movie("啊",22,"as");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //构造器，三个（重载）
    //下面的三个构造器都有相同的语句
    //这时我们可以把相同的语句放入到一段代码块中，即可
    //这样当我们不管调用哪个构造器，我们都会先调用代码块的内容
    //代码块调用的顺序优先于构造器
    {
        System.out.println("开屏幕");
        System.out.println("看广告");
        System.out.println("正式开始");
    }

    public Movie(String name) {
        System.out.println("Movie(String name)被调用");
        this.name = name;
    }


    public Movie(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director)被调用");

        this.name = name;
        this.price = price;
        this.director = director;
    }


}
