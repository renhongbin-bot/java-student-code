package object.interfaceA;

public class Test {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("兔子", 2);
        Frog f = new Frog("青蛙", 1);
        Dog g = new Dog("修狗", 4);
        r.eat();
        f.eat();
        f.swim();
        g.eat();
        g.swim();
    }
}
