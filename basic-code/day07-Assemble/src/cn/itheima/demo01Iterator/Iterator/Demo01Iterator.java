/*迭代器的使用*/
package cn.itheima.demo01Iterator.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {

        Collection<String> coll=new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        System.out.println(coll);
        //多态 iterator的使用把集合变成数组
//              接口           实现类对象
        Iterator<String> it=coll.iterator();

        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }
        System.out.println("================");
        for(Iterator<String> it1=coll.iterator();it1.hasNext();){ //hasnext是判断有无下一个，next都是取下一个故可省略步进表达式
            String str1 = it1.next();
            System.out.println(str1);
        }
    }
}
