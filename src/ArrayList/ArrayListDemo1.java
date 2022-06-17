package ArrayList;

import java.util.ArrayList;

/*
 *       ArrayList()  //创建一个空的集合对象
 *       boolean add(E e)  //将指定的元素追加次集合的末尾
 *       add(int index,E element)  在此集合中的指定位置插入的元素
 *
 *     报错：IndexOutofBoundsException  数组的索引越界
 * */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //public ArrayList()  创建一个空集合对象
        //ArrayList<String> array = new ArrayList();

        ArrayList<String> array = new ArrayList<String>();

        /*System.out.println(array.add("hello"));*/


        array.add("hello");
        array.add("worid");
        array.add("java");

        array.add(1, "javase");
        array.add(3, "javaee");
        array.add(4, "javasse");
        //array.add(放入集合索引, 放入你要修改的值);

        System.out.println("array:" + array);
    }
}