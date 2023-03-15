package object.advanced.advance05;

public class CatTest {
    public static void main(String[] args) {
        Ragdoll rd = new Ragdoll();
        LiHua lh = new LiHua();
        Husky hs = new Husky();
        Teddy td = new Teddy();
        String eat = rd.eat();
        String drink = rd.drink();
        String catchM = rd.catchMouse();
        String look = hs.lookHome();
        String breakHome = hs.breakHome();
        String touch = td.touch();
        System.out.println("布偶猫:" + eat + "、" + drink + "、" + catchM);
        System.out.println("中国狸花猫:" + eat + "、" + drink + "、" + catchM);
        System.out.println("哈士奇:" + eat + "、" + drink + "、" + look + "、" + breakHome);
        System.out.println("泰迪:" + eat + "、" + drink + "、" + look + "、" + touch );
    }
}
