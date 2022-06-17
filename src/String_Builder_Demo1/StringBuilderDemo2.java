package String_Builder_Demo1;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        StringBuilder sb2 = sb.append("hello");

        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        System.out.println(sb == sb2);

        sb.append("hello").append("world").append("java").append(100);

        System.out.println("sb:" + sb);

        sb.reverse(); //StringBuilder对象反转方法
        System.out.println("sb:" + sb);

    }
}
