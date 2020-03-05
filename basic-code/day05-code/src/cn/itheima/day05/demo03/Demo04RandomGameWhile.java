package cn.itheima.day05.demo03;
//猜数字游戏
import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGameWhile {
    public static void main(String[] args) {
        Random r=new Random();
        int randomNum=r.nextInt(10)+1;
        System.out.println("请猜[1~10]的数");
        int i=0;
        while (i<5){
            int guessNum=new Scanner(System.in).nextInt();
            if(guessNum<randomNum){
                System.out.println("你猜小了(剩余"+(4-i)+"次).");
                i++;
            }else if(guessNum>randomNum){
                System.out.println("你猜大了(剩余"+(4-i)+"次).");
                i++;
            }
            else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
        System.out.println("游戏结束。");
    }
}
