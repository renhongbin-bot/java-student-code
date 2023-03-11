package test1;

import java.util.Random;
import java.util.Scanner;

public class ScoreTheCompetition {
    public static void main(String[] args) {
//        评委打分
        Scanner sc = new Scanner(System.in);
//        存储每个评委的分数
        int[] scoreArr = new int[6];
//        存储得分
        int scoreVal = 0;
        for (int i = 0; i < scoreArr.length;) {
//            6个评委打分
            int score = sc.nextInt();
//            合理区间录入数组,并且i++
            if(score >= 0 && score <= 100) {
                scoreArr[i] = score;
                System.out.println(scoreArr[i]);
                i++;
//                不合理继续打分直到打到合理区间
            } else  {
                System.out.println("录入超0~100范围,请重新录入分数, 当前录入为" + score);
            }
        }
//        得到6个评委的总分
        for (int i = 0; i < scoreArr.length; i++) {
            scoreVal += scoreArr[i];
        }
//        得到6个评委中打的最高分和最低分
        int max = scoreArr[0];
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            max =  max > scoreArr[i] ? max : scoreArr[i];
            min =  min < scoreArr[i] ? min : scoreArr[i];
        }
//        总分-最高分-最低分 / (数组长度-2)得到最终平均分
        scoreVal = (scoreVal - max - min) / (scoreArr.length - 2);
        System.out.println("最终得分" + scoreVal);
    }
}
