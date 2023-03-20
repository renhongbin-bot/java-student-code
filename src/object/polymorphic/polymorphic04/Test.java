package object.polymorphic.polymorphic04;

public class Test {
    public static void main(String[] args) {
//        Person p = new Person("老王", 90);
//        Dog d = new Dog(2, "白");
//        Cat c = new Cat(1, "黄");
//        p.keepPet(d, "骨头");
//        p.keepPet(c, "鱼");
//        Person p2 = new Person("老李", 80);
//        Cat c2 = new Cat(3, "金");
//        p2.keepPet(c2, "猫粮");
        Person p = new Person("老王", 90);
        Dog d = new Dog(2, "白");
        p.keepPet(d, "骨头");
        Cat c = new Cat(1, "黄");
        p.keepPet(c, "鱼");
    }
}
