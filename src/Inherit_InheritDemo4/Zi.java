package Inherit_InheritDemo4;

public class Zi extends Fu {

   /* @Override
    private void show() {
        System.out.println("Zi中show()方法被调用");
    }*/
    //子类不可继承父类中的私有方法
    //私用方法不能被重写(父类私有子类是不能继承的)
    //子类方法访问权限不能更低(public > 默认 > 私有)
    public void method() {
        System.out.println("Zi中method()方法被调用");
    }

}
