package cn.itheima.day05.demo01;

import java.util.Scanner;

/*从键盘获取三个数并求出最大值
* */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个整数");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max;

        /*//第一种方法实现
        if (a>b){
            if(a>c)
                max=a;
            else
                max = c;
        }
        else{
            if (b>c)
                max=b;
            else
                max=c;
        }*/
        //三目运算符实现
        int temp=a>b?a:b;
        max=temp>c?temp:c;

        System.out.println("最大值是："+max);

    }
}
