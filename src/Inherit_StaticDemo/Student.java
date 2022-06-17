package Inherit_StaticDemo;
/*
* 静态成员方法只能访问静态成员
* */
public class Student {
    private String name = "张博文";

    private static String university = "南方IT学院";

    public void show1() {

    }

    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    public static void show3() {

    }

    public static void show4() {
        //System.out.println(name);
        System.out.println(university);
        //show1();
        show3();
    }


}
