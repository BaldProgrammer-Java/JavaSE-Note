package Student_System_StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Muen();
    }

    public static void Muen() {

        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.print("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();


            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    findAIIStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0);  //JVM退出
            }
        }
    }

    /*public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入学生学号：");
        String sid = sc.nextLine();
        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.print("请输入学生居住地：");
        String address = sc.nextLine();


        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);   //构造方法无法传参 不可传入变量address  构造方法在Student.java类里

        array.add(s);
        NullString();
        System.out.println("添加学生成功！！！");

    }*/

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {

            System.out.print("请输入学生学号：");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入!!!");
            } else {
                break;
            }
        }

        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.print("请输入学生居住地：");
        String address = sc.nextLine();


        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);   //构造方法无法传参 不可传入变量address  构造方法在Student.java类里

        array.add(s);
        NullString();
        System.out.println("添加学生成功！！！");
    }

  /*  public static void findAIIStudent(ArrayList<Student> array) {
        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t居住的");

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }*/

    public static void findAIIStudent(ArrayList<Student> array) {

        if (array.size() == 0) {
            System.out.println("你没有输入信息，请先添加信息再查询！！！");
            return;
        }

        System.out.println("学号\t\t姓名\t\t\t年龄\t\t居住的");

     /*   for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }*/

        for (Student s : array) {
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

   /* public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入你要删除的学生学号：");
        String sid = sc.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
        }
        System.out.println("删除学生成功！！！");
    }*/

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入你要删除的学生的学号：");
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入！！！");
        } else {
            array.remove(index);
            System.out.println("删除学生成功！！！");
        }
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入你要修改的学生学号：");
        String sid = sc.nextLine();

        System.out.print("请输入学生新姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.print("请输入学生新居住的：");
        String address = sc.nextLine();

        Student s = new Student();

        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }
        System.out.println("修改学生成功！！！");
    }

    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;

       /* for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }*/


        for (Student s : array) {
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public static void NullString() {
        for (int i = 0; i < 20; i++) {
            System.out.println("\n");
        }
    }  //空20行

    public static void NullStings() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\n");
        }
    }  //空5行

}
