package Port_Demo01;
/*
* 接口实例化
* 参照多态的方式，通过实现类对象实例化，这叫接口多态
* 多态的形式：具体类多态，抽象类多态，接口多态
* 多态的前提：有继承或者实现关系；有方法重写；有父(类/接口)引用指向(子/实现)类对象
* 接口的实现类
* 要么重写接口中的所有抽象方法
* 要么是抽象类
* */
public  class JumppingDemo {
    public static void main(String[] args) {
        //Jumpping j = new Jumpping();

        Jumpping j = new Cat();
        j.jump();

    }
}
