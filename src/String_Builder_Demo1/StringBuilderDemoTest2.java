package String_Builder_Demo1;

import java.util.Scanner;

public class StringBuilderDemoTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个字符串:");
        String line = sc.nextLine();

        String s = myReverse(line);

        System.out.println("s:" + s);
    }

    public static String myReverse(String s) {
        /*StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();

        return ss;*/

        return new StringBuilder(s).reverse().toString();
    }

}
