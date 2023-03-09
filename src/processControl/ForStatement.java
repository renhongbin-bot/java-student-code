package processControl;

import java.util.Scanner;

public class ForStatement {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("---------------------------");
        for(int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i + "次连接");
        }
        System.out.println("------求1-5中间的和------");
        int result = 0 ;
        for (int i = 1; i <= 5; i++) {
            result += i;
        }
        System.out.println("和为"+result);
        System.out.println("------求1-100之间的偶数和----");
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) sum += i;
        }
        System.out.println("1-100的偶数和为:" + sum);
        System.out.println("----键盘录入两个数字,统计两个数范围间既能被3整数,又能被5整除的个数----");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int oneNum = sc.nextInt();
        System.out.println("请输入第二个数:");
        int twoNum = sc.nextInt();
        int number = 0;
        for(int i = oneNum < twoNum ? oneNum : twoNum; i <= (oneNum < twoNum ? twoNum : oneNum); i++) {
            if(i % 3 == 0 && i % 5 ==0) {
                number ++;
            }
        }
        System.out.println(number);
    }
}
