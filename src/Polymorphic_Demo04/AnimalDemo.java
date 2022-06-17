package Polymorphic_Demo04;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat a = new Cat(); //向上转型
        a.eat();

        /*Cat c = new Cat(); //创建本身对象

        c.playGame();*/

        Cat c = a;

        c.playGame();

    }

}
