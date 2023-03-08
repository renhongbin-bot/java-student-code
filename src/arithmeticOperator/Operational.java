package arithmeticOperator;

public class Operational {
    public static void main(String[] args) {
        //+
        System.out.println(3 + 2);// 5
        //1.代码中如果有小数参与计算,结果可能是不精确的
        //2.整数参与计算只能得到整数
        System.out.println(1.1 + 1.01);//2.1100000000000003
        //-
        System.out.println(3 - 2);// 1
        //*
        System.out.println(3 * 2);// 6
        ///
        System.out.println(3 / 2);//1  整数相除只能得到整数
        System.out.println(3.0 / 2);//1.5
        //%
        System.out.println(3 % 2); //1
    }
}
