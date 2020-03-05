package cn.itheima.demo01Iterator.Iterator;

import java.util.ArrayList;

/*增强for循环,又名foreach只能用来遍历集合或数组不能增删操作,并且简化迭代器
for(集合或则数组的类型 对象名:名称){}
* */
public class Demo02Foreach {
    public static void main(String[] args) {
        demo01();
        System.out.println("================");
        demo02();
    }

    private static void demo01() {
        String[] str={"str","srfsa","asdf","张三"};
        for (String s:str) {
            System.out.println(s);
        }
    }

    private static void demo02() {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(65);
        list.add(18);
        for(Integer in:list){
            System.out.println(in);
        }



    }
}
