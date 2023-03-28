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

### 字节集
1. 不要用字节流读取文本文件
2. 编码解码时使用同一个码表同一个编码方式
### 编码和解码方法
编码:
- ```public byte[] getBytes()```:使用默认方式进行编码
- ```public byte[] getBytes(String charsetName)```:使用指定方式进行编码
解码:
- ```String(byte[] bytes)```:使用默认方式进行解码
- ```String(byte[] bytes, String charsetName)```:使用指定方式进行解码
### 字符流
输入流:默认一次读一个字节,遇到中文时,一次读多个字节
### FileReader
```java
//        1.写出一段文字到本地文件
//         细节1:参数是字符串表示的路径或者是File对象都是可以的
//         细节2:如果文件不存在会创建一个新的文件,但是要保证父级路径是存在的
//         细节3:如果文件已经存在,则会清空文件
        FileReader fr = new FileReader("C:\\Users\\world\\Desktop\\code\\studentCode\\java-student-code\\src\\a.txt");
//        2.写出数据
//         细节:空参read:读取完之后,底层会对编码转为10进制
                int ch;
                while((ch = fs.read()) != -1) {
                    System.out.print(ch)
                }
//        3.释放资源
//          细节:每次使用完流都要释放资源
        fr.close();
```
构造方法:
```oublic FileWriter(File file)```:创建字符输出流关联本地文件
```oublic FileWriter(String pathname)```:创建字符输出流关联本地文件
```oublic FileWriter(File file, boolean append)```:创建字符输出流关联本地文件,续写
```oublic FileWriter(String pathname, boolean append)```:创建字符输出流关联本地文件,续写
### 字节缓冲流
原理:底层自带了长度为8192的缓冲区提高性能，读写时提高与硬盘打交道的时间
```public BufferedInputStream(InputStream is)```:把基本流包装成高级流,提高读取数据的性能
```public BufferedOutputStream(InputStream os)```:把基本流包装成高级流,提高写出数据的性能
###  字符缓冲流
```public BufferedReader(Reader r)```:把基本流变成高级流
```public BufferedWriter(Writer r)```:把基本流变成高级流
特有方法:
```public String readLine()```:读取一行数据,如果没有数据可读了,会返回null
```public void newLine()```: 跨平台的换行

### 转换流
字节流和字符流之间的桥梁
作用:
1. 字节流想要使用字符流中的方法

### 序列化流