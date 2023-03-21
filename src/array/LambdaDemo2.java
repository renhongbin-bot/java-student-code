package array;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //    利用匿名内部类的形式调用下面的方法
        method(() -> System.out.println("正在游泳~~~"));
    }
    public static void method(Swim s) {
        s.swimming();
    }
}
@FunctionalInterface
interface Swim {
    public abstract void swimming();
}

