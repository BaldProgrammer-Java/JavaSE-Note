package Polymorphic_abstractClass02;

public class AnimalDemo {
    public static void main(String[] args) {
        //抽象类会参照多态形式创建对象

        Animal a = new Cat();
        a.eat();
        a.sleep();
    }
}
