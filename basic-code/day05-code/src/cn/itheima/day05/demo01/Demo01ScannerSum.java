package cn.itheima.day05.demo01;

import java.util.Scanner;

//从键盘获取两个整数求和
public class Demo01ScannerSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入两个数回车即可求和");
        int result=sc.nextInt()+sc.nextInt();
        System.out.println("键盘上输入的两个数的和为："+result);
    }
}
