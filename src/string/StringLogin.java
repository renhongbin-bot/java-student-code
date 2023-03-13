package string;

import java.util.Scanner;

public class StringLogin {
    public static void main(String[] args) {
        String userName = "zhangsan";
        String passWord = "123456";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String user = scanner.next();
            System.out.println("请输入密码:");
            String pwd = scanner.next();
            if(user.equals(userName) && pwd.equals(passWord)) {
                System.out.println("用户登陆成功");
                break;
            } else {
                System.out.println("用户登录失败. 用户名或者密码错误");
            }
        }
    }
}
