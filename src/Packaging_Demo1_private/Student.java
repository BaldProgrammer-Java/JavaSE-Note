package Packaging_Demo1_private;

/*
 * 学生类
 * */
public class Student {
    //成员变量
    String name;
    /*int age;*/

    private int age;

    public void setAge(int a) {
        /* age = a;*/
        if (a < 0 || a > 120) {
            System.out.println("你年龄有误");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
