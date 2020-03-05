package cn.itheima.demo04Map.Map;

import java.util.*;

/*计算（用户输入）字符串中字符出现的次数*/

public class MapTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");

        char[] charArray = sc.next().toCharArray();   //把获取的字符数组转换为字符放到字符数组中
        HashMap<Character,Integer> map=new HashMap<>(); //创建集合用来存放字符和出现的次数
        for(char ch:charArray){     //增强for循环遍历数组并判断集合中是否又该元素 有数量加一 没有存入key 和value 次数
            if (map.containsKey(ch) ){
                Integer value = map.get(ch);
                value++;
                map.put(ch, value);
            } else {
                map.put(ch, 1);
            }

        }

      /*for (int i = 0; i < charArray.length; i++) {
            if (map.containsKey(charArray[i]) ){
                Integer value1 = map.get(charArray[i]);
                value1++;
                map.put(charArray[i], value1);
            } else {
                map.put(charArray[i], 1);
            }
        }*/

        Set<Character> set = map.keySet();
        Iterator<Character> it = set.iterator();
        while(it.hasNext()){
            Character key1 = it.next();
            System.out.println(key1+"出现了"+map.get(key1)+"次数");
        }
    }
}

