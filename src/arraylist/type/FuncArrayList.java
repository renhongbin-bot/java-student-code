package arraylist.type;

import java.util.ArrayList;

public class FuncArrayList {
    public FuncArrayList() {
    }

    public static<E> void addAll(ArrayList<E> list, E ...e) {
        for (E element : e) {
            list.add(element);
        }
    }
    public void show() {
        System.out.println("赵四");
    }
}
