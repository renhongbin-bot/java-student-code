package test1;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入字符串:");
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag) {
                break;
            } else {
                System.out.println("当前不符合规则");
                continue;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48; //1 , 2 , 3 , 4
            String s = changeLonMa(number);
            System.out.println(s);
        }
    }
    public static String changeLonMa(int number) {
        String[] arr = {"一", "二", "三", "四", "五", "六", "七", "八", "九"};
        return arr[number - 1];
    }
    public static boolean checkStr(String str) {
        if(str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c > '9') {
                return  false;
            }
        }
        return true;
    }
}
