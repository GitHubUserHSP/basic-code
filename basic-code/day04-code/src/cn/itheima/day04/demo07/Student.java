package cn.itheima.day04.demo07;
/*一个标准的类有下列四个组成部分
1.所有成员变量必须要用private修饰
2.为每一成员变量编写一对setter和getter方法
3.编写无参构造方法
4.编写带参构造方法
这样的标准类也叫Java Bean
* */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {//使用带参构造方法（如果两个成员变量，两个参数可以称为全参构造方法）
                                            //可以不使用setter和getter方法就能访问，但如果要修改还是要一堆setter和
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
