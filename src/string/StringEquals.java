package string;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
