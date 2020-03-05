package cn.itheima.demo02Properties.PlayPoker;

import java.util.HashSet;
/*HashSet存储自定义元素
Set集合保证元素唯一：必须重写hasCode和equals方法    //见person类重写方法
要求：保证同名字年龄的人是同一个人
* */
public class Demo02HashSet {
    public static void main(String[] args) {
        HashSet<Person> set=new HashSet<>();
        Person pe1=new Person("张三",18);
        Person pe2=new Person("张三",18);
        Person pe3=new Person("张三",19);

        set.add(pe1);
        set.add(pe2);
        set.add(pe3);

        System.out.println(pe2.equals(pe1));
        System.out.println(pe1==pe2);

        System.out.println(set);

    }
}
