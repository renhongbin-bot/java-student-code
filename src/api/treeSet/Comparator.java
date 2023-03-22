package api.treeSet;

import java.util.TreeSet;

public class Comparator {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });
        ts.add("c");
        ts.add("df");
        ts.add("ad");
        ts.add("qwer");
        System.out.println(ts);
    }
}
