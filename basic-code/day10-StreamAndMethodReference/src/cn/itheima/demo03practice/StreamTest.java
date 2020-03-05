package cn.itheima.demo03practice;

import java.util.ArrayList;
import java.util.stream.Stream;

/*用Stream流比较传统方式实现两个集合元素的处理

* */
public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> al1=new ArrayList<>();
        al1.add("迪丽热巴");
        al1.add("宋远桥");
        al1.add("苏星河");
        al1.add("石破天");
        al1.add("石中宇");
        al1.add("老子");
        al1.add("庄子");
        al1.add("洪七公");
        //第一队人中只要三个字名字的人存储到新集合中，筛选后只要前三个人，存储到新集合
        Stream<String> al1Stream = al1.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> al2=new ArrayList<>();
        al2.add("古力娜扎");
        al2.add("张无忌");
        al2.add("赵丽颖");
        al2.add("张三丰");
        al2.add("尼古拉斯赵四");
        al2.add("张天爱");
        al2.add("张二狗子");

        //第二个只要姓张的存集合，筛选后不要前两个人存集合
        Stream<String> al2Stream = al2.stream().filter(name -> name.startsWith("张")).skip(2);
        //使用集合的addAll()将两个合成一个
        // Stream流中的concat混淆
        /*for(int i=0;i<al2.size();i++) {
            al1.add(al2.get(i));
        }
        al1.addAll(al2);
        System.out.println(al1);*/
        //原合并集合转换为用Stream流合并
//        将两个集合合并为一个存储到新集合，根据姓名创建Person对象存到新集合，打印整个Person对象信息
//          需用map方法把String类型的name转换为Person也是数据类型的转换
        Stream.concat(al1Stream, al2Stream).map(name-> new Person(name)).forEach(name-> System.out.println(name));

    }
}
