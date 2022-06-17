package Packaging_Demo1_private;

/*
 * 学生测试类
 *
 * private关键字
 *   是一个权限修饰符
 *   可以修饰成员（成员变量和成员方法）
 *   作用是保护成员不被其他类使用，被private修饰的成员只在本类中才能访问
 *
 * 针对private修饰的成员变量，如果需要被其他类使用，提供相应的操作
 *    提供“get变量名（）”方法，用于获取成员变量的值，方法用public修饰
 *    提供“set变量名（参数）”方法，用于设置成员变量的值，方法用public修饰
 * */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //给成员变量赋值
        s.name = "张博文";
        /*s.age = 15;*/
        /*s.age = -15;*/

        s.setAge(15);

        //调用show方法
        s.show();
    }
}
