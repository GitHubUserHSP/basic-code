package cn.itheima.day05.demo06;

import java.util.ArrayList;
import java.util.Random;

/*题目：用一个大集合存20个随机数字，筛选其中的偶数存入小集合中
要求使用自定义的方法实现筛选
* */
public class Demo03ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList=new ArrayList<>();
        Random ran=new Random();
        for (int i = 0; i < 20; i++) {
            int temp= ran.nextInt(20)+1;//20个1~20之间的随机数
            bigList.add(temp);
        }
        System.out.println("所有随机生成的的数"+bigList);
        ArrayList<Integer> smallList=getSmallList(bigList);
        System.out.println("其中的偶数"+smallList);
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smllList=new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int temp=bigList.get(i);
        if(temp%2==0)
            smllList.add(temp);
        }
        return smllList;
    }
}
