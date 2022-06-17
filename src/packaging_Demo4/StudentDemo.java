package packaging_Demo4;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张博文");
        s1.setAge(15);
        s1.show();

        Student s2 = new Student("张博文", 15);
        s2.show();
    }
}
