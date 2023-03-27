### File
- File对象就表示一个路径,可以是文件的路径,也可以是文件夹的路径
- 这个路径可以是存在的,也允许是不存在的
方法:
- ```public File(String pathname)```:根据文件路径创建文件对象
- ```public File(String parent, String child)```:根据父路径名字符串和子路径名字符串创建文件对象
- ```public File(File parent, String child)```: 根据父路径对应的文件对象和子路径名字符串创建文件对象
### File常见成员方法
- ```public boolean isDirectory()```:判断此路径表示的File是否是文件夹
- ```public boolean isFile()```:判断此路径表示的File是否是文件
- ```public boolean exists()```:判断此路径名表示的file是否存在
- ```public long length()```:返回文件的大小
- ```public String getAbsolutePath()```:返回文件的绝对路径
- ```public String getPath()```: 返回定义文件时使用的路径
- ```public String getName()```: 返回文件的名称,带后缀
- ```public long lastModified()```: 返回文件的最后修改时间(时间毫秒值)
- ```public boolean createNewFile()```:创建一个新的空文件
- ```public boolean mkdir()```:创建单级文件夹
- ```public boolean mkdirs()```:创建多级文件夹
- ```public boolean delete()```: 删除文件,空文件夹, 直接删除,不走回收站
- >```public File listFiles()```: 获取当前路径下所有内容