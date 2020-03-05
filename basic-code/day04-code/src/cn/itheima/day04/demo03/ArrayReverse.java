package cn.itheima.day04.demo03;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array={7,29,10,8,9,13};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("===============");
        /*
        for循环   初始化语句：int min=0,int max=array.length-1
                  条件判断：min<max
                  步进表达式：min++,max--
                  循环体：temp=array[min];array[min]=array[max];array[max]=temp;
        * */
        for(int min=0,max=array.length-1;min<max;min++,max--){
            int temp=array[min];
            array[min]=array[max];
            array[max]=temp;
        }
        //反转后的数组再次遍历访问一遍
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
