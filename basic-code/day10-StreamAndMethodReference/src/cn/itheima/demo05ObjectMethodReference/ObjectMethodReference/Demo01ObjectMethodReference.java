package cn.itheima.demo05ObjectMethodReference.ObjectMethodReference;
/*通过对象名引用成员方法
使用前提是对象名是已经存在的，成员方法也存在
就可以使用对象名来引用成员方法
* */
public class Demo01ObjectMethodReference {
    //定义一个方法，方法的参数传递Printable接口
    public static void printString(Printable p) {
        p.print("Hello");
    }

    public static void main(String[] args) {
        //调用printString方法，方法参数Printable是函数式接口，可以传递lambda表达式
        printString((s)->{
            //创建MethodRerObject对象
            MethodRerObject obj=new MethodRerObject();
            //调用MethodRerObject对象中的printUpperCaseString把字符串按大写输出
            obj.printUpperCaseString(s);
        });
        System.out.println("=====使用方法引用实现====");
        MethodRerObject obj=new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
