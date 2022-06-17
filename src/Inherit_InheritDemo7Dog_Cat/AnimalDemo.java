package Inherit_InheritDemo7Dog_Cat;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.catPizza();

        Cat c2 = new Cat("加菲猫",5);
        System.out.println(c2.getName() + "," + c2.getAge());
        c2.catPizza();

        Dog d1 = new Dog();
        d1.setName("哈巴");
        d1.setAge(7);
        System.out.println(d1.getName() + "," + d1.getAge());
        d1.lookDog();

        Dog d2 = new Dog("哈巴",7);
        System.out.println(d2.getName() + "," + d2.getAge());
        d2.lookDog();
    }
}
