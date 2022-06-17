package Inherit_InheritDemo3;

/*
 * 测试类
 * */
public class phoneDemo {
    public static void main(String[] args) {
        phone p = new phone();

        p.call("张博文");

        System.out.println("------------");

        Newphone np = new Newphone();
        np.call("韦俊豪");
    }
}
