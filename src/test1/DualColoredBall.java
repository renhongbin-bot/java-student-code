package test1;

import java.util.Random;
import java.util.Scanner;

public class DualColoredBall {
    public static void main(String[] args) {
//        1.生成中奖号码
        int[] arr = creatNumber();
        System.out.println("=================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("======================");
//        2.用户输入彩票号码(红球 + 蓝球)
        int[] userInputArr = userInputNumber();
//        3.判断是否中奖
//        红球,蓝球
        int redCount = 0;
        int blueCount = 0;
//        判断红球
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if(redNumber == arr[j]) {
                    redCount ++;
//                    如果找到了,就跳出内循环
                    break;
                }
            }
        }
//        判断蓝球
        int blueNumber = userInputArr[userInputArr.length - 1];
        if(blueNumber == arr[arr.length -1]) {
            blueCount ++;
        }
        System.out.println(redCount);
        System.out.println(blueCount);
    }
    public static int[] userInputNumber() {
//        创建用户购买的彩票号码
        int[] arr = new int[7];
//        利用键盘录入让用户输入
        Scanner sc = new Scanner(System.in);
//        让用户输入红球号码
        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
//            redNumber 在1~33之间
            if(redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if(!flag) {
//                    不存在
                    arr[i] = redNumber;
                    i++;
                } else {
//                    存在
                    System.out.println("当前红球已经存在,请重新输入");
                }
            } else {
                System.out.println("当前红球号码超出范围");
            }
        }
        System.out.println("请输入蓝球号码");
        while (true) {
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝球号码超出范围");
            }
        }
        return arr;
    }
    public static int[] creatNumber() {
//        创建数组用于添加中奖号码
//        6个红球 1个蓝球 数组长度 7
        int[] arr = new int[7];

//        2.随机生成号码并添加到数组当中
//        红球:不能重复的 1 2 3 4 5 6
//        蓝球: 可以跟红球号码重复 5
//        生成红球号码并添加到数组中
        Random r = new Random();
        for (int i = 0; i < arr.length - 1;) {
//            获取红球号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if(!flag) {
//                不存在时把红球添加到数组中
                arr[i] = redNumber;
                i++;
            }
        }
//        生成蓝球号码并添加到数组中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number) return true;
        }
        return false;
    }
}
