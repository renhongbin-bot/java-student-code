## Stream
作用: 集合Lambda表达式,简化集合,数组操作
### Stream流操作步骤
1. 先得到一条Stream流,并把数据放上去<br>
获取方式:
- 单列获取:```default Stream<E> stream()```:Collection中的默认方法
- 双列获取:```无```:无法直接使用Stream流
- 数组:```public static<T> Stream<T> stream(T[] array)```:Array工具类中的静态方法
- 一堆零散数据:```public static<T> Stream<T> of(T...values)```:Stream接口中的静态方法
2. 利用Stream流中的Api进行各种操作

### Stream流中间方法
- ```Stream<T> filter(Predicate<? super T> predicate)```:过滤
- ```Stream<T> limit(long maxSize)```:获取前几个元素
- ```Stream<T> skip(long n)```: 跳过前几个元素
- ```Stream<T> distinct()```:元素去重,依赖(HashCode和equals方法)
- ```static<T> Stream<T> concat(Stream a, Stream b)```:合并a和b两个流为一个流
- ```Stream<R> map(Function<T, R> mapper)```:转换流中的数据类型

### Stream流的终结方法
- ```void forEach(Consumer action)```:遍历
- ```long count()```:统计
- ```toArray()```:收集流中的数据,放到数组中
- ```collect(Collector collector)```:收集流的数据,放入集合中