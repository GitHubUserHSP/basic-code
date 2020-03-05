package cn.itheima.day05.demo09;

public class Fu {
    int numFu=10;

    public Fu(){

        System.out.println("父类构造方法执行");
    }

    public void methodFu(){
        System.out.println("父类方法执行！");
    }

    public void methodOverload(){
        System.out.println("父类重载方法执行！");

    }
    public void methodOverload(int a){

        System.out.println("父类重载带参方法执行！");
    }
    
    public void methodOverride(){
        System.out.println("父类重写方法执行！");
    }
}
