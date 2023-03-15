package object.advanced.advanced04;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "阿伟老师";
        Student s1 = new Student();
        s1.name = "zs";
        s1.age = 23;
        s1.show1();
        System.out.println("---------------");
        Student s2 = new Student();
        s2.name = "li";
        s2.age = 24;
        s2.show1();
    }
}
