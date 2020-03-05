package cn.itheima.day04.demo07;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("张三");
        stu.setAge(20);
        System.out.println("名字是："+stu.getName()+",年龄是："+stu.getAge());
        System.out.println("=====================");
        Student stu1=new Student("李四",18);
        System.out.println("名字是："+stu1.getName()+",年龄是："+stu1.getAge());
        System.out.println("=====================");
        //通过带参构造函数可以省事先不写setter()和getter()方法,要做修改还得靠setter()方法
        stu1.setAge(15);
        System.out.println("名字是："+stu1.getName()+",年龄是："+stu1.getAge());

    }

}
