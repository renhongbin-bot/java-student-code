import java.util.Scanner;

public class KeyboardInputSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        int andNum = num +num2;
        System.out.println("求和为:" + andNum);
    }
}
