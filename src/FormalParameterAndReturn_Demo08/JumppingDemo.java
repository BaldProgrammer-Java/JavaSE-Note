package FormalParameterAndReturn_Demo08;

public class JumppingDemo {
    public static void main(String[] args) {

        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.method(j);


        Jumpping j2 = new Dog();
        jo.method(j2);

        System.out.println("******************");

        jo.method(new Jumpping(){
            @Override
            public void jump() {
                System.out.println("牛可以跳高了");
            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("张博文可以干饭了");
            }
        });

    }
}
