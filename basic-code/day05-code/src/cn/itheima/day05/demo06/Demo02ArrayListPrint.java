package cn.itheima.day05.demo06;

import java.util.ArrayList;

/*集合作为方法参数
题目：使用方法打印格式为{赵大@王二@张三@李四}
* */
public class Demo02ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("赵大");
        list.add("王二");
        list.add("张三");
        list.add("李四");

        System.out.println("原来的:"+list);
        System.out.print("格式化后:");
        printArrayList(list);

    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i==list.size()-1){
                System.out.print("}");
            }else {
                System.out.print("@");
            }
        }
    }
}
