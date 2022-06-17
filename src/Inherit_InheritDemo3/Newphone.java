package Inherit_InheritDemo3;

/*
 * 新手机类
 * */
public class Newphone extends phone {
   /* public void call(String name) {
        System.out.println("开启视频功能");
        //System.out.println("给" + name + "打电话");
        super.call(name);
    }*/

    @Override //检查方法声明的正确性
    public void call(String name) {
        System.out.println("开启视频功能");
        //System.out.println("给" + name + "打电话");
        super.call(name);
    }
}
