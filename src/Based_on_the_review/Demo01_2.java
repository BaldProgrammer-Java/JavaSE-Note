package Based_on_the_review;

import java.util.Scanner;

public class Demo01_2 {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入一个星期数：");
            int week = sc.nextInt();

            switch (week) {
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("慢走");
                    break;
                case 4:
                    System.out.println("动感单车");
                    break;
                case 5:
                    System.out.println("拳击");
                    break;
                case 6:
                    System.out.println("爬山");
                    break;
                case 7:
                    System.out.println("吃顿好的");
                    break;
                default:
                    System.out.println("你的输入有误！！！");
            }
        }
    }
}
