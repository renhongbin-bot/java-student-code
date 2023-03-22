package map;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("zs", "1j");
        hm.put("ls", "2j");
        hm.put("ww", "3j");
        hm.put("zl", "4j");
        hm.put("cq", "5j");
        hm.put("lb", "6j");
        hm.put("hj", "7j");
        hm.put("qy", "8j");
        hm.put("ze", "9j");
        hm.put("iu", "10j");
        hm.put("ml", "11j");
        hm.put("mk", "12j");
//        获取所有键值对对象
//        Set<Map.Entry<String, String>> entries = hm.entrySet();
////        把entries变成一个数组
//        Map.Entry[] arr1 = new Map.Entry[0];
////        toArr方法在底层会比较集合的长度跟数组的长度两者的大小
////        如果集合长度 > 数组的长度 : 数据在数组中放不下,会根据数组实际个数,重新创建数组
////        如果集合长度 <= 数组的长度 : 数据在数组中放的下,此时不会创建新的数组,直接用即可
//        Map.Entry[] arr2 = entries.toArray(arr1);
////        不可变map集合
//        Map map = Map.ofEntries(arr2);
        hm.remove("ml");
        System.out.println(hm);
    }
}
