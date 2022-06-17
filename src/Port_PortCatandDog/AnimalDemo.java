package Port_PortCatandDog;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();

        System.out.println("----------");

        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("************");

        Cat c = new Cat();
        c.setName("加菲猫");
        c.setAge(5);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        c.jump();

        System.out.println("&&&&&&&&&&&&&");

        Dog d = new Dog();
        d.setName("哈巴狗");
        d.setAge(3);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.jump();
    }
}
