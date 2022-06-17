package FormalParameterAndReturn_Demo01;

public class CatDemo {
    public static void main(String[] args) {

        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);

        Cat cat = co.getCat();
        cat.eat();

    }
}
