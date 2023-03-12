package objectTest;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s = new Student(1, "张三", 18);
        Student s2 = new Student(2, "李四", 20);
        Scanner sc = new Scanner(System.in);
//        请输入id,
        System.out.println("请输入学生学号:");
        int id = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getId() == id) {

            }
        }
    }
}
