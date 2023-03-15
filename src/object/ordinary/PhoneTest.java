package object.ordinary;

public class PhoneTest {
    public static void main(String[] args) {
//        创建手机对象
        Phone p = new Phone();
        p.brand = "华为";
        p.price = 4999.98;

        System.out.println(p.brand);
        System.out.println(p.price);
        p.cell();
        p.playGame();
//创建第二个对象
        Phone p2 = new Phone();
        p2.brand = "小米";
        p2.price = 1999.98;

        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.cell();
        p2.playGame();
    }
}
