package processControl;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int num = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i < (int)Math.sqrt(num); i++) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(num + (flag ? "是" : "不是") + "一个质数");
    }
}
