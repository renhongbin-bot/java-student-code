package function;

public class MethodReload {
    public static void main(String[] args) {
        compare(10, 10);
    }
//    重载方法.
    public static void compare(int a, int b) {
        System.out.println(a == b);
    }
    public static void compare(byte a, byte b) {
        System.out.println(a == b);
    }
    public static void compare(short a, short b) {
        System.out.println(a == b);
    }
    public static void compare(long a, long b) {
        System.out.println(a == b);
    }
}
