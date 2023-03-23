package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        //        ArrayList使用stream
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c","d", "e");
        Stream<String> stream1 = list.stream();
        list.stream().forEach(s -> System.out.println(s));
    }
}
