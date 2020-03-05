package cn.itheima.day05.demo05;

import java.util.ArrayList;
import java.util.Random;

/*生成6个从1-33的随机整数添加并遍历集合
* */
public class Demo03ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> listA=new ArrayList<>();
        Random ran=new Random();
        int i1=0;
        for (int i = 0; i < 6; i++) {
            i1= ran.nextInt(33) + 1;
            System.out.println(i1);
            listA.add(i1);
        }
        System.out.println("===============");
        for (int i = 0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
        }
    }
}
