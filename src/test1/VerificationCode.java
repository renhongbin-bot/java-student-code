package test1;

import java.util.Random;

public class VerificationCode {
//    验证码
//    随机生成一个验证码,格式为:长度为5,前四位是大写字母或者小写字母随机,最后一位是数字
    public static void main(String[] args) {
        char[] ches = new char[52];
//        大写字母和小写字母放在数组中
        for (int i = 0; i < ches.length; i++) {
            if(i < 26) {
                ches[i] = (char) (97 + i);
            } else {
                ches[i] = (char) (65 + i -26);
            }
        }
//        随机抽取四个字母
//        定义一个字符串类型接收变量,来记录最终值
        Random r = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            int number = r.nextInt(ches.length);
            str += ches[number];
        }
//        随机一个0~9的数字
        int num = r.nextInt(10);
        str += num;
        System.out.println(str);
    }

}
