package Port_Demo01;
/*
* 在类中要实现接口不可使用extends
* 要用implements关键字  表示实现接口，不是引用接口
* */
public class Cat implements Jumpping{
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}
