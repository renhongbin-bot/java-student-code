package array;

public class ArrayTraversal {
    public static void main(String[] args) {
//        定义数组
        int[] arr = {1, 2, 3, 4, 5};
        // 获取数组里面所有元素(for循环)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println("----统计1到10的数组有多少个数能被3整除");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = 0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 3 == 0) {
                result ++;
            }
        }
        System.out.println("能被3整除的数有" + result + "个");
        System.out.println("-----如果是奇数,就扩大两倍.偶数变成原来的1/2");
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 2 == 1) {
                arr2[i] *= 2;
            } else {
                arr2[i] /= 2;
            }
            System.out.println(arr2[i]);
        }
    }
}
