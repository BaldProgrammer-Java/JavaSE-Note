package indexdemo;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        /*System.out.println("请输入会员卡号");
        String s = sr.nextLine();

        int temp = Integer.parseInt(s);




        System.out.println(temp);
*/

       for (;;) {
           System.out.println("请输入会员卡号");
           String s = sr.nextLine();  //用string类型接收输入的数值

           if (s.length() <= 4){      //if判断数值大小是否大于四位
               int i = Integer.parseInt(s);  //将string转型成int类型
               System.out.println(i);      //输入信息没有误，则输出数值
           } else {
               System.out.println("你输入的信息有错"); //输入信息有误，则输出反馈语句
           }
       }



    }
}
