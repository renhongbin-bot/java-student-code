package arithmeticOperator;

import java.util.Scanner;

public class TenHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hundred = a / 100 ;
        int ten = (a / 10) % 10;
        int unit = a % 10;
        System.out.println("百位是" + hundred);
        System.out.println("十位是" + ten);
        System.out.println("个位是" + unit);
    }
}
