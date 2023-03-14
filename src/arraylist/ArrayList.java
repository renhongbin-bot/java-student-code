package arraylist;

public class ArrayList {
    public static void main(String[] args) {
//        1.创建集合对象
//        泛型:限定集合存储的数据类型
//        集合方法: add 添加元素 remove 删除元素 remove(index) 指定索引删除 set 修改指定索引元素 get获取指定索引元素 size 集合长度
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
//        添加元素, 返回true
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        删除元素, 返回true或false
        list.remove("aaa");
//        删除指定索引元素,返回被删除的元素
        list.remove(0);
//        修改元素, 返回被覆盖的元素
        list.set(1, "ddd");
//        查询指定索引的元素
        String s = list.get(0);
//        获取集合长度
        System.out.println(list.size());
//        遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(s);
        System.out.println(list);
    }
}
