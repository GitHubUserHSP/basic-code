package cn.itheima.day04.demo05;

public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setName(String str){
        name=str;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(boolean b){
        male=b;
    }
    public boolean isMale(){//方法名字不写成getMale()
        return male;
    }
}
