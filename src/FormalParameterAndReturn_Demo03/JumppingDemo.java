package FormalParameterAndReturn_Demo03;

public class JumppingDemo {
    public static void main(String[] args) {

        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.usejumpping(j);

        Jumpping j2 = jo.getjumpping();
        j2.jump();

    }
}
