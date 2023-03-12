package objectTest;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请录入第" + (i + 1) + "辆车的品牌:");
            String name = sc.next();
            System.out.println("请录入第" + (i + 1) + "辆车的价格:");
            int price = sc.nextInt();
            System.out.println("请录入第" + (i + 1) + "辆车的颜色:");
            String color = sc.next();
            c.setName(name);
            c.setPrice(price);
            c.setColor(color);
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + " " + arr[i].getPrice() + " " + arr[i].getColor());
        }
    }
}
