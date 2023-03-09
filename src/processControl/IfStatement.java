package processControl;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("小伙子,你有多少酒量?");
        Scanner sc = new Scanner(System.in);
        int drinkingCapacity = sc.nextInt();
        if(drinkingCapacity >= 0 && drinkingCapacity <= 10) {
            if(drinkingCapacity > 6) {
                System.out.println("小伙子,酒量不错,能照顾好我女儿");
            } else if(drinkingCapacity > 3) {
                System.out.println("小伙子酒量还得再练练啊,要努力啊,过两年再把女儿嫁给你");
            } else {
                System.out.println("酒量不太行啊小伙子,女儿不嫁给你了!");
            }
        } else {
            System.out.println("小伙子别吹牛");
        }
    }
}
