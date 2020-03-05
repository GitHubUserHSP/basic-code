package cn.itheima.day05.demo03;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random random = new Random();
        int i1 = random.nextInt();//int范围内任意数
        int i = random.nextInt(18);//范围为 [0,18)
        System.out.println(i1);
        System.out.println(i);
    }
}
