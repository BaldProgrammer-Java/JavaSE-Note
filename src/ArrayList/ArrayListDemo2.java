package ArrayList;

import java.util.ArrayList;
/*
*      创建集合
*      添加集合元素
*      输出集合
*
*      array.remove()  删除集合元素
* */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        array.remove("hello");
        System.out.println(array);
    }
}
