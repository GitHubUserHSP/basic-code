package cn.itheima.day06.demo04;
/*如何使用内部成员类？两种方法
1.间接方法：在外部类方法中使用内部类的方法，然后再main中调用外部类方法
2.直接方法：格式
外部类名称.内部类名称 对象名=new 外部类名称().new 内部类名称();
* */
public class Demo04InternalClass{
    public static void main(String[] args) {
        Body body=new Body();
        body.methodBody();
        System.out.println("==================");
        Body.Heart heart=new Body().new Heart();
        heart.beat();

    }

}
