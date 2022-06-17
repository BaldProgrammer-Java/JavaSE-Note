package Inherit_InheritDemo6_2;

public class Student extends Person {

    public Student() {
    }

    public Student(String name,int age) {
       super(name, age);
    }

    public void stu() {
        System.out.println("好好学习，天天向上");
    }

}
