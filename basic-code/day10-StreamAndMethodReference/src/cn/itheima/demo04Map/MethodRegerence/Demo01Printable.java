package cn.itheima.demo04Map.MethodRegerence;

public class Demo01Printable {
    //类中定义一个方法，参数传递Printable接口，对字符串打印
    public static void printString(Printable p) {//只打印无需返回值
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        //调用printString方法，方法参数是Printable是一个函数式接口，所以可传递lambda
        printString((s)->{//print方法的参数是一个字符串，方法目的打印这个串
            System.out.println(s);});
        /*lambda表达式目的是打印参数传递的字符串
        把参数s传递给System.out对象，调用out对象中的println方法对字符串输出
        注意：1.System.out对象已经存在
            2.println方法也存在
            此时可以用System.out对象直接引用（调用）println方法
        * */
        printString(System.out::println);//参数s可以省略//lambda中传递的参数一定是方法引用中可以接受的类型，否则会抛异常
    }
}
