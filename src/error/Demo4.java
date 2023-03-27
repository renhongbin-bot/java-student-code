package error;

public class Demo4 {
//    运行时异常可以不用throws
    public static void main(String[] args) /*throws NullPointerException, ArrayIndexOutOfBoundsException*/ {
        int[] arr = null;
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界异常");
        }
        System.out.println(max);
    }
    public static int getMax(int[] arr) {
        if(arr == null) {
//            手动抛出异常
            throw new NullPointerException();
        }
        if(arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }
        return  max;
    }
}
