package string;

public class StringDefinition {
    public static void main(String[] args) {
//        直接赋值
        String s1 = "abc";
        System.out.println(s1);

//        new赋值字符串
        String s2 = new String();
        System.out.println(s2); //""
//        new传递字符串对象
        String s3 = new String("bcd");
        System.out.println(s3);

//        传递一个字符串数组,根据字符数组的内容创建字符串对象
        char[] chars = {'f', 'j', 'h'};
        String s4 = new String(chars);
        System.out.println(s4);

//      传递一个字节数组,根据字节数组创建一个字符串对象
//        应用场景:以后网络中传输的数据都是字节信息,一般通过字节信息转成字符串
        byte[] bytes = { 100, 105, 106 };
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
