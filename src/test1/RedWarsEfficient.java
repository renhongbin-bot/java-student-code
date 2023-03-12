package test1;

import java.util.Random;

public class RedWarsEfficient {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888,1000, 10000};
        Random r = new Random();
//        两两交换五次
        for (int i = 0; i < arr.length; i++) {
//            获取随机索引
            int num = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
