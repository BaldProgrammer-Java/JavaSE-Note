package packaging_Demo3;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("张博文");
        s2.show();

        Student s3 = new Student(15);
        s3.show();

        Student s4 = new Student("张博文", 15);
        s4.show();
    }
}
