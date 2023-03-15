package object.ordinary;

public class GridFriend {
    private String name;
    private int age;
    private String gender;

//    针对成员变量提供get和set
//    set: 赋值
//    get: 对外提供成员变量
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        if(age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("女朋友年龄超出范围");
        }
    }
    public int getAge() {
        return this.age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return this.gender;
    }

    public void sleep() {
        System.out.println("女朋友在睡觉");
    }
    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
