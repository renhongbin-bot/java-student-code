package object;

public class StudentTest {
    public static void main(String[] args) {
//        创建对象
        Student s = new Student("陈海棠", 21);
        Student d = new Student("ddd", 22);
        System.out.println(s); //地址值:object.Student@1b6d3586
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(d.getName());
        System.out.println(d.getAge());
    }
}
