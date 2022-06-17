package Based_on_the_review;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.println("第二十个月兔子对数是：" + arr[19]);
    }
}
