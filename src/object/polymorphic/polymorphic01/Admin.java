package object.polymorphic.polymorphic01;

public class Admin extends Person{
    @Override
    public void show() {
        System.out.println("管理员信息为:" + getName() + ", " + getAge());
    }
}
