package function;

public class MethodTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        forArr(arr);

        int sum = getArrSum(arr);
        System.out.println(sum);
        boolean isArrExist = isArrExistNum(arr, 6);
        System.out.println(isArrExist);
    }
    public static void forArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            String str = i == arr.length - 1 ? "" : ",";
            System.out.print(arr[i] + str);
        }
        System.out.println("]   ");
    }
    public static int getArrSum(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum > arr[i] ? sum : arr[i];
        }
        return sum;
    }
    public static boolean isArrExistNum(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
//return 跟方法有关,退出整个方法
//break 结束循环或者switch