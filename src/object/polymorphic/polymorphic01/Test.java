package object.polymorphic.polymorphic01;

public class Test {
    public static void main(String[] args) {
//        创建三个对象,调用register
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(20);
        Admin a = new Admin();
        a.setName("王五");
        a.setAge(22);

        register(s);
        register(t);
        register(a);
    }
//    多态:这个方法既能接收老师,也能接收学生,还能接收管理员
    public static void register(Person p) {
        p.show();
    }
}
