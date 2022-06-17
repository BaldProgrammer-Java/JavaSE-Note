package Inherit_InheritDemo7Dog_Cat;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catPizza() {
        System.out.println("吃披萨");
    }
}
