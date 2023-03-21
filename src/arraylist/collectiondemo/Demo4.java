package arraylist.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Demo4 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zs");
        coll.add("ls");
        coll.add("ww");
//        lambda遍历元素
//        forEach底层原理:也会自己遍历集合,依次得到每一个元素
        coll.forEach(s -> System.out.println(s));
    }
}
