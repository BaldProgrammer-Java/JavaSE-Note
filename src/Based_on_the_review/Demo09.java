package Based_on_the_review;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);

       /* System.out.println("请输入第一个评委的打分：");
        arr[0] = sc.nextInt();

        System.out.println("请输入第二个评委的打分：");
        arr[1] = sc.nextInt();*/

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            arr[i] = sc.nextInt();
        }
        /*printArray(arr);*/

        int max = getMax(arr);

        int min = getMin(arr);

        int Sum = getSum(arr);

        int avg = (Sum - max - min) / arr.length - 2;

        System.out.println("选手的最终得分是：" + avg);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
