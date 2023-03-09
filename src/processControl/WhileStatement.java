package processControl;

import sun.rmi.runtime.Log;

public class WhileStatement {
    public static void main(String[] args) {
        System.out.println("----利用while打印1-100----");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("-----折纸成珠穆朗玛峰-----");
        double paper = 0.1;
        int j = 0;
        while (paper < 8844430) {
            paper = paper * 2;
            j++;
        }
        System.out.println("需要折"+ j +"次");
        System.out.println("----回文数----");
        int palindromicNumber = 131;
        int pN = palindromicNumber;
        int result = 0;
        while (pN != 0) {
            //从右往左依次获取每一位数字
            int ge = pN % 10;
            pN = pN / 10;
            result = result * 10 + ge;
        }
        System.out.println("该数字" + (result == palindromicNumber ? "是" : "不是") + "回文数");
        System.out.println("-----实现除法得到商和余数-----");
        int divisor = 20;
        int dividend = 67;
        int consult = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            consult++;
        }
        System.out.println("商:" + consult + ",余数:" + dividend);
    }
}
