package String_Builder_Demo1;

/*
 *  public StringBuilder:
 *           append(任意类型)  添加数据，并返回对象本身
 *           reverse()       返回相反的字符序列
 *           toString()     t通过toString()就可以实现把StringBuilder转换为String
 * */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length()" + sb.length());


        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2" + sb2);
        System.out.println("sb2.length()" + sb2.length());
    }
}
