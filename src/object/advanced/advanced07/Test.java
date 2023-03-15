package object.advanced.advanced07;

public class Test {
    public static void main(String[] args) {
        Manager mg = new Manager("001", "张三", 15000, 8000);
        Cook cook = new Cook("010", "李四", 7000);
        System.out.println(mg.getId());
        System.out.println(cook.getId());
        mg.work();
        mg.eat();
        cook.work();
        cook.eat();
    }
}
