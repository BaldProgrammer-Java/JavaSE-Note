package Polymorphic_Demo05;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲猫",5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
    }
}
