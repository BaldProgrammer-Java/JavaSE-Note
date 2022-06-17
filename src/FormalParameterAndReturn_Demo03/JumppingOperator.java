package FormalParameterAndReturn_Demo03;
/*
*接口名作为形参和返回值
*  方法的形参是接口名，其实需要的是该接口的实现类对象
*  方法的返回值是接口名，其实返回的是该接口的实现类对象
* */
public class JumppingOperator {

    public void usejumpping(Jumpping j) {
        j.jump();
    }

    public Jumpping getjumpping() {
        Jumpping j = new Cat();
        return j;
    }

}
