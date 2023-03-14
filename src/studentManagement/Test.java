package studentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("123", "张三", 23, "武汉");
        students.add(student);
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------欢迎来到学生管理系统!--------------");
        while (true) {
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    addStudent(students, sc);
                    break;
                case 2:
                    System.out.println("请输入需要删除的学生ID");
                    String id = sc.next();
                    if(isStudentId(students, id)){
                        deleteStudent(students, id);
                    } else {
                        System.out.println("该用户ID不存在");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("请输入需要修改的学生ID");
                    String setId = sc.next();
                    if(isStudentId(students, setId)){
                        SetStudent(students, sc, setId);
                    } else {
                        System.out.println("该用户ID不存在");
                    }
                    break;
                case 4:
                    if(students.size() == 0) {
                        System.out.println("当前无学生信息,请添加后在查询");
                    } else {
                        selectStudent(students);
                    }
                    break;
                default:
                    System.out.println("欢迎下次光临!");
                    return;
            }
        }

    }
    public static boolean isStudentId(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            if(id.equals(students.get(i).getId())) {
                return true;
            }
        }
        return false;
    }
    public static Student studentInfo(ArrayList<Student> students, Scanner sc, String sId) {
        System.out.println("请输入学生姓名:");
        String sName = sc.next();
        System.out.println("请输入学生年龄:");
        int sAge = sc.nextInt();
        System.out.println("请输入学生住址:");
        String sAddress = sc.next();
        return new Student(sId, sName, sAge, sAddress);
    }
    public static void addStudent(ArrayList<Student> students, Scanner sc) {
//        请输入学生ID
        System.out.println("请输入学生ID");
        String sId = sc.next();
        if (students.size() >= 1) {
            for (int i = 0; i < students.size(); i++) {
                String id = students.get(i).getId();
                System.out.println(id + sId);
                while (true) {
                    if (sId.equals(id)) {
                        System.out.println("已存在该学生ID,请重新输入学生ID");
                        sId = sc.next();
                    } else{
                        break;
                    }
                }
            }
        }
        Student s = studentInfo(students, sc, sId);
        students.add(s);
        for (int i = 0; i < students.size(); i++) {
            Student s1 = students.get(i);
            System.out.println("当前添加为:" + s1.getId() + s1.getName() + s1.getAge() + s1.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            if(id.equals(students.get(i).getId())) {
                students.remove(i);
            }
        }
    }
    public static void SetStudent(ArrayList<Student> students, Scanner sc, String id) {
        int num = 0;
        for (int i = 0; i < students.size(); i++) {
            if(id.equals(students.get(i).getId())) {
                num = i;
            }
        }
        Student s = studentInfo(students, sc, id);
        students.set(num, s);
    }

    public static void selectStudent(ArrayList<Student> students) {
        System.out.println("id    姓名   年龄   地址");
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            String id = stu.getId();
            String name = stu.getName();
            int age = stu.getAge();
            String adr = stu.getAddress();
            System.out.println(id + "   " + name + "   " + age + "   " + adr);
        }
    }
}
