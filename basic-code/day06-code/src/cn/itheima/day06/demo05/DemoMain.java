package cn.itheima.day06.demo05;

/*匿名内部类的使用简化了步骤，当接口的实现类(或父类的子类)只使用一次时用
定义格式：
接口名 对象名=new 接口名(){
    //覆盖重写所有抽象方法
};//末尾分号不要丢
 *  */
public class DemoMain {
    public static void main(String[] args) {
        MyInterface inter=new MyInterfaceImpl();
        inter.method();
        System.out.println("==============");
        MyInterface some=new MyInterface(){
           public void method(){
                System.out.println("匿名内部类执行！");
            }
        };
        some.method();

    }

}
