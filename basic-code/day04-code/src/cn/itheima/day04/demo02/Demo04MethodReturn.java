package cn.itheima.day04.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        System.out.println(getSum(10,15));
        System.out.println("================");

        printSum(5,6);


    }
    public static int getSum(int a,int b){
        int result=a+b;
        return result;

    }
    public static void printSum(int a,int b){
        int result=a+b;
        System.out.println(result);

    }
}
