package string;

import java.util.Scanner;

public class StringMoney {
    public static void main(String[] args) {
//        1.键盘录入一个有效金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请录入一个金额");
            money = sc.nextInt();
            if(money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }
//        钱的大写
        String moneyStr = "";
//        2.得到money每一位数字
        while (money > 0) {
            int ge = money % 10;
             String capitalNumber = getCapitalNumber(ge);
             moneyStr = capitalNumber + moneyStr;
            money /= 10;
        }
//        3.补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
//        4.插入单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }
//    把小写数字转为大写数字
    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
