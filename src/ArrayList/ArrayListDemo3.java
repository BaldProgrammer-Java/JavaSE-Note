package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("张博文");
        array.add("憨憨");
        array.add("大傻子");

       /* System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));*/

       /* for (int i = 0; i < 3; i++) {
            System.out.println(array.get(i));
        }*/

        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);  //定义为变量可进行其他操作
            System.out.println(s);
        }
    }
}
