package Polymorphic_Demo02;
/*
* 多态中成员访问特点
*   成员变量：编译看左边，运行看左边
*   成员方法：编译看左边，运行看右边
*
*   为什么成员变量和成员方法的访问不一样呢？
*       因为成员方法有重写，而成员变量没有
*
* */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();

        System.out.println(a.age);
        //System.out.println(a.weight);

        a.eat();
    }
}
