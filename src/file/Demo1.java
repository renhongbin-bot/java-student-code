package file;

import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
//        1.根据字符串表示的路径,变成File对象
        String str = "E:\\javaCode\\JavaCode\\filetext\\a.txt";
        File f1 = new File(str);
        System.out.println(f1); //E:\javaCode\JavaCode\filetext\a.txt
//     2.根据父路径名字符串和子路径名字符串创建文件对象
        String parent = "E:\\javaCode\\JavaCode\\filetext";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2); //E:\javaCode\JavaCode\filetext\a.txt

//        File f3 = new File(parent + "\\" + child);
//        System.out.println(f3);

//        3.根据父路径对应的文件对象和子路径名字符串创建文件对象
        File parent2 = new File("E:\\javaCode\\JavaCode\\filetext");
        String child2 = "a.txt";
        File f4 = new File(parent2, child2);
        System.out.println(f4);
    }
}
