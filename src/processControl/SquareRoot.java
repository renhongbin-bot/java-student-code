package processControl;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("----求平方根----");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if(i * i == a) {
                System.out.println(i);
                break;
            } else if(i * i > a) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}
