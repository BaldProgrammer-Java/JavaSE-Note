package ObjectClass_equals;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张博文");
        s1.setAge(15);
        //System.out.println(s1);

        Student s2 = new Student();
        s2.setName("张博文");
        s2.setAge(15);
        //System.out.println(s2);

        System.out.println(s1.equals(s2));
    }
}
