public class Variate {
    public static void main(String[] args) {
        //数据类型:限定变量的类型
        // int 整数 double小数
        //变量名:存储空间名字
        //数据值 真正存在变量中的数据
        int a = 8;
        System.out.println(a); //8

        //变量参与计算
        int b = 10;
        int c = 20;
        System.out.println(b + c);

        //修改变量的值
        a = 50;
        System.out.println(a);

        System.out.println("-------------------------------------------");
        //在一条语句中可以定义多个变量
        int d = 100, e = 200, f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //变量在使用之前一定要赋值
        int g;
        g = 500;
        // 建议:以后定义变量直接赋值
        System.out.println(g);
    }
}
