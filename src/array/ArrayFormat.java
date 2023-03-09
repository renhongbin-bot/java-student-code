package array;

public class ArrayFormat {
    public static void main(String[] args) {
        int [] arr1 = {11, 12, 13, 14, 15};
        String [] arr2 = {"hangman", "lisi", "wang", "liking", "match"};
        double [] arr3 = {1.85, 1.93, 1.71, 1.88, 1.55};
//        System.out.println(arr1); //[I@1b6d3586地址值 [:表示是一个数组 I:表示是int类型 @:间隔符号(无实际意义) 1b6d3586:16进制地址值

//        1.数组的访问
        System.out.println(arr1[0]); //11
        System.out.println(arr2[0]); //hangman
        System.out.println(arr3[0]); //1.85
//        把数据存储到数据中,一旦覆盖后原来的数据就不存在了
        arr1[1] = 10;
        System.out.println(arr1[1]);
    }
}
