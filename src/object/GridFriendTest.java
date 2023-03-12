package object;

public class GridFriendTest {
    public static void main(String[] args) {
//        创建女朋友对象
        GridFriend gf1 = new GridFriend();
        gf1.setName("陈海棠");
        gf1.setAge(21);
        gf1.setGender("女");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());
        gf1.eat();
        gf1.sleep();
    }
}
