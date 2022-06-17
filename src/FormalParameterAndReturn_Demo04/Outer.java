package FormalParameterAndReturn_Demo04;
/*
* 内部类概述
*  内部类：就是在一个类中定义一个类
*
* 内部类的访问特点
*  内部类可以直接访问外部类的成员，包括私有
*  外部类要访问内部类成员，必须创建对象
* */
public class Outer {

    private int num = 10;

    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }


}

