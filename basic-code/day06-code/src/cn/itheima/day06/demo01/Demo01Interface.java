package cn.itheima.day06.demo01;

/*接口使用步骤
1.接口不能直接使用，需要一个“实现类”来“实现”该接口
格式  public class 实现类名 implement 接口名称{
    //.....
}
2.接口中的实现类必须覆盖重写(实现)接口中所有的抽象方法
实现：去掉abstract 加上方法体花括号
3.创建实现类的对象，进行使用
* */

public class Demo01Interface {
    public static void main(String[] args) {
        //不能直接new接口对象使用 要使用实现类
        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();
        impl.MethodAbs1();
    }
}
