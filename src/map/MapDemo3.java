package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("郭靖", "黄蓉");
        m.put("龙骑士", "牛头人");
        m.put("欧阳克", "小青");

        m.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
