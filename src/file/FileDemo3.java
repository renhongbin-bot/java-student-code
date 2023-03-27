package file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("E:\\javaCode\\JavaCode\\filetext\\c.txt");
////        创建一个新的空文件
//        boolean b = f1.createNewFile();
//        System.out.println(b); // 1. 如果文件存在,返回false,不存在返回true  2.如果父级路径不存在,那么会有异常 3.如果后缀不包含后缀名,创建一个没有后缀的文件
//        mkdir(文件夹) 1.windows中路径是唯一的, mkdir只能创建单级文件夹
//        File f2 = new File("E:\\javaCode\\JavaCode\\filetext\\eee");
//        boolean m = f2.mkdir();
//        System.out.println(m);
//     mkdir(创建多级文件夹,也能创建单级文件夹)
//        File f2 = new File("E:\\javaCode\\JavaCode\\filetext\\aaa\\bbb\\ccc\\ddd");
//        boolean m = f2.mkdirs();
//        System.out.println(m);
//        删除文件,空文件夹  细节:1.如果删除的是文件,直接删除,不走回收站 2.如果删除的是空文件夹,直接删除,不走回收站, 如果是有内容的文件夹,删除失败
        File f1 = new File("E:\\javaCode\\JavaCode\\filetext\\aaa");
        boolean b =  f1.delete();
        System.out.println(b);
    }
}
