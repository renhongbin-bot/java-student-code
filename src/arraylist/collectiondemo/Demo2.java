package arraylist.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
//        获取迭代器对象
        Iterator<String> it = coll.iterator();
//        利用循环不断获取集合中每一个元素
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
