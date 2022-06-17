package Inherit_InheritDemo1;

/*
 *      继承中变量的访问特定
 *       在子类方法中访问一个变量
 *           子类范围找
 *           子类成员范围找
 *           父类范围类找
 *           如果都没有就会报错（不考虑父类的父类...）
 * */
public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}
