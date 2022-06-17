package String_Builder_Demo1;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

       /* String s = sb.toString();
        System.out.println(s);*/

        String s = "hello";

        StringBuilder sb2 = new StringBuilder(s);

        System.out.println(sb2);
    }
}
