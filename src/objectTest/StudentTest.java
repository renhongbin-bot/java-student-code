package objectTest;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student(1, "张三", 18);
        Student s2 = new Student(2, "李四", 20);
//        Student s3 = new Student(3, "王五", 23);
        arr[0] = s1;
        arr[1] = s2;
//        arr[2] = s3;
        Student s4 = new Student(4, "赵六", 26);
//        把s4添加到数组中
//        1.如果数组已经存满 ---只能创建一个新的数组,新数组长度的旧数组长度 + 1
//        2.没有存满,直接添加
//        唯一性判断
//        已存在,不添加, 不存在才把学生添加到对象
        boolean flag = contains(arr, s4.getId());
        if(flag) {
//            已存在不用添加
            System.out.println("当前ID重复,请修改ID后添加");
        } else {
//            不存在添加数组
            int count = getCount(arr);
            if(count == arr.length) {
//                已经存满
                Student[] newArr = createNewArr(arr);
//                把S4添加进去
                newArr[count] = s4;
//                添加完毕后，便利所有学生信息
                printArr(newArr);
            } else {
//                没有存满
                arr[count] = s4;
                printArr(arr);
            }
        }


    }
//创建一个新数组 长度 = 老数组的长度 + 1
//    然后将;老数组拷贝到新数组中
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(arr[i] != null) {
                System.out.println(stu.getId() + " , " + stu.getName() + ", " + stu.getAge());
            }
        }
    }
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
//        把新数组返回
        return newArr;
    }
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
//            依次获取学生对象
            Student stu = arr[i];
            if(stu != null) {
                //           获取数组中学生对象的ID
                int sid = stu.getId();
                if(sid == id) {
                    return true;
                }
            }

        }
        return false;
    }
//    轻易方法判断数组已经存了几个元素
    public static int getCount(Student[] arr) {
//        定义一个计数器用来统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                count ++;
            }
        }
        return count;
    }
}
