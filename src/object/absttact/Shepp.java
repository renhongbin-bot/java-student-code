package object.absttact;

public class Shepp extends Animal{
    @Override
    public void eat() {
        System.out.println("山羊在吃草 ");
    }

    public Shepp() {
    }

    public Shepp(String name, int age) {
        super(name, age);
    }
}
