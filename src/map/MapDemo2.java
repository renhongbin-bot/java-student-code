package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("郭靖", "黄蓉");
        m.put("龙骑士", "牛头人");
        m.put("欧阳克", "小青");
//        获取所有键,放到set中
//        Set<String> keys = m.keySet();
//遍历得到每一个键
//        for (String key : keys) {
//            System.out.println(key);
//            利用键获取值
//            String value = m.get(key);
//            System.out.println(key + "=" + value);
//        }


//        获取所有键值对对象
        Set<Map.Entry<String, String>> entries= m.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
