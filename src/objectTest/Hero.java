package objectTest;

import java.util.Random;

public class Hero {
//    名称
    private String name;
//    血量
    private int bloodVolume;
    //    性别
    private char six;
    //    长相
    private String face;
    private String[] boyFaces = {"风流俊雅", "幽默风趣", "相貌堂堂"};
    private String[] girlFaces = {"沉鱼落雁", "亭亭玉立", "身材姣好"};
    private String[] fightsDesc = {
            "%s使出了一招背心钉,一掌向%s的脑瓜子拍去,",
            "%s使出了一招游龙探步,晃的%s摔了一跤,",
            "%s使出了一招雷心掌,打的%s找不着北,"
    };
    private String[] injDesc = {
            "结果%s退了半步,毫发无损,",
            "%s吓的不行,",
            "%s痛死了,",
    };


    public Hero() {
    }

    public Hero(String name, int bloodVolume, char six) {
        this.name = name;
        this.bloodVolume = bloodVolume;
        this.six = six;
//        随机长相
        setFace(six);
    }

    public char getSix() {
        return six;
    }

    public void setSix(char six) {
        this.six = six;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char face) {
        Random r = new Random();

        if(six == '男') {
            int index = r.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        }else if(six == '女')  {
            int index = r.nextInt(girlFaces.length);
            this.face = girlFaces[index];
        } else {
            this.face = "面目狰狞";
        }
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return bloodVolume
     */
    public int getBloodVolume() {
        return bloodVolume;
    }

    /**
     * 设置
     * @param bloodVolume
     */
    public void setBloodVolume(int bloodVolume) {
        this.bloodVolume = bloodVolume;
    }
    public void fight(Hero hero) {
        Random r = new Random();
//        输出攻击效果
        int index = r.nextInt(fightsDesc.length);
        String kungFu = fightsDesc[index];
        System.out.printf(kungFu, this.getName(), hero.getName());
//        计算造成的伤害
        int harmNum = r.nextInt(20) + 1;
        int remainNum = hero.getBloodVolume() - harmNum;
        System.out.printf("造成了" + hero.getName() + harmNum + "点血量,");
//        对挨揍的人剩余血量做判断
        remainNum = remainNum < 0 ? 0 : remainNum;
//        修改挨揍的人的血量
        hero.setBloodVolume(remainNum);
        if(remainNum > 70) {
            System.out.printf(injDesc[0], hero.getName());
        } else if (remainNum == 0) {
            System.out.printf(injDesc[2], hero.getName());
        } else {
            System.out.printf(injDesc[1], hero.getName());
        }
        System.out.printf("还剩" + hero.getBloodVolume() + "点血量。");
        System.out.println();

    }
    public void showHeroInfo() {
        System.out.println("姓名为:" + getName());
        System.out.println("血量为:" + getBloodVolume());
        System.out.println("性别为:" + getSix());
        System.out.println("性格为:" + getFace());
    }

    public String toString() {
        return "Hero{name = " + name + ", bloodVolume = " + bloodVolume + "}";
    }
}
