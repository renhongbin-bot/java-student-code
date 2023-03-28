package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
        * 文件拷贝
        * */
        long start = System.currentTimeMillis();
//        创建
        FileInputStream fis = new FileInputStream("C:\\Users\\world\\Desktop\\123.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\world\\Desktop\\code\\studentCode\\java-student-code\\123.jpg");
//        拷贝
        /*int b;
        while ((b =fis.read()) != -1) {
            fos.write(b);
        }*/
        int len;
        byte[] bytes = new byte[1024 * 100];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
//        释放资源
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
