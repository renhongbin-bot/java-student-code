package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\world\\Desktop\\code\\studentCode\\java-student-code\\src\\a.txt");
        byte[] bytes = new byte[2];
//        一次读取多个数据,跟数组长度有关
//        返回值:本次读取了多少个字节数据
        int len = fis.read(bytes);
        System.out.println(len);
        String str = new String(bytes);
        System.out.println(str);
    }
}
