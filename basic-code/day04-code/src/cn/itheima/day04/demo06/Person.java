package cn.itheima.day04.demo06;
/*当成员变量和局部变量重名时，根据就近原则优先使用局部变量
如果需要访问本类中的成员变量 使用this.成员变量名  即可
“通过谁调用的方法，谁就是this”*/
public class Person {
    String name;

    public void sayHello(String name){

        System.out.println(name+"你好，我是："+this.name);
    }
}
