package Inherit_Static;

public class Student {

    public String name;
    public int age;
    /*public String university;*/
    public static String university;

    public void show() {
        System.out.println("姓名:" + name + "," + "年龄:" + age + "," + "毕业于:" + university);
    }
}
