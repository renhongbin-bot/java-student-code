package arraylist.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
//        Collection是一个接口,我们不能直接创建对象
//        多态  目的:为了学习Collection里面的方法
        Collection<String> coll = new ArrayList<>();
//        1.添加元素
//        细节:如果我们要往List系列添加数据,那么方法永远返回true,因为List允许重复值
//        如果是Set系列集合添加数据,如果当前元素不存在,返回true,否则false
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
//        2.清空
//        coll.clear();
//        3.删除,通过对象删除,而不是通过索引删除
//        删除成功返回true,失败返回false
        coll.remove("aaa");
//        4.判断元素是否包含,存在返回true,否则返回false
//        底层依赖equals方法判断是否存在,所以集合中存储的是自定义对象,也想通过contains方法来判断是否,那么javabean类中,一定要重写equals方法
        boolean result = coll.contains("bbb");
        System.out.println(result);
//        5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);
//        6.获取集合的长度
        int size = coll.size();
        System.out.println(size);
    }
}
