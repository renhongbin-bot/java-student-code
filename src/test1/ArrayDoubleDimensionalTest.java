package test1;

public class ArrayDoubleDimensionalTest {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            for (int j = 0; j < arr[i].length; j++) {
                a += arr[i][j];
            }
            num += a;
            System.out.println("第" + (i + 1) + "个季度的营业额为:" + a);
        }
        System.out.println("全年营业额为:" + num);
    }
}
