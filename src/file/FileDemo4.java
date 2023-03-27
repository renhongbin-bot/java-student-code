package file;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File f = new File("E:\\javaCode\\JavaCode\\filetext\\eee");
//        listFiles细节:
//        1.当调用者File表示的路径不存在时,返回null
//        2.当调用者FIle的路径表示的是文件的时候,返回null
//        3.当调用者FIle表示的是一个空文件夹,返回一个长度为0的数组
//        4.当调用者FIle的路径是一个有内容文件时,将里面的所有的文件和文件夹路径放在File数组中返回,包含隐藏文件
//        5.当调用者File表示的路径是需要权限才能访问的文件夹时,返回null
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
