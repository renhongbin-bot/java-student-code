package stream;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
//        数组使用stream
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arr2 = {"a", "b", "c", "d", "f", "g"};
        Arrays.stream(arr).forEach(s -> System.out.println(s));
        Arrays.stream(arr2).forEach(s -> System.out.println(s));
    }
}
