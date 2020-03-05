package cn.itheima.day04.demo04;
//任何数据类型都能作为方法的参数类型和返类型
//下面举例使用数组作为方法返回值类型
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result=calculate(5,15,8);
        System.out.println("main方法中的接收到的返回值类型是：");
        System.out.println(result);//地址值
        System.out.println("总和"+result[0]);
        System.out.println("平均数"+result[1]);
    }
    public static int[] calculate(int a,int b,int c){
        //下列展示两种方法
        //方法一
       /* int sum=a+b+c;
        int avg=sum/3;
        int[] array=new int[2];
        array[0]=sum;
        array[1]=avg;
        return array;*/
       //方法二
        int sum=a+b+c;
        int avg=sum/3;
        int[] array=new int[]{sum,avg};
        System.out.println("calculate方法内部数组是：");
        System.out.println(array);//地址值
        return array;
    }

}
