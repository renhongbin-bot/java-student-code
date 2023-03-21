package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyBoard {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String numStr = s.nextLine();
            int num = Integer.parseInt(numStr);
            if(num < 1 || num > 100) {
                System.out.println("不在1-100之间,请重新输入");
                continue;
            }
//            添加到集合中  细节:集合里面是Integer,在添加触发了自动装箱
            list.add(num);
//            统计数据和
            int sum = getSum(list);
            if(sum > 200) {
                System.out.println("集合中的数据和已经满足要求:" + sum);
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "");
        }
    }
    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
