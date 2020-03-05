package cn.itheima.demo03.VarArgs;
/*可变参数的使用是类型确定 个数不确定情况，JDK1.5之后新特性
格式：
修饰符 返回值类型 方法名(数据类型... 变量名){}
查看底层代码时可能会发现功能强大的method（Object... obj）
* */
public class DemoVarArgs {
    public static void main(String[] args) {
        System.out.println(method(2));
        int i = method(2, 3);
        System.out.println(i);
    }
    //计算(1~n)个数的和
    private static int method(int... array) {
        int sum=0;
        for (int a:array) {
            sum+=a;
        }
        return sum;
    }

}
