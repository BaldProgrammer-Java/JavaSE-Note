package Based_on_the_review;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要查找的数据：");
        int number = sc.nextInt();

        int index = getIndex(arr,number);
        System.out.println("index:" + index);
    }

    public static int getIndex(int[] arr, int number){
        int index = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }
}
