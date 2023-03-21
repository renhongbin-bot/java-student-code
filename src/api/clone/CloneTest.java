package api.clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        User u1 = new User(1, "zhangsan","123123sa", "asd", data);
        User u2 = (User) u1.clone();
        int[] arr = u1.getArr();
        arr[0] = 3;
        System.out.println(u1);
        System.out.println(u2);
    }
}
