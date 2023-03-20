package object.innerClass.demo2;

public class Outer {
    String name;
    private class Inner {
//        JDK16以上版本可以通过static修饰内部类的成员
//        static int a = 10;
    }
    public Inner getInstance() {
        return new Inner();
    }
}
