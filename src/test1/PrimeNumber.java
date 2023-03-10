package test1;

public class PrimeNumber {
//    找出101-200之间的质数的个数
    public static void main(String[] args) {
        System.out.println(getPrimeNumber());
    }
    public static int getPrimeNumber() {
        int num = 0;
        for(int i = 101; i <= 200; i++) {
            boolean flag = true;
            for(int j = 2; j < i - 1; j++) {
                if(i % j == 0) {
                    flag = false;
//                    跳出内循环
                    break;
                }
            }
            if(flag) {
                num ++;
            }
        }
        return num;
    }
}
