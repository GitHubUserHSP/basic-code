package cn.itheima.demo02Properties.PlayPoker;

import java.util.*;
//斗地主增强案列 有序
public class DoudizhuZengQiang {
    public static void main(String[] args) {
        //1.两个花色和排序的数组组装放在集合中
        HashMap<Integer,String> poker=new HashMap<>();//放组装好的牌的集合

        List<Integer> pokerIndex=new ArrayList<>();//放牌的索引
        
        List<String> colors=List.of("♠","♥","♣","♦");
        List<String> numbers=List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String c : colors) {
            for (String n : numbers) {
                poker.put(index,c+n);
                pokerIndex.add(index);
                index++;
            }
        }

        System.out.println(poker);
        System.out.println(pokerIndex);
        //2.洗牌
        Collections.shuffle(pokerIndex);//洗完牌后牌的索引变(牌乱了) 集合的索引没变
        System.out.println("洗牌后");
        System.out.println(poker);
        System.out.println(pokerIndex);
        //3.发牌
        ArrayList<Integer> play01=new ArrayList<>();
        ArrayList<Integer> play02=new ArrayList<>();
        ArrayList<Integer> play03=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();

        for (int i=0;i<pokerIndex.size();i++) {
            Integer in = pokerIndex.get(i);
            if(i>=51){
                dipai.add(in);
            }else if(i%3==0){
                play01.add(in);
            }else if(i%3==1){
                play02.add(in);
            }else if(i%3==2) {
                play03.add(in);
            }
        }
        System.out.println("发牌");
        System.out.println(play01);
        System.out.println(play02);
        System.out.println(play03);
        System.out.println(dipai);

        //4.排序  用Collections的sort方法 默认升序
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);
        Collections.sort(dipai);
        //5.看牌 调用看牌方法   //直接打印是牌的索引
       /* System.out.println("玩家一"+play01);
        System.out.println("玩家二"+play02);
        System.out.println("玩家三"+play03);
        System.out.println("底牌"+dipai);*/
        lookpoker("玩家一",poker,play01);
        lookpoker("玩家二",poker,play02);
        lookpoker("玩家三",poker,play03);
        lookpoker("底牌",poker,dipai);

    }

    private static void lookpoker(String name,HashMap<Integer,String> hashMap,List<Integer> list) {
        System.out.print(name+" ");
        for (Integer in : list) {
            String s = hashMap.get(in);
            System.out.print(s+" " );
        }
        System.out.println();
    }


}
