package Class_object_learn;

public class phoneDemo {
    public static void main(String[] args) {
        phone p = new phone();

        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "小米";
        p.price = 2999;

        System.out.println(p.brand);
        System.out.println(p.price);


        p.call();
        p.sendMessage();
    }
}
