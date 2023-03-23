package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-14", "张敏-13");
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));
//        toArray:收集到数组
        list.stream().toArray(v -> new String[v]);
//        collect:收集到集合
        List<String> newList = list.stream().filter(s -> Integer.parseInt(s.split("-")[1]) > 14).collect(Collectors.toList());
        System.out.println(newList);
//        Map
        Map<String, Integer> map2 = list.stream().filter(s -> Integer.parseInt(s.split("-")[1]) > 13)
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[1])
                ));
        System.out.println(map2);
    }
}
