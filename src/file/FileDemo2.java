package file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File f1 = new File("E:\\javaCode\\JavaCode\\filetext\\a.txt");
        File f2 = new File("E:\\javaCode\\JavaCode\\filetext\\b");
        File f3 = new File("E:\\javaCode\\JavaCode\\filetext\\b.txt");
        System.out.println("-----------文件夹判断----------");
        System.out.println(f1.isDirectory()); // false
        System.out.println(f2.isDirectory()); // true
        System.out.println(f3.isDirectory()); // false
        System.out.println("-----文件判断-----------");
        System.out.println(f1.isFile()); // true
        System.out.println(f2.isFile()); // false
        System.out.println(f3.isFile()); // false
        System.out.println("--------对一个不存在的路径进行判断--------");
        System.out.println(f1.exists()); // true
        System.out.println(f2.exists()); // true
        System.out.println(f3.exists()); // false
        System.out.println("------返回文件大小(字节数)----------");
        System.out.println(f1.length()); // 9
        System.out.println(f2.length()); // 0 无法获取文件夹大小
        System.out.println("--------获取文件绝对路径--------");
        System.out.println(f1.getAbsoluteFile()); //E:\javaCode\JavaCode\filetext\a.txt
        System.out.println("--------获取定义文件时的路径-------");
        System.out.println(f1.getPath()); // E:\javaCode\JavaCode\filetext\a.txt
        System.out.println("-------获取文件名字------------");
        System.out.println(f1.getName()); //a.txt
        System.out.println(f2.getName()); //b
        System.out.println("-----获取文件最后修改时间------------");
        System.out.println(f1.lastModified()); //1679924732000
    }



}
