package test1;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 19);
        list.add(s1);
        Student s2 = new Student("李四", 22);
        list.add(s2);
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            int age = list.get(i).getAge();
            System.out.println("学生名字:" + name + ", 学生年龄:" + age);
        }
    }
}
