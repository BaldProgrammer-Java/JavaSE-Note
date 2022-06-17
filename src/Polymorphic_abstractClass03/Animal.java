package Polymorphic_abstractClass03;

public abstract class Animal {

    private int age = 20;
    private final String city = "珠海";

    public Animal(){}

    public Animal (int age) {
        this.age = age;
    }

    public void show() {
        age = 40;
        System.out.println(age);
        System.out.println(city);
    }

    public abstract void eat();
}
