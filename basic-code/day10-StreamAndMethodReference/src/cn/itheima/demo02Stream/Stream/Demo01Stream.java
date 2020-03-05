package cn.itheima.demo02Stream.Stream;

import java.util.ArrayList;
import java.util.List;

//对与cn.itheima.demo01Iterator.Stream 中的过滤方法用JDK1.8之后出现的Stream流优化代码
public class Demo01Stream {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream().filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(s-> System.out.println(s));
    }
}
