package function;

public class MethodParameter {
    public static void main(String[] args) {
        getSum(1, 3);
        getSum(1, 5);
        getLength(3.6, 7,2);
        getArea(3.5);
    }
    public static void getSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public static void getLength(double width, double height, int i) {
        double result = (width + height) * 2;
        System.out.println(result);
    }
    public static void getArea(double r) {
        double area = r * r * 3.14;
        System.out.println(area);
    }
}
