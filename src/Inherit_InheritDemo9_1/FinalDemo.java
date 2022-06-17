package Inherit_InheritDemo9_1;

public class FinalDemo {
    public static void main(String[] args) {
        final int age = 20;
        /*age = 100;*/
        System.out.println(age);

        final Student s = new Student();
        s.age = 100;
        System.out.println(s.age);
    }
}
