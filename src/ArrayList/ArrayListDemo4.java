package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("张博文", 15);
        Student s2 = new Student("小猪猪", 3);

        array.add(s1);
        array.add(s2);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
