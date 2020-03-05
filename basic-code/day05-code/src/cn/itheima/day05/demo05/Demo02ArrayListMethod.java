package cn.itheima.day05.demo05;

import java.util.ArrayList;

/*ArrayList常用方法
public boolean add(E e):向集合中添加元素，参数类型与泛型中的类型一致，返回值代表添加成功
备注：对于ArrayList来说add添加动作必然成功，故返回值可用可不用
但对于其他集合(今后学习)，add添加动作不一定成功
public E get(int index):从集合中获取元素，参数就是获取位置的索引值(从0开始)，返回值就是所获取元素
public E remove(int index):根据索引值删除对应位置的元素，返回值是所删元素
public int size():获取集合的尺寸长度，返回值是集合中包含的元素的个数
* */
public class Demo02ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        boolean success=list.add("马尔扎哈");
        System.out.println(list);
        System.out.println("添加的元素是否成功"+success);
        list.add("迪丽热巴");
        list.add("古力娜扎");

        System.out.println(list.get(2));
        System.out.println("被删前打印");
        System.out.println(list);

        System.out.println("集合长度："+list.size());

        System.out.println("被删除的元素是："+list.remove(1));
        System.out.println("删除后"+list);

        System.out.println("集合长度"+list.size());

        System.out.println("遍历访问：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
