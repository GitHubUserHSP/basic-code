package cn.itheima.day05.demo01;

import java.util.Scanner;

/*只有在lang包下的类引入时可以不用导包，其他均需。
Scanner类功能获取键盘输入值
int nextInt()//int为返回值类型
String next()//String为返回值类型

* */
public class Demo02ScannerPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=sc.nextInt();
        System.out.println("键盘上输入的时是："+result);//该行从键盘上获取int
        System.out.println("===============");
        System.out.println("键盘上输入的时是："+sc.next());//该行从键盘上获取字符串


    }
}
