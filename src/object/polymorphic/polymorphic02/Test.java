package object.polymorphic.polymorphic02;

public class Test {
    public static void main(String[] args) {
//        调用成员变量:编译看左边,运行也看左边
//        编译看左边:javac编译代码时,会看左边父类中有没有这个变量,如果有编译成功,没有则编译失败
//        运行也看左边:java运行代码时,实际获取就是左边父类成员变量的值
        Animal a = new Dog();
        System.out.println(a.name);
//        调用成员方法:编译看左边,运行看右边
//        编译看左边:javac编译代码时,会看父类中有没有这个方法,如果有编译成功,否则编译失败
//        运行看右边:java运行代码时,实际上运行的是子类中的方法
        a.show();

//        理解:
//        Animal a = new Dog()
//        现在用a去调用变量和方法,而a是Animal类型,所以默认会从Animal这个类中找
//        成员变量:在子类的对象中,会把父类的成员变量也继承下来, 父:name  子:name
//        成员方法:如果子类对方法进行了重写,那么虚方法表中会把父类方法进行覆盖
    }
}
class Animal {
    String name = "动物";
    public void show() {
        System.out.println("Animal -- show");
    }
}
class Dog extends Animal {
    String name = "狗";
    @Override
    public void show() {
        System.out.println("Dog ----show");
    }
}
