package cn.itheima.day05.demo08;

import java.util.Arrays;

/*使用Arrays相关的API实现一个随机的字符串中所有字符升序排列，并倒序打印
* */
public class Demo01ArraysPractice {
    public static void main(String[] args) {
        String str="asdfasdf49362badfas";
        char[] chr=str.toCharArray();
        Arrays.sort(chr);
        System.out.println("升序排序");
        for (int i = 0; i < chr.length; i++) {
            System.out.print(chr[i]);
        }
        System.out.println();
        System.out.println("倒序打印:");
        for(int i=chr.length-1;i>=0;i--){
            System.out.print(chr[i]);
        }



    }
}
