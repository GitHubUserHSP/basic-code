package cn.itheima.demo02Properties.PlayPoker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*斗地主案例分析 四步
1.准备牌   //一个集合 两个数组存放花色和排序最后拼接存放集合
2.发牌    //四个集合 前51张轮流发给三个人后三张给底牌
3.洗牌    //使用collections中的方法 static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
4.看牌    循环遍历
* */
public class Doudizhu {
    public static void main(String[] args) {
        //1.
        ArrayList<String> poker=new ArrayList<>();
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3",};
        /*for (int i=0;i<colors.length;i++){//使用增强for循环也行
            for (int i1 = 0; i1 < numbers.length; i1++) {
                poker.add(colors[i]+numbers[i1]);
            }
        }*/
        for (String str:colors) {
            for (String str1 : numbers) {
                poker.add(str+str1);
            }
        }
        poker.add("大王");
        poker.add("小王");
        System.out.println(poker);
        //2.
        Collections.shuffle(poker);
        System.out.println(poker);//洗过后的牌 每运行一次 牌序会变
        //3.
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if(i>=51){
                dipai.add(poker.get(i));
            }else if(i%3==0){
                player1.add(poker.get(i));
            }else if(i%3==1){
                player2.add(poker.get(i));
            }else if(i%3==2){
                player3.add(poker.get(i));
            }

        }
        //4.
        int size=player1.size();
        System.out.print("玩家一的牌");
        for (Iterator<String> it=player1.iterator();it.hasNext();){
            if (size>1) {
                System.out.print(it.next()+",");
            }
            else if(size==1)
                System.out.println(it.next());
            size--;

        }
        System.out.println("周润发的牌"+player2);
        System.out.println("高进的牌"+player3);
        System.out.println("底牌"+dipai);

    }

}
