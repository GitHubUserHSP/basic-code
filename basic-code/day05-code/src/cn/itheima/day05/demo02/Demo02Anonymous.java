package cn.itheima.day05.demo02;

import java.util.Scanner;

//使用匿名对象作为方法的返回值和参数示例
public class Demo02Anonymous {
    public static void main(String[] args) {
        //一般方法使用
        /*Scanner sc=new Scanner(System.in);
        sc.nextInt();*/

        //匿名对象使用
        //new Scanner(System.in).nextInt();

        //使用一般方法传参
       /* Scanner sc=new Scanner(System.in);
        methodParam(sc);*/

        //使用匿名对象传参
//        methodParam(new Scanner(System.in));


        Scanner sc=methodReturn();
        System.out.println("你输入的是："+sc.nextInt());


    }
    public static void methodParam(Scanner sc){
        int num=sc.nextInt();
        System.out.println(num);
    }
    public static Scanner methodReturn(){
       /* Scanner sc=new Scanner(System.in);
        return sc;*/
       return new Scanner(System.in);
    }

}
