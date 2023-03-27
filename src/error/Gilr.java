package error;

public class Gilr {
    private String name;
    private int age;

    public Gilr() {
    }

    public Gilr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if(len < 3 || len > 10) {
            throw new NameFormException(name + "格式有误,长度为3-10");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 || age > 40) {
            throw new AgeOutofBoundsException(age + "超出了范围");
        }
        this.age = age;

    }

    @Override
    public String toString() {
        return "Gilr{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
