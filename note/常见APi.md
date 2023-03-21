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
Object是java中的顶级父类,所有的类都直接或者间接继承Object类
- ```pulic String toString()```:返回对象的字符串表现形式
- ```public boolean equals(Object obj)```:比较两个对象是否相等,比较的是地址值,意义不大,一般需要重写比较内部值
- ```protected Object clone(int a)```:对象克隆,只能被本包中的类和其它包中的子类使用

**object中的克隆方法是浅克隆**:
- 浅克隆:不管对象内部的属性是基本数据类型还是引用数据类型,都完全拷贝过来
- 深客隆:基本数据类型拷贝过来字符串复用,引用数据类型会重新创建新的

**Objects成员方法**
- ```public static boolean equals(Object a, Object b)```:先做非空判断,比较两个对象
- ```public static boolean isNull(Object obj)```:判断对象是否为null
- ```public static boolean nonNull(Object obj)```:和isNull结果相反

### BigInteger
- ```public BigInteger(int num,Random rnd)```:获取随机大整数,范围:[0~2的num次方]
- ```public BigInteger(String val)```:获取指定大整数
- ```public BigInteger(String val, int radix)```:获取指定进制的大整数
- ```public static BigInteger valueOf(long val)```:静态方法获取 BigInteger 对象,内部有优化
1. 如果bigInteger表示的数字没有超出long范围,可以用静态方法获取
2. 如果bigInteger表示的数字超出long范围,可以用构造方法获取
3. 对象一旦创建,bigInteger内部记录的值不能发生改变
4. 只要进行计算内部都会产生一个新的bigInteger
方法:
- ```public BigInteger add(BigInteger val)```:加法
- ```public BigInteger subtract(BigInteger val)```:减法
- ```public BigInteger mulyiply(BigInteger val)```:乘法
- ```public BigInteger divide(BigInteger val)```:除法,获取商
- ```public BigInteger divideAndRemainder(BigInteger val)```:除法,获取商和余数
- ```public boolean equals(Object x)```:比较是否相同
- ```public BigInteger pow(int exponent)```:次幂
- ```public BigInteger max/min(BigInteger val)```:返回较大值/较小值
- ```public int intValue(BigInteger val)```:转为int类型整数,超出范围数据有误

### bigDecima
- 用于小数精确运算
- 用于表示很大的小数
1. 如果表示的数字没有超出double,建议使用indexOf创建,否则使用构造方法传入字符串进行构造
2. 如果传递范围是0~10之间整数,包含0,包含10,那么方法返回已经创建好的对象,不会重新new

方法:
- ```public static BigDecimal valueOf(double val)```:获取对象
- ```public BigDecimal add(BigDecimal val)```:加法
- ```public BigDecimal subtract(BigDecimal val)```:减法
- ```public BigDecimal mulyiply(BigDecimal val)```:乘法
- ```public BigDecimal divide(BigDecimal val)```:除法
- ```public BigDecimal divide(BigDecimal val, 精确几位,舍入模式)```:除法

### 正则表达式
- 作用1:校验字符串是否满足规则
- 作用2:在一段文本中查找满足要求的内容(爬虫)
方法:
- ```matches() boolean flag = str.matches(regex);```: 可以快速判断能否在str中找到regex;
- ```String[]  ss = s.split(regex);```:用regex把字符串分隔开来，返回String数组;
- ```while(matcher.find(i)){i++;}```:Matcher.find( )的功能是发现CharSequence里的，与pattern相匹配的多个字符序列。
- ```matcher.group( )```:
- ```matcher.start( );matcher.end( );```:如果匹配成功，start( )会返回此次匹配的开始位置，end( )会返回此次匹配的结束位置，即最后一个字符的下标加一。 如果之前的匹配不成功(或者没匹配)，那么无论是调用start( )还是end( )，都会引发一 个IllegalStateException。
- ```String result = s.replaceAll(regex,ss); String result = s.replaceFirst(regex,ss);```:replaceFirst(String replacement)将字符串里，第一个与模式相匹配的子串替换成replacement。replaceAll(String replacement)，将输入字符串里所有与模式相匹配的子串全部替换成replacement。
- ```m.reset("java");```:用reset( )方法可以给现有的Matcher对象配上个新的CharSequence。 如果不给参数，reset( )会把Matcher设到当前字符串的开始处。
### 爬虫(搜一下了解)

### Date(时间)和SimpleDateFormat(格式化时间)和Calender(日历)
时间不能直接比较,要比较先转为时间戳<br>
Date:
- ```new Date().getTime()```:获取时间戳
- ```setTime```:设置时间
SimpleDateFormat:
默认格式: 1970/1/1 上午8:00
- ```public SimpleDateFormat(String pattern)```:指定时间格式
方法
- ```public final String formar(Date date)```:格式化(日期对象->字符串)
- ```public Date parse(String source)```:解析(字符串->日期对象)

Calender:
Calender是一个抽象类,不能new实例,只能通过getInstance()获取
- ```public static Calendar getInstance()```:获取当前时间的日历对象
- ```public final Date getTime()```:获取日期对象
- ```public final Date setTime(Date date)```：给日历设置日期对象
- ```public long getTimeInMillis()```:拿到时间毫秒值
- ```public viod setTimeInMillis(long millis)```:给日历设置毫秒值
- ```public int get(int field)```:取日历中某个字段信息
- ```public void set(int field, int value)```:修改日历中某个字段信息
- ```public void add(int field, int amount)```:为某个字段增加/减少指定的值

###JDK 8中的时间类(自己搜)