package test1;

import java.util.Scanner;

public class Decode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int encPsw = sc.nextInt();
        int encPswRe = encPsw;
        int count = 0;
        while (encPsw  > 0) {
            encPsw /= 10;
            count ++;
        }
        int[] encArr = new int[count];
        int val = encArr.length - 1;
        while (encPswRe > 0) {
            encArr[val] = encPswRe % 10;
            encPswRe /= 10;
            val --;
        }
//       取反
        for (int i = 0, j = encArr.length - 1; i < j; i++, j--) {
            if(i < j) {
                int temp = encArr[i];
                encArr[i] = encArr[j];
                encArr[j] = temp;
            }
        }
//
        for (int i = 0; i < encArr.length; i++) {
            System.out.println(encArr[i]);
            if(encArr[i] > 5) {
               encArr[i] = (encArr[i] + 5) % 10;
            } else {
                encArr[i] = encArr[i] % 10;
            }
        }

        for (int i = 0; i < encArr.length; i++) {
            System.out.println(encArr[i]);
        }
    }
}
