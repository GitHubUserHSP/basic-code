package cn.itheima.day06.demo02;

/*接口的使用，对象的上下转型，接口作为方法的参数
* */
public class DemoMain {
    public static void main(String[] args) {

        //创建一个笔记本电脑
        Laptop laptop=new Laptop();
        laptop.powerOn();

        //向上转型
//        Usb usbMouse=new Mouse();
        //或向上转型
        Mouse mouse=new Mouse();
        Usb usbMouse=mouse;//左父右子是多态，左边是接口右边是实现类也是多态

        laptop.useDevice(usbMouse);//参数是Usb类型，传递的也是USB类型

        Keyboard keyboard=new Keyboard();//没使用多态，
        //方法参数类型是Usb类型，传递的是实现类

        laptop.useDevice(new Keyboard());//子类对象，匿名对象


        laptop.powerOff();
        System.out.println("==================");
        method(10.2);
        method(15);
        int a=36;
        method(a);//这几行是自动类型转换

    }
    public static void method(double dou){
        System.out.println(dou);

    }

}
