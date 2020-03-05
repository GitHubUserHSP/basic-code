package cn.itheima.demo01Iterator.Stream;

import java.util.ArrayList;
import java.util.List;

//使用传统的方法 对集合中的元素进行过滤
public class Demo01List {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }*/
        //过滤前
        for (String s : list) {
            System.out.println(s);
        }
        //筛选姓张的
        ArrayList<String> zhangLit=new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张"))
                zhangLit.add(s);
        }
        //筛选三个字的
        ArrayList<String> shortName=new ArrayList<>();
        for (String s : zhangLit) {
            if(s.length()==3)
                shortName.add(s);
        }
        System.out.println("=============");
        //遍历筛选后的集合
        for (String s : shortName) {
            System.out.println(s);

        }
    }
}
