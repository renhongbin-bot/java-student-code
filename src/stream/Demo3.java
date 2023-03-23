package stream;

import java.util.HashMap;

public class Demo3 {
    public static void main(String[] args) {
//       HashMap使用stream
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aaa", 111);
        hm.put("bbb", 222);
        hm.put("ccc", 333);
        hm.put("ddd", 444);
//        第一种获取stream流
        hm.keySet().stream().forEach(s -> System.out.println(s));
//        第二种获取stream流
        hm.entrySet().stream().forEach(s -> System.out.println(s));
    }
}
