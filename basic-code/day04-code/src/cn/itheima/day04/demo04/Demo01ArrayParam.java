package cn.itheima.day04.demo04;
/*数组作为方法的参数传递时，传递的是数组的地址值*/
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array={7,29,10,8,9,13};
        System.out.println(array[0]);//下行代码传进去的是参数是数组的地址值
        printArray(array);
    }


    public static void printArray( int[] array){
        System.out.println("方法接收的参数是"+array);//接收的也是地址值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
