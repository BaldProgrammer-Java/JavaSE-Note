package Packaging_Demo2_this;

/*
 *this关键字
 *   this修饰的变量用于指代成员变量
 *       方法的形参如果与成员变量同名，不带this修饰的变量指的是形参，而不是成员变量
 *       方法的形参没有与成员变量同名，不带this修饰的变量指的是成员变量
 *    什么时候使用this呢？
 *       解决局部变量隐藏成员变量
 * this:代表所在类的对象引用
 *    记住：方法被哪个对象调用，this 就代表哪个对象
 * */
public class Student {
    private String name;
    private int age;

  /* public void setName(String n) {
       name = n;
   }*/

    public void setName(String name) {
        /*name = name;*/
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*public void setAge(int a) {
        age = a;
    }*/

    public void setAge(int age) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
