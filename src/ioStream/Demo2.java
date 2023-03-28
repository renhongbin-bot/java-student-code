package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
//        1.写出一段文字到本地文件
        FileInputStream fis = new FileInputStream("C:\\Users\\world\\Desktop\\code\\studentCode\\java-student-code\\src\\a.txt");
//        2.循环读取
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
    }
}
