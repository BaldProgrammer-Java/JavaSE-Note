package Inherit_InheritDemo6_2;

public class PersonDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("张博文");
        t1.setAge(16);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("韦俊豪",17);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();

        Student s1 = new Student();
        s1.setName("曾洁丽");
        s1.setAge(40);
        System.out.println(s1.getName() + "," + s1.getAge());
        s1.stu();

        Student s2 = new Student("曾洁丽",40);
        System.out.println(s1.getName() + "," + s1.getAge());
        s2.stu();
    }
}
