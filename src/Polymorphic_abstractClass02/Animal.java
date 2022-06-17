package Polymorphic_abstractClass02;
/*
* 抽象类与抽象方法
* 都采用abstract关键字声明
*
* 抽象类里面可以没有抽象方法，但抽象方法必须放在抽象类里面
* */
public abstract class Animal {

    public abstract void eat();

    public void sleep() {
        System.out.println("睡觉");
    }
}
