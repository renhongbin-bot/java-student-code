package object.polymorphic.polymorphic01;

public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师信息为:" + getName() + ", " + getAge());
    }
}
