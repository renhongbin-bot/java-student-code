import java.util.HashMap;
import java.util.Scanner;

public class AddRe {
    private static HashMap<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择操作：1.登录 2.注册");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("请输入用户名：");
            String username = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();
            if (login(username, password)) {
                System.out.println("登录成功！");
            } else {
                System.out.println("用户名或密码错误！");
            }
        } else if (choice == 2) {
            System.out.println("请输入用户名：");
            String username = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();
            if (register(username, password)) {
                System.out.println("注册成功！");
            } else {
                System.out.println("用户名已存在！");
            }
        } else {
            System.out.println("输入错误！");
        }
    }

    public static boolean login(String username, String password) {
        // TODO: 实现登录逻辑
        // 假设这里有一个名为users的HashMap，存储了用户名和密码的对应关系
        if (users.containsKey(username) && users.get(username).equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean register(String username, String password) {
        // TODO: 实现注册逻辑
        if (users.containsKey(username)) {
            return false;
        } else {
            users.put(username, password);
            return true;
        }
    }
}
