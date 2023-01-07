package PaperScissorStone_;

import java.util.Random;
import java.util.Scanner;

public class PaperScissorStone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        int[] score = new int[2];
//        System.out.println(score[0]);
//        System.out.println(score[1]);
        System.out.println("一共进行几局（三局两胜、五局三胜...）必须是奇数");
        int bout = scanner.nextInt(); //输入总局数
        while ((score[0] + score[1]) != bout) {
            score = game.game(score);
            System.out.println("此时电脑" + score[0] + "分" + "玩家" + score[1] + "分");
            if (score[0] == (bout + 1) / 2) {
                System.out.println("电脑胜利");
            } else if (score[1] == (bout + 1) / 2) {
                System.out.println("玩家胜利");
            }
            System.out.println("===============");
        }
    }
}

class Game {
    public int[] game(int[] score) {
        Scanner scanner = new Scanner(System.in);
        int[] newscore = new int[2];
        System.out.println("你要出什么（0-拳头 1-剪刀 2-布）");
        int num = scanner.nextInt();
        if (num > 2) {
            System.out.println("输入错误");
        }
        newscore = vs(num, score);
        return newscore;
    }

    public int[] vs(int Person_num, int[] score) {
        Random rand = new Random();
        //Grade grade = new Grade();
        int Computer_num = rand.nextInt(3);
        if (Person_num == 0) {
            if (Computer_num == 0) {
                System.out.println("电脑出拳\t玩家出拳\t平局不记分");
            } else if (Computer_num == 1) {
                System.out.println("电脑出剪刀\t玩家出拳\t玩家得一分");
                score[1]++;
                //grade.grade("玩家");
            } else if (Computer_num == 2) {
                System.out.println("电脑出布\t玩家出拳\t电脑得一分");
                score[0]++;
                //grade.grade("电脑");
            }
        } else if (Person_num == 1) {
            if (Computer_num == 0) {
                System.out.println("电脑出拳\t玩家出剪刀\t电脑得一分");
                score[0]++;
                //grade.grade("电脑");
            } else if (Computer_num == 1) {
                System.out.println("电脑出剪刀\t玩家出剪刀\t平局不记分");
            } else if (Computer_num == 2) {
                System.out.println("电脑出布\t玩家出剪刀\t玩家得一分");
                score[1]++;
                //grade.grade("玩家");
            }
        } else if (Person_num == 2) {
            if (Computer_num == 0) {
                System.out.println("电脑出拳\t玩家出布\t玩家得一分");
                score[1]++;
                //grade.grade("玩家");
            } else if (Computer_num == 1) {
                System.out.println("电脑出剪刀\t玩家出布\t电脑得一分");
                score[0]++;
                //grade.grade("电脑");
            } else if (Computer_num == 2) {
                System.out.println("电脑出布\t玩家出布\t平局不记分");
            }
        }
        return score;
    }
}