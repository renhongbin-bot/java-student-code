package object.advanced.advanced03;

import java.util.ArrayList;

public class StudentUtils {
    private StudentUtils() {}
    public static int getMaxAge(ArrayList<Student> students) {
        int age = students.get(0).getAge();
        for (int i = 1; i < students.size(); i++) {
            age = age > students.get(i).getAge() ? age : students.get(i).getAge();
        }
        return age;
    }
}
