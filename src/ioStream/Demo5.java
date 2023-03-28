package ioStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我的天哪";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes)); //[-26, -120, -111, -25, -102, -124, -27, -92, -87, -27, -109, -86]
        byte[] bytes1 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1)); // [-50, -46, -75, -60, -52, -20, -60, -60]
//        解码
        String str2 = new String(bytes);
        System.out.println(str2);//我的天哪
        String str3 = new String(bytes1, "GBK");
        System.out.println(str3);//我的天哪
    }
}
