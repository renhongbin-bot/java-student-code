package function;

public class MethodReturn {
    public static void main(String[] args) {
        int result1 = getSum(1000, 2000, 3000);
        int result2 = getSum(1000, 2000, 3000);
        int result3 = getSum(1000, 2000, 3000);
        int result4 = getSum(1000, 2000, 3000);
        int sum = result1 + result2 + result3 + result4;
        System.out.println(sum);
        int rectangle1 = getArea(10, 60);
        int rectangle2 = getArea(30, 40);
        int result = rectangle1 > rectangle2 ? rectangle1 : rectangle2;
        System.out.println(result);
    }
    public static int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static int getArea(int width, int height) {
        int area = width * height;
        return area;
    }
}
