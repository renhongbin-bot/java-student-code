package object.absttact;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小绿", 1);
        Dog g = new Dog("大黄", 3);
        Shepp s = new Shepp("小羊", 2);
        System.out.println(f.getAge() + ", " + f.getName());
        f.drink();
        f.eat();
        g.eat();
        s.eat();
    }
}
