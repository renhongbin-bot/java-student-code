package processControl;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String noodles = sc.nextLine();
        switch (noodles) {
            case "热干面":
                System.out.println("吃热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            default:
                System.out.println("都没有,只能吃方便面");
                break;
        }
    }
}
