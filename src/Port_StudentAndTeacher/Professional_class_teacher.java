package Port_StudentAndTeacher;

public class Professional_class_teacher extends Teacher implements Typing_code{
    public Professional_class_teacher() {
    }

    public Professional_class_teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("专业课老师吃饺子");
    }

    @Override
    public void teach() {
        System.out.println("教学Java编程语言");
    }

    @Override
    public void code() {
        System.out.println("专业课老师敲Java代码");
    }
}
