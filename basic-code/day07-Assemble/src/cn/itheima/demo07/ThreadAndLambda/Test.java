package cn.itheima.demo07.ThreadAndLambda;

public class Test {
    public static void main(String[] args) {
        BaoZi bz=new BaoZi();
        new BaoZiPu(bz).start ();
        new ChiHuo(bz).start();
    }
}
