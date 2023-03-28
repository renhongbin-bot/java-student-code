## IO流
存储和读取数据的解决方案,用于读写文件中的数据(可以读写文件,或者网络中的数据...)<br>
流的方向:
- 输入流:读取
- 输出流:写入
- 字节流:所有类型文件
- 字符流:纯文本文件
### FileOutputStream
操作本地文件的字节输入流,可以把程序中的数据写入本地文件中
```java
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
```
字节流读取文件时,文件中不要有中文,否则会乱码
### 输入流循环读取
```public int read()```:一次读取一个字节（慢）
```public int read(byte[] buffer)```:一次读取多个字节(快)

### 字符集