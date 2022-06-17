package Class_object_learn;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.name + "," + s.age);

        s.name = "张博文";
        s.age = 15;

        System.out.println(s.name + "," + s.age);

        s.study();
        s.doHomework();
    }
}
