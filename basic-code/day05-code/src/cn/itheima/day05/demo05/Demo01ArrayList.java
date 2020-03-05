package cn.itheima.day05.demo05;

import java.util.ArrayList;
/*数组的长度不可发生改变，但ArrayList集合的长度可以任意改变
注意：对于ArrayList来说<E>是泛型，装在集合中的所有元素全部是统一类型
泛型只能是引用类型，不能是基本类型

* */
public class Demo01ArrayList {
    public static void main(String[] args) {

//        从JDK1.7开始，左边<>内可以不写东西，但左边少不了
        ArrayList<String> list=new ArrayList<>();

        System.out.println(list);
        list.add("马尔扎哈");
        System.out.println(list);
        list.add("迪丽热巴");
        list.add("古力娜扎");
        System.out.println(list);
    }
}
