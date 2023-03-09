package processControl;

public class SevenPasses {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
//            7的倍数 || 个位为7 || 十位为7
            if(i % 7 == 0 || i % 10 ==7 || i / 10 == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
