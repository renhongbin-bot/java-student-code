package stream;

import java.util.stream.Stream;

public class Demo5 {
    public static void main(String[] args) {
//        一堆零散数据
        Stream.of(1, 2, 3, 4).forEach(s -> System.out.println(s));
        int[] arr1 = {1, 2, 3, 4, 5};
        String[] arr2 = {"1", "2", "3", "4", "5"};
//        Stream.of遍历数组数据时,里面必须是对象类型,否则会变成地址
        Stream.of(arr1).forEach(s -> System.out.println(s));
        Stream.of(arr2).forEach(s -> System.out.println(s));
    }
}
