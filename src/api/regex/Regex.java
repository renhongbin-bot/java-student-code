package api.regex;

public class Regex {
    public static void main(String[] args) {
        String qq = "123456789";
        boolean flag = qq.matches("[1-9]\\d{8,10}");
        System.out.println(flag);
    }
}
