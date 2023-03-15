package object.advanced.advabced08;

public class Student extends Person{
    String ad;
    public Student() {
//        子类构造方法中隐藏的super()去访问父类的无参构造
        super();
        System.out.println("子类无参构造");
    }
    public Student (String name, int age, String ad) {
        super(name, age);
        this.ad = ad;
    }
}
