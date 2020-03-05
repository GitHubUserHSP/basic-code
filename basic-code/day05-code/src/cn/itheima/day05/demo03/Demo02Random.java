package cn.itheima.day05.demo03;

import java.util.Random;

//练习：求[1~n]的随机数
public class Demo02Random {
    public static void main(String[] args) {

        int n=5;
        Random r = new Random();
//        +1实现了从[0,n)到[1,n+1)==[1,n]
        for (int i = 0; i < 5; i++) {
            int result=r.nextInt(n)+1;
            System.out.println(result);
        }
    }
}
