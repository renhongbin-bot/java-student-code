package object.innerClass.demo3;

public class Outer {
   private int a = 30;
    class Inner {
       private int a = 20;
       public void show() {
           int a = 10;
           System.out.println(a);// 10
           System.out.println(this.a ); //20
//          Outer.this 获取了外部类对象的地址值
           System.out.println(Outer.this.a); //30
       }
   }
}
