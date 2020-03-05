package cn.itheima.day06.demo03;

/*final关键字可修饰类、方法、成员变量、局部变量 最终的、不能改变
被修饰的方法不能被覆盖重写，所以不能和abstract同用
* */

public class Demo01Final {


    public static void main(String[] args) {
        //    final修饰 对于基本数据类型不能改变，但是对于引用类型，地址不可改变，地址中的内容可变
        final Person person=new Person("张三");
        System.out.println(person.getName());
//        Person person=new Person("李四");//不可变

        person.setName("李四");
        System.out.println(person.getName());



    }
    public final void method(){
        final int a=20;
//        a=30;  //错误，不能改变
    }
    public void method(int a){

        final int b;
        b=10;

    }





}
