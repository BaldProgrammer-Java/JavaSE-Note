package FormalParameterAndReturn_Demo05;
/*
* 成员内部类 外界如何创建使用
*  格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
* */
public class InnerDemo {
    public static void main(String[] args) {
        /*Outer.Inner oi = new Outer().new Inner();
        oi.show();*/

        Outer o = new Outer();
        o.method();

    }
}
