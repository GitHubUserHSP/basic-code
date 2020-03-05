package cn.itheima.demo04Map.MethodRegerence;
//定义一个打印的函数式接口
@FunctionalInterface
public interface Printable {
    //定义字符串抽象方法
    abstract void print(String s);//abstract可以省略
}
