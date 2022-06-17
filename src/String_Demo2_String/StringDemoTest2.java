package String_Demo2_String;

import java.util.Scanner;

/*
 * 字符串遍历
 * */
public class StringDemoTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String line = sc.nextLine();

        /*System.out.println(line.charAt(0));
        System.out.println(line.charAt(1));
        System.out.println(line.charAt(2));*/

        /*for (int i = 0; i < 3; i++) {
            System.out.println(line.charAt(i));
        }*/

        /*System.out.println(line.length());*/

        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
