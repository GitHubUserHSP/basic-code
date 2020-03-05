package cn.itheima.day06.test;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        int a;
        a=26/24;
        System.out.println(a);
        System.out.println("============");
        int c=26%24;
        System.out.println(c);
        System.out.println("scanner实现键盘输入：");
        /*Scanner scanner=new Scanner(System.in);
        System.out.println(scanner.nextInt());*/
        System.out.println(new Scanner(System.in).nextInt());//匿名对象方法


    }
}
