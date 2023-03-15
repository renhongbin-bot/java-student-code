package object.advanced.advanced04;

public class Student {
    String name;
    int age;
    static String teacherName;

//    this表示当前方法调用者的地址值
//    可以理解为当前这个类的变量
    public void show1(Student this) {
        System.out.println(name + ", " + age + ", " + teacherName);
    }
    public static void method() {
        System.out.println("静态方法");
    }
}
