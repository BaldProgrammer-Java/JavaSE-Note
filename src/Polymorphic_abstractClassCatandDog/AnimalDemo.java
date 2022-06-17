package Polymorphic_abstractClassCatandDog;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("--------------");

        a = new Cat("加菲猫",5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("****************");

        Animal d = new Dog();
        d.setName("哈巴狗");
        d.setAge(3);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();

        System.out.println("--------------");

        d = new Dog("哈巴狗",3);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
    }
}
