package cn.itheima.day04.demo05;

public class Demo05Person {
    public static void main(String[] args) {
        Person person=new Person();
        person.show();
        System.out.println("======================");
        /*
        person.name="Tom";
        //一旦把成员变量加上private后下面两行会报错，成员变量的访问性变成了类内可访问，解决办法如下
        person.age=15;*/
        person.name="Tom";
        person.setAge(180);
        person.show();
        System.out.println(person.getAge());
    }
}
