package cn.itheima.day06.demo02;

public class Keyboard implements Usb{
    @Override
    public void open() {

        System.out.println("打开键盘");
    }
    @Override
    public void close(){

        System.out.println("关闭键盘");
    }


    public  void type(){
        System.out.println("键盘输入");

    }



}
