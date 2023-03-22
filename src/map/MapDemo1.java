package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
//        添加
        m.put("郭靖", "黄蓉");
        m.put("龙骑士", "牛头人");
        m.put("郭靖", "小青");
//        删除
        String result = m.remove("郭靖");
//        清空
//        m.clear();

//        键是否包含
        boolean flag = m.containsKey("龙骑士");
        System.out.println(flag);
//        值是否存在
        boolean valueShow = m.containsValue("牛头人");

//        是否无元素
        boolean isResult = m.isEmpty();

//        集合长度
        int size = m.size();
        System.out.println(size);
        System.out.println(isResult);
        System.out.println(valueShow);
        System.out.println(result);
        System.out.println(m);
    }
}
