package array;

public class ArrayDoubleDimensional {
    public static void main(String[] args) {
//        定义二维数组
        int[][] arr = {{1,2, 3}, {3, 2, 1}};
//        动态初始化定义二维数组
        int[][] arr1 = new int[3][5];
        arr1[0][3] = 10;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
