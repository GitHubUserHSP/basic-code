package cn.itheima.day05.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo03RandomGameFor {
    public static void main(String[] args) {
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;

            System.out.println("请输入[1,100]猜测数字(5次机会)：");
        for (int i = 0; i < 5; i++) {
            Scanner sc=new Scanner(System.in);
            int guessNum=sc.nextInt();
            if (guessNum>randomNum){
                System.out.println("你猜大了.");
                System.out.println("请再猜(剩余"+(4-i) +"次):");
            }
            else if (guessNum<randomNum){
                System.out.println("你猜小了.");
                System.out.println("请再猜(剩余"+(4-i)+"次):");
            }
            else{
                System.out.println("恭喜你，你猜对了！");
                break;
            }
        }
            System.out.println("游戏结束。");

    }
}
