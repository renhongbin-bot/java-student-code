package ioStream;

import java.io.*;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\javaCode\\JavaCode\\src\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\javaCode\\JavaCode\\src\\b.txt"));
//        循环读取并写到目的地
//一次读写一个字节
        /*int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }*/
//        一次读写多个字节
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
//        释放
        bos.close();
        bis.close();
    }
}
