package Port_Demo02;
/*
* 成员变量
* 只能是常量
* 默认修饰符：public static final
*
* 构造方法
* 接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在
* 一个类如果没有父类，默认继承自Object类
*
* 成员方法
* 只能是抽象方法
* 默认修饰符：public abstract
* */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        System.out.println(i.num);
        System.out.println(i.num2);
    }
}
