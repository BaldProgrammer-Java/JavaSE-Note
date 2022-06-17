package Port_StudentAndTeacher;

public class Culture_teacher extends Teacher{
    public Culture_teacher() {
    }

    public Culture_teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("文化课老师吃面条");
    }

    @Override
    public void teach() {
        System.out.println("教文化课");
    }
}
