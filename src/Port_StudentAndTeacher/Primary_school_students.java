package Port_StudentAndTeacher;

public class Primary_school_students extends Student implements Homework{
    public Primary_school_students() {
    }

    public Primary_school_students(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("小学生吃米饭");
    }

    @Override
    public void study() {
        System.out.println("小学生学习文化课");
    }

    @Override
    public void homework() {
        System.out.println("小学生要写作业");
    }
}
