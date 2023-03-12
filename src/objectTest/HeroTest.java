package objectTest;

import java.util.Random;
import java.util.Scanner;

public class HeroTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个游戏角色名称:");
        String heroName = sc.nextLine();
        Random r = new Random();
        int heroNum = r.nextInt(20) + 80;
        Hero hero1 = new Hero(heroName, heroNum, '男');
        hero1.showHeroInfo();
        System.out.println("请输入第二个游戏角色名称:");
        String heroName2 = sc.nextLine();
        int heroNum2 = r.nextInt(20) + 80;
        Hero hero2 = new Hero(heroName2, heroNum2, '女');
        hero2.showHeroInfo();

//        回合制游戏
        while (true) {
            hero1.fight(hero2);
            if(hero2.getBloodVolume() == 0) {
                System.out.println("游戏结束," + hero1.getName() + "胜利!");
                break;
            }
            hero2.fight(hero1);
            if(hero1.getBloodVolume() == 0) {
                System.out.println("游戏结束," + hero2.getName() + "胜利!");
                break;
            }
        }
    }
}
