package Inherit_InheritDemo6_1;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        t1.setName("韦俊豪");
        t1.setAge(16);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("张博文",15);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();
    }
}
