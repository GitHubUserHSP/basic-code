package cn.itheima.day06.demo02;

public class Laptop {

    public void  powerOn(){
        System.out.println("笔记本开机");

    }
    public void  powerOff(){

        System.out.println("笔记本关机");
    }

    public  void useDevice(Usb usb){
        usb.open();
        if (usb instanceof Mouse){
            Mouse mouse=(Mouse)usb;//向下转型
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard)usb;//向下转型
            keyboard.type();

        }
        usb.close();
    }



}
