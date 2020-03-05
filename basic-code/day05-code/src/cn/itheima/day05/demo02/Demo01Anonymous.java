package cn.itheima.day05.demo02;
/*对象创建的格式 类名 对象名=new 类名();
匿名对象(没有对象名)    new 类名();
匿名对象使用注意事项：
1.匿名对象只能使用唯一的一次，下次会在堆里重新创建
2.如果确定只使用一次，可以省事不命名直接使用
* */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person peo=new Person();
        peo.name="王五";
        peo.showName();

        new Person().name="赵四";
        new Person().showName();

    }
}
