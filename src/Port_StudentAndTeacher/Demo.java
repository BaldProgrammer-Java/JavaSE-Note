package Port_StudentAndTeacher;

public class Demo {
    public static void main(String[] args) {
        Primary_school_students pss = new Primary_school_students();
        pss.setName("张博文");
        pss.setAge(10);
        System.out.println("姓名：" + pss.getName() + "," + "年龄：" + pss.getAge());
        pss.eat();
        pss.study();
        pss.homework();

        System.out.println("-------------------");

        College_Students sst = new College_Students();
        sst.setName("韦俊豪");
        sst.setAge(18);
        System.out.println("姓名：" + sst.getName() + "," + "年龄：" + sst.getAge());
        sst.eat();
        sst.study();
        sst.code();
    }
}
