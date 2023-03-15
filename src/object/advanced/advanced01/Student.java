package object.advanced.advanced01;

public class Student {
    private String name;
    private int age;
    private String gender;
//    static静态变量共享成员属性 ,可以通过类名调用(推荐), 也可以通过对象名调用
    public static String teacher;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + "}";
    }
    public void Study() {
        System.out.println(name + "正在学习!");
    }
    public void show() {
        System.out.println(name + ", " + age + ", " + gender + "," + teacher);
    }
}
