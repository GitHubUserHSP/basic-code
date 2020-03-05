//找出数组中最大的数
package cn.itheima.day04.demo03;

public class GetArrayMax {
    public static void main(String[] args) {
        int[] arrray={5,8,10,9,30};
        int max=arrray[0];
        for (int i = 1; i < arrray.length; i++) {

            if (arrray[i] > max) {
                max =arrray[i] ;
            }
        }
        System.out.println(max);
    }
}
