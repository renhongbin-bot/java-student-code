package processControl;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();
//        小括号中表示生成随机数的范围
//        范围从0开始到这个数-1结束
//        生成一个从1-100之间的随机数
        int number = r.nextInt( 100) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("猜一下这个随机数是多少");
            int result = sc.nextInt();
//        判断数字
            if(result < number) {
                System.out.println("猜的数字小了");
            } else if (result > number) {
                System.out.println("猜的数字大了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
