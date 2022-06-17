package FormalParameterAndReturn_Demo07;

public class Outer {

    public void method() {
        /*new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };*/

       /* new Inter() {  单次调用
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();*/

        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();
        i.show();
        i.show();


    }

}
