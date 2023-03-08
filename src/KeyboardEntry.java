import java.util.Scanner;

public class KeyboardEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入打印的内容");
        int i = sc.nextInt();
        System.out.println(i);
    }
}
