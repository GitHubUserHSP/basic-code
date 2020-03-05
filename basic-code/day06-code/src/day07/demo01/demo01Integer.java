package day07.demo01;
/*包装类的自动拆装箱
构造方法
静态方法
成员方法
* */
public class demo01Integer {
    public static void main(String[] args) {
//        装箱：把基本数据类型包装到包装类中(基本数据类型->包装类)
        //构造方法
        Integer in1 = new Integer(1);
        System.out.println(in1);

        Integer in2 = Integer.valueOf(1);
        System.out.println(in2);
//        拆箱：在包装类中取出基本数据类型(包装类->基本数据类型)
        int intt=in1.intValue();
        System.out.println(intt);
        //JDK1.5之后 自动拆装箱的新特性
        /*
        ...

        * */
        int it=in1+1;
        Integer it2 = in1 + 2;


    }
}
