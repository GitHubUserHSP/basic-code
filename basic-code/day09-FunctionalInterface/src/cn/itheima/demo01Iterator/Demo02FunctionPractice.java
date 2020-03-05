package cn.itheima.demo01Iterator;

import java.util.function.Function;

//将字符串的“赵丽颖，20”的年龄截取出来  加上20
public class Demo02FunctionPractice {
    public static int change(String string, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
//        Integer apply = fun1.andThen(fun2).andThen(fun3).apply(string);
       return fun1.andThen(fun2).andThen(fun3).apply(string);
       /* System.out.println(apply);
        return apply;*/
    }

    public static void main(String[] args) {
        String str="赵丽颖,20";
        int num =change(str, (String str1) -> {
            return str1.split(",")[1];
        }, (String str2) -> {
            return Integer.parseInt(str2);
        }, (Integer in) -> {
            return in + 20;
        });

        System.out.println(num);
    }
}
