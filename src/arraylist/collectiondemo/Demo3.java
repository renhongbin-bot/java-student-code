package arraylist.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo3 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zs");
        coll.add("ls");
        coll.add("ww");
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
