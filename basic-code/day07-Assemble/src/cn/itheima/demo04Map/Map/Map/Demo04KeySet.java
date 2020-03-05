package cn.itheima.demo04Map.Map.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*Map集合通过键找值的方法遍历集合 keySet()方法会把键存储在Set集合中*/
/*Map集合通过Entry对象遍历Map中的entrySet方法
Map.Entry<K，v>*/
public class Demo04KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",15);
        map.put("李四",20);
        map.put("王五",18);
        System.out.println(map);
        Set<String> set = map.keySet();
        //迭代器遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("============");
        //foreach增强for循环
        for(String key:set){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
         }
        System.out.println("============");

         for (String key:map.keySet()) {
             Integer value = map.get(key);
             System.out.println(key+"="+value);
         }
        System.out.println("============");
        Set<Map.Entry<String, Integer>> set1 = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
        while (it1.hasNext()){
            Map.Entry<String, Integer> next = it1.next();
            System.out.println(next.getKey()+"="+next.getValue());

        }
        System.out.println("============");
        for(Map.Entry<String,Integer> entry:set1){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }


    }
}
