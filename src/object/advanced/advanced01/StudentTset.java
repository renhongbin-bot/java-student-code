package object.advanced.advanced01;

public class StudentTset {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(23);
        stu1.setGender("男");
        stu1.teacher = "阿伟";
        stu1.Study();
        stu1.show();

        Student stu2 = new Student();
        stu2.setName("李四");
        stu2.setAge(18);
        stu2.setGender("女");
        stu2.Study();
        stu2.show();
    }
}
