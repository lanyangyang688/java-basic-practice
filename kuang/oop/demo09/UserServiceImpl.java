package kuang.oop.demo09;

//抽象类：extends
//类  可以实现接口   implements   接口
//实现了接口的类，就需要重写接口中的方法

//利用接口来实现多继承
public class UserServiceImpl implements UserService,TimeService{
    @Override
    public void timer() {

    }

    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }
}
