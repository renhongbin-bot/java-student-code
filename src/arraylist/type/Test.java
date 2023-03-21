package arraylist.type;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        类泛型
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        MyArrayList<Integer> nums = new MyArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println(nums.get(2));
//        方法泛型
        ArrayList<String> listStr = new ArrayList<>();
        FuncArrayList.addAll(listStr, "zs", "ls", "ww", "sj", "lk");
        System.out.println(listStr);
//        接口泛型
        InterArrayList<String> interArrayList = new InterArrayList();
        interArrayList.add("sd");
    }
}
