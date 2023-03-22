package api.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<PersianCat> list1 = new ArrayList();
        ArrayList<LiHuaCat> list2 = new ArrayList();
        ArrayList<TeddyDog> list3 = new ArrayList();
        ArrayList<HuskyDog> list4 = new ArrayList();
        KeepKet(list1);
        KeepKet(list2);
        KeepDog(list3);
        KeepDog(list4);
    }
    public static void KeepKet(ArrayList<? extends Cat> list) {

    }
    public static void KeepDog(ArrayList<? extends Dog> list) {

    }
}
