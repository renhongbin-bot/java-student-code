package error;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        String time = "2031年1月1日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//        编译时异常,必须手动处理异常,否则代码报错
        Date date = simpleDateFormat.parse(time);// ParseException
        System.out.println(date);

//        运行时异常
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
    }
}
