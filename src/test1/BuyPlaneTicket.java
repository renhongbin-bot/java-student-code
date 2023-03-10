package test1;

public class BuyPlaneTicket {
    public static void main(String[] args) {
//        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价月份和头等舱或经济舱。
//        按照如下规则计算机票价格:旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
        System.out.println(getDiscountPrice(1000, 6, true));
    }
    public static double getDiscountPrice(double price, int month, boolean isVip) {
        boolean isHighSeason = month >= 5 && month <= 10;
        double highSeasonDiscount = getNum(isHighSeason, 0.9, 0.85);
        double vipDiscount = getNum(isVip, 0.7, 0.65);
        return price * highSeasonDiscount * vipDiscount;
    }

    private static double getNum(boolean isB, double v1, double v2) {
        double num = isB ? v1: v2;
        return num;
    }
}
