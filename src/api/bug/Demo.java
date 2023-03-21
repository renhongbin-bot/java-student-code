package api.bug;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String str = "java自1995年问世以来,经历了许多的版本,目前企业用的最多的是Java8和Java11,下一个版本是Java11";
//        获取正则表达式
        Pattern p = Pattern.compile("Java\\d{0,2}");
//        获取文本匹配器
        Matcher m = p.matcher(str);
//        循环获取
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
    }
}
