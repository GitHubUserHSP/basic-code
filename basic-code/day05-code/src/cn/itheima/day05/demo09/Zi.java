package cn.itheima.day05.demo09;

public class Zi extends Fu{
    int numZi=20;

    public Zi(){
        System.out.println("子类方法执行");

    }
    public void methodZi(){
        System.out.println("子类方法执行");
    }
    public void methodOverload(int a,int b){
        System.out.println("子类带双参重载方法执行！");
    }
    @Override
    public void methodOverride(){
        System.out.println("子类重写方法执行！");
    }

}




