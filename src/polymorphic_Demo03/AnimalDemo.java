package polymorphic_Demo03;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();

        Cat c = new Cat();
        ao.useAnimal(c);

        Dog d =  new Dog();
        ao.useAnimal(d);
    }
}
