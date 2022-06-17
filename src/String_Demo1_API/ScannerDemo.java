package String_Demo1_API;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个字符串数据：");
        String line = sc.nextLine();

        System.out.println("你输入的数据是：" + line);
    }
}
