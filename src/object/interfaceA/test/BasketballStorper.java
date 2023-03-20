package object.interfaceA.test;

public class BasketballStorper extends Storter{
    public BasketballStorper() {
    }

    public BasketballStorper(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习如何打篮球");
    }
}
