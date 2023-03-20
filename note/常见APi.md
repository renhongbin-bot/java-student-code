### Math
- 一个用于数学计算的工具类

### System 
- 提供一个与系统相关的工具类
```
System.exit(0)//0:表示当前虚拟机是正常停止的,非0:当前虚拟机是异常停止
long l =System.currentTimeMillis();//时间戳
System.arraycopy(arr1, 0, arr2, 0, 10); //拷贝数组 System.arraycopy(源数组, 起始索引, 目的数组, 起始索引, 拷贝个数)
```

### Runtime
- ```public static Runtime getRuntime()```:当前系统的运行环境对象
- ```public void exit(int status)```:停止虚拟机
- ```public int availableProcessors```:获取CPU线程数
- ```public long maxMemory()```:JVM从系统中获取总内存大小(单位byte)
- ```public long totalMemory()```:JVM已经从系统中获取的总内存大小(单位byte)
- ```public long freeMemory()```:JVM剩余内存大小(单位byte)
- ```public process exec(String command)```:运行cmd命令

### Object和Objects