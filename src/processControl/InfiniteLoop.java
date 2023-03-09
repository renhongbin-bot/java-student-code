package processControl;

public class InfiniteLoop {
    public static void main(String[] args) {
//        for无限循环
//        for (int a = 1; a <= 100; a++) {
//            if(a == 3) {
//                continue;
//            }
//            System.out.println("小老虎吃第"+ a + "个包子");
//        }
        for (int a = 1; a <= 100; a++) {
            System.out.println("小老虎吃第"+ a + "个包子");
            if(a == 3) {
                break;
            }
        }
//        while(true) {
//            System.out.println("学习");
//        }
    }
    //        无限循环下面不能再写代码,因为循环永远停不下来
}
