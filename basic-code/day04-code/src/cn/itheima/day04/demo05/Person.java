package cn.itheima.day04.demo05;

public class Person {
    String name;
    private int age;

    public  void show(){
        System.out.println("名字是："+name+",年龄是："+age);
    }

    public void setAge(int num){
        if(num<110&&num>0){
            age=num;
        }else{
            System.out.println("数据不合理！");
        }

    }
    public int getAge(){
        return age;
    }
}
