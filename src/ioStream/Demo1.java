package ioStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
//        1.写出一段文字到本地文件
//         细节1:参数是字符串表示的路径或者是File对象都是可以的
//         细节2:如果文件不存在会创建一个新的文件,但是要保证父级路径是存在的
//         细节3:如果文件已经存在,则会清空文件
        FileOutputStream fos = new FileOutputStream("C:\\Users\\world\\Desktop\\code\\studentCode\\java-student-code\\src\\a.txt");
//        2.写出数据
//         细节:write方法的参数是整数,实际写到本地文件中的是ASCII对应的字符
        fos.write(57);
        fos.write(55);
//        3.释放资源
//          细节:每次使用完流都要释放资源
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
