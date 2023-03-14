package string;

public class StringPhoneNumber {
    public static void main(String[] args) {
//        1.获取一个手机号
        String phoneNumber = "13176549876";
//        2.截取手机前三位
        String startStr = phoneNumber.substring(0, 3);
//        3.截取手机后面四位
        String endStr = phoneNumber.substring(7);
//        4.拼接
        String result = startStr + "****" + endStr;
        System.out.println(result);
    }
}
