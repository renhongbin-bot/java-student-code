package object.interfaceA.test;

public abstract class Storter extends Person{
    public Storter() {
    }

    public Storter(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
