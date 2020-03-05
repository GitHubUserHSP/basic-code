package cn.itheima.demo06Thread.ArrayMethodReference;

import java.util.Arrays;

public class DemoTest {
    public static int[] createArray(int len,ArrayBuilder ab){
        return ab.builderArray(len);
    }

    public static void main(String[] args) {
        int[] array = createArray(10, (len) -> {
            return new int[len];
        });
        System.out.println(array.length);

        //方法引用优化
        int[] array1 = createArray(12,int[]::new);//创建的int[]数组 长度已知道，用方法引用
                                                    //int[] 引用new,根据参数传递的长度创建数组
        System.out.println( Arrays.toString(array1));//显示数组里面的内容，用Arrays工具类的toString方法
        System.out.println(array1.length);
    }



}
