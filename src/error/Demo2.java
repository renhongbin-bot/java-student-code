package error;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            如果出现ArrayIndexOutOfBoundsException异常,处理代码
            System.out.println("索引越界了");
        }
        System.out.println("看看我执行了吗?");
    }
}
