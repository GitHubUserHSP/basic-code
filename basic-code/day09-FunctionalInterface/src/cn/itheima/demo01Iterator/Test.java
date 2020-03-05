package cn.itheima.demo01Iterator;

import java.util.ArrayList;
import java.util.function.Predicate;

/*练习集合信息筛选 数组当中多条信息
请通过Predicate接口的拼装将符合要求(性别为男 名字为四个字的)的字符串筛选到ArrayList中
但需满两个条件：1.女生2.名字四个字
* */
public class Test {
    public static ArrayList<String> filter(String[] array, Predicate<String> pre1, Predicate<String> pre2){
        //定义一个集合存放筛选后的字符串
        ArrayList<String> list=new ArrayList<>();

        for (String s : array) {
            boolean b = pre1.and(pre2).test(s);
            if(b){
                list.add(s);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String[] strings={"马儿扎哈-男","巴西扎单-男","迪丽热巴-女","树上春树-男","古力娜扎-女"};
        /*ArrayList<String> result = filter(strings, (String str) -> {
            return str.split("-")[0].length() >= 4;
        }, (String str2) -> {
            return str2.split("-")[1].equals("男");
        });*/
        //lambda优化
        ArrayList<String> result = filter(strings,str -> str.split("-")[0].length() >= 4,
                str2 ->  str2.split("-")[1].equals("男"));

        System.out.println(result);//可直接打印 也可遍历集合
    }

}
