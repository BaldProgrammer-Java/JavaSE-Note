package Port_StudentAndTeacher;

public class College_Students extends Student implements Typing_code{

    public College_Students() {
    }

    public College_Students(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("大学生吃炒饭");
    }

    @Override
    public void study() {
        System.out.println("大学生要学专业课");
    }

    @Override
    public void code() {
        System.out.println("大学生要敲Java代码");
    }
}
