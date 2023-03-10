package function;

import java.lang.reflect.Array;

public class CloneArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 5, 7, 9, 8};
        int[] copyArr = cloneArray(arr, 2, 4);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
    }
//    拷贝区间数组
    public static int[] cloneArray(int[] arr, int form, int to) {
        int[] copyArr = new int[to - form];
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = arr[form];
            form++;
        }
        return copyArr;
    }
}
