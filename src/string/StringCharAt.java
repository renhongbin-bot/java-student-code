package string;

import java.util.Scanner;

public class StringCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        int upperNum = 0;
        int caseNum = 0;
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <='z') {
                caseNum ++;
            } else if(c >= 'A' && c <= 'Z') {
                upperNum ++;
            } else if(c >= '0' && c <= '9') {
                number ++;
            }
        }
        System.out.println("大写字母个数:" + upperNum);
        System.out.println("小写字母个数:" + caseNum);
        System.out.println("数字个数:" + number);
    }
}
