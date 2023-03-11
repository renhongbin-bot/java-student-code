package test1;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
//        某系统的数字密码(大于e）。比如1983，采用加密方式进行传输，规则如下:
//        每位数加上5再对10求余，
//        最后将所有数字反转，得到一串新数。
        Scanner sc = new Scanner(System.in);
//        密码 1983
        int psw = sc.nextInt();
//        密码备份
        int pswRe = psw;
//        密码的位数
        int count = 0;
//        判断密码是几位数
        while (psw != 0) {
            psw = psw / 10;
            count++;
        }
//         保存密码每位数的数组
        int[] arr = new int[count];
//        数组的索引
        int arrIndex = arr.length - 1;
//        把密码存入数组中 [1, 9, 8, 3]
        while (pswRe != 0) {
            int ge = pswRe % 10;
            pswRe = pswRe / 10;
            arr[arrIndex] = ge;
            arrIndex --;
        }
//        对密码数组中每一位 + 5 然后对10取余[6, 4, 3, 8]
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
//        反转,调换位置[8, 3, 4, 6]
        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
//        把数组再转为数字 8346
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            value = value * 10 + arr[i];
        }
        System.out.println(value);
    }
}
