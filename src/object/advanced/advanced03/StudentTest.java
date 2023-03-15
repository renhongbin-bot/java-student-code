package object.advanced.advanced03;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 21,"男");
        Student s2 = new Student("李四", 20,"男");
        Student s3 = new Student("王五", 25,"女");
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(StudentUtils.getMaxAge(list));;
    }
}
