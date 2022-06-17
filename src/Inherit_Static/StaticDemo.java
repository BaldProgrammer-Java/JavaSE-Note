package Inherit_Static;

public class StaticDemo {
    public static void main(String[] args) {
        Student.university = "南方IT学院";

        Student s1 = new Student();

        s1.name = "张博文";
        s1.age = 16;
        /*s1.university = "南方IT学院";*/
        s1.show();

        Student s2 = new Student();
        s2.name = "韦俊豪";
        s2.age = 17;
       /* s2.university = "南方IT学院";*/
        s2.show();

        Student s3 = new Student();
        s3.name = "王梓源";
        s3.age = 15;

        s3.show();
    }
}
