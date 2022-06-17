package String_Demo2_String;

import java.util.Scanner;

public class StringDemoTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String line = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母：" + bigCount + "个");
        System.out.println("小写字母：" + smallCount + "个");
        System.out.println("数字：" + numberCount + "个");
    }
}
