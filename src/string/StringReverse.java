package string;

public class StringReverse {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverse(str));
    }
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }
}
