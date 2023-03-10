package array;

import java.sql.Array;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
//        求最值
        System.out.println("----求数组中的最大值----");
        int[] arr = {1, 33, 45, 22, 42};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        System.out.println(max);
//求数组中的最大值
        System.out.println("----求数组中的最大值----");
        int[] randomArr = new int[10];
        int randomSum = 0; //和
        int randomMeanValue = 0; //平均数
        int randomNumber = 0; //比平均数小的个数
        Random r = new Random();
        for (int i = 0; i < randomArr.length; i++) {
            int number = r.nextInt(100) + 1;
            randomArr[i] = number;
            randomSum += randomArr[i];
            System.out.println(number);
        }
        randomMeanValue = randomSum / randomArr.length;
        for (int i = 0; i < randomArr.length; i++) {
            if(randomArr[i] < randomMeanValue) {
                randomNumber ++;
            }
        }
        System.out.println(randomSum);
        System.out.println(randomMeanValue);
        System.out.println(randomNumber);

//        翻转数组
        System.out.println("----交换数组中的数据----");
        int[] reverseArr = {1, 3, 2, 0, 5};
        for (int i = 0, j = reverseArr.length - 1; i < j; i++, j--) {
            int temp = reverseArr[i];
            reverseArr[i] = reverseArr[j];
            reverseArr[j] = temp;
        }
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.println(reverseArr[i]);
        }
        //    打乱数组数据
        System.out.println("----打乱数组数据----");
        int[] orderArr = {1, 3 ,5 ,7, 9, 11};
        Random ri = new Random();
        for (int i = 0; i < orderArr.length; i++) {
            int number = ri.nextInt(orderArr.length);
            int temp = orderArr[i];
            orderArr[i] = orderArr[number];
            orderArr[number] = temp;
        }
        for (int i = 0; i < orderArr.length; i++) {
            System.out.println(orderArr[i]);
        }
    }
}
