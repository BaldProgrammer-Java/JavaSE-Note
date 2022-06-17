package ObjectClass_Object;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张博文");
        s.setAge(15);
        System.out.println(s);

       /* public void println (Object x){
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }*/

       /* public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }*/

       /* public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }*/

    }
}
