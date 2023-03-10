package array;

public class ArrayDynamic {
    public static void main(String[] args) {
        /**
         * 定义一个数组,用来存储班级50个学生的姓名
         * 姓名未知,等学生报道后,再进行添加
         * */
//        动态创建
        String[] studentArr = new String[50];

//        添加学生
        studentArr[0] = "张三";
        studentArr[1] = "李四";
//        获取
        System.out.println(studentArr[0]);//张三
        System.out.println(studentArr[1]);//李四
        System.out.println(studentArr[1]);//null
//        数组默认初始化规律
//        整数类型:默认初始值0
//        浮点类型:默认初始值0.0
//        字符类型:默认初始值'\u0000' 显示为一个空格
//        布尔类型:默认初始值false
//        引用数据类型:默认初始值null
    }
}
