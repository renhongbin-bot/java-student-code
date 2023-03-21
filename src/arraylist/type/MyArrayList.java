package arraylist.type;

import java.util.ArrayList;
import java.util.Arrays;

//我们在编写一个类时,不确定类的类型,就可以指定为泛型类
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;


    //    T:不确定的类型,该类型在类后面已经定义过了
    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }
    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
