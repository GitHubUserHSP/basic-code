package cn.itheima.day05.demo04;
/* 使用数组来存储三个Person对象
* */
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array=new Person[3];

        Person person=new Person("迪丽热巴",18);
        Person person1=new Person("古力娜扎",28);
        Person person2=new Person("马尔扎哈",38);

        System.out.println(array[0]);//输出的是默认值 null
        System.out.println(person);//输出的是地址
        System.out.println("===============");
        array[0]=person;
        System.out.println(array[0]);//赋值后，输出的不再是默认值而是的地址
        System.out.println("===============");
        System.out.println(array[0].getName());
        System.out.println(person.getAge());
        System.out.println("===========");
        System.out.println("用setAge()修改年龄");
        array[0].setAge(20);//由于赋值 改行等价于 person.setAge(20);
        System.out.println(person.getAge());

    }
}
