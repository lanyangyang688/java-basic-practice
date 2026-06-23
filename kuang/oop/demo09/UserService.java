package kuang.oop.demo09;

//interface 定义的关键字    接口都需要有实现类
public interface UserService {

    //常量  public static final
    public static final int AGE = 99;

      //接口中的所有定义的方法其是都是抽象的 public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
