package cn.itheima.demo05ObjectStream;

import java.io.Serializable;
/*static关键字修饰的优先于非静态加载到内存中（也优先于对象进入到内存）
被static修饰的成员变量不能被序列化，序列化的都是对象
transient 瞬态关键字 被transient修饰的成员变量，不能被序列化
* */
public class Person implements Serializable{

    private static  final long serialVersionUID=1L;//不加该序列号，当序列化后，直接反序列化正常
                //序列化后，修改类，反序列化会报InvalidClassException异常
            //加上该序列号，无论是否修改类，或者在序列化前后修改，都不会报InvalidClassException异常
    private String name;
    public int age;
//    private static int age; //被static修饰后反序列化打印输出，值为默认值0
//    private transient int age; //被static修饰后反序列化打印输出，值为默认值0


    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
