package objectTest;

public class CommodityTest {
    public static void main(String[] args) {
        Commodity[] arr = new Commodity[3];
        Commodity c1 = new Commodity(1, "华为", 5499, 100);
        Commodity c2 = new Commodity(2, "小米", 2399, 105);
        Commodity c3 = new Commodity(3, "苹果", 5999, 120);

        arr[0] = c1;
        arr[1] = c2;
        arr[2] = c3;
        for (int i = 0; i < arr.length; i++) {
            Commodity commodity = arr[i];
            System.out.println(commodity.getId());
            System.out.println(commodity.getName());
            System.out.println(commodity.getPrice());
            System.out.println(commodity.getResidue());
        }
    }
}
