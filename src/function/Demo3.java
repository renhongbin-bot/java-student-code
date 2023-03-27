package function;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
//        添加数据
        Collections.addAll(list, "张无忌", "周芷若", "赵明", "张强", "张三丰");
//        过滤张开头3个字
        list.stream().filter(s -> s.startsWith("张") && s.length() == 3).forEach(s -> System.out.println(s));
//        方法引用
        list.stream().filter(new StringOperation():: stringJudge);
        list.stream().filter(new Demo3():: stringJudge);
    }
    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
