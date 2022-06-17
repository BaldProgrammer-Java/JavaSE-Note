package FormalParameterAndReturn_Demo02;
/*
*抽象类名作为形参和返回值
*  方法的形参是抽象类名，其实需要的是该抽象类的子类对象
*  方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
* */
public class AnimalOperator {

    public void useAnimal(Animal a) { //Animal a = new Cat();
        a.eat();
    }

    public Animal getAnimal() {
        Animal a = new Cat();
        return a;
    }
}
