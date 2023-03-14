package arraylist;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User u1 = new User("001", "admin", "123455");
        User u2 = new User("002", "root", "22222");
        User u3 = new User("003", "admin", "32312");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        System.out.println(selectUser(users, "004"));
    }
    public static boolean selectUser( ArrayList<User> users, String id) {
        for (int i = 0; i < users.size(); i++) {
            String userId = users.get(i).getId();
            if(userId == id) {
                return true;
            }
        }
        return false;
    }
}
