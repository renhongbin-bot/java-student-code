package function;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
//        1.创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");
//        2.把它们都变成int
        list.stream().map(s -> Integer.parseInt(s)).forEach(s -> System.out.println(s));

//静态方法引用
//      注意:1.方法必须已经存在 2.方法的形参和返回值需要跟抽象方法的形参和返回值保持一致 3.方法的功能需要把新参的字符串转为数字
        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));
    }
}
