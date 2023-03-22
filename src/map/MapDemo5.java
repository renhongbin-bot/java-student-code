package map;

import java.util.*;

public class MapDemo5 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index= r.nextInt(arr.length);
            list.add(arr[index]);
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            if(hm.containsKey(name)) {
                int count = hm.get(name);
                count++;
                hm.put(name, count);
            } else {
                hm.put(name, 1);
            }
        }

//        求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer count = entry.getValue();
            max = count > max ? count : max;
        }
        System.out.println(max);
        for (Map.Entry<String, Integer> entry : entries) {
            Integer count = entry.getValue();
            if(count == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
