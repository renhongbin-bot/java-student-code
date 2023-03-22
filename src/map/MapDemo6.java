package map;

import java.util.StringJoiner;
import java.util.TreeMap;

public class MapDemo6 {
    public static void main(String[] args) {
        String s = "ababsdbsbdsnsdsd";
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(tm.containsKey(c)) {
                int count = tm.get(c);
                count++;
                tm.put(c, count);
            } else {
                tm.put(c, 1);
            }
        }
// 遍历集合并拼接
//        StringBuilder sb = new StringBuilder();
//        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));
        StringJoiner sj = new StringJoiner("", "", "");
        tm.forEach((key, value) -> sj.add(key + "").add("(").add(value + "").add(")"));
        System.out.println(sj);
    }
}
