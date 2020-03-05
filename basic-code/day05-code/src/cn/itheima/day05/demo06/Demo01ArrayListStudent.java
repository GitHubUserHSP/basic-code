package cn.itheima.day05.demo06;

import java.util.ArrayList;

public class Demo01ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student one=new Student("赵大",20);
        Student two=new Student("王二",21);
        Student three=new Student("张三",22);
        Student four=new Student("李四",23);


        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println(stu.getName()+stu.getAge());
        }




    }
}
