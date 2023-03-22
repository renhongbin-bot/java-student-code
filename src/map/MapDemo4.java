package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        Student student = new Student("zs", 23);
        Student student2 = new Student("ls", 24);
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(student, "江苏");
        hm.put(student2, "湖北");
//        Set<Student> keys = hm.keySet();
//        for (Student key : keys) {
//            String value = hm.get(key);
//            System.out.println(key + "=" + value);
//        }
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
