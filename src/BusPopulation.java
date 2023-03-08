public class BusPopulation {
    public static void main(String[] args) {
        //一开始没有乘客,定义一个变量为0
        int busPeople = 0;
        // 第一站上去一个人
        busPeople = busPeople + 1;
        //第二站上去两个人,下去一个人
        busPeople = busPeople + 2 - 1;
        // 第三站上去两个人,下来一位乘客
        busPeople = busPeople + 2 - 1;
        //第四站下来一位
        busPeople = busPeople -1;
        //第五站
        busPeople = busPeople + 1;
        System.out.println(busPeople);
    }
}
