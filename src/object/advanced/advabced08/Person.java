package object.advanced.advabced08;

public class Person {
    String name;
    int age;
    public Person() {
        System.out.println("父类无参构造");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
