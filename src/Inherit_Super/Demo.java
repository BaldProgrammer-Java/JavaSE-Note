package Inherit_Super;
/*
*   对于需要访问本类的成员变量age时  可通过this关键字指向
*   对于需要访问父类的成员变量age时  可通过super关键字指向
* */
public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}
