package test1;

import java.util.Random;

public class RedWars {
    public static void main(String[] args) {
        int[] redList = {2, 588, 888, 1000, 10000};
        int[] redRList = new int[redList.length];
        Random r = new Random();
        for (int i = 0; i < redList.length; ) {
            int num = r.nextInt(redList.length);
            int prize = redList[num];
//            如果存在重新抽取,不存在重新抽取
            if(!contains(redRList, prize)) {
//                不存在,把当前抽到的奖项添加到newArr中
                redRList[i] =  prize;
//                添加完毕之后移动索引
                i++;
            }
        }
        for (int i = 0; i < redRList.length; i++) {
            System.out.println(redRList[i]);
        }
    }
//    判断prize在数组中是否存在
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
