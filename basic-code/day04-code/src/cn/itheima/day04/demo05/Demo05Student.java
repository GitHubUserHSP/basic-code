package cn.itheima.day04.demo05;

public class Demo05Student {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("张三");
        stu.setAge(20);
        stu.setMale(true);
        System.out.println("名字是:"+stu.getName());
        System.out.println("年龄是:"+stu.getAge());
        System.out.println("性别是不是男的:"+stu.isMale());
    }
}
