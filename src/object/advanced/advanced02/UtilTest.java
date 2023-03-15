package object.advanced.advanced02;

public class UtilTest {
    public static void main(String[] args) {
//        测试工具类中的两个方法是否正确
        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        double[] arr2 = {1.5, 2.6, 3.5, 2.8};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(str);
        System.out.println(avg);
    }
}
