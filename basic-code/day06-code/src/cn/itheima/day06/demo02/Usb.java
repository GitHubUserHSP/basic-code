package cn.itheima.day06.demo02;

public interface Usb {

    public abstract void open();// 打开usb设备

    public abstract void close();// 关闭usb设备

    /*public static void closeDevice(){
        System.out.println("关闭设备");
    }*/

}
