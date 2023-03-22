package api.treeSet;

import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("zs", 23);
        Student s2 = new Student("ls", 24);
        Student s3 = new Student("ww", 25);
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s3);
        ts.add(s2);
        ts.add(s1);
        System.out.println(ts);

    }
}
