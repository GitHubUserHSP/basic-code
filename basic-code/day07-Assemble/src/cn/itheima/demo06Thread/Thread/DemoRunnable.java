package cn.itheima.demo06Thread.Thread;

public class DemoRunnable {
    public static void main(String[] args) {
        RunnableImpl ri=new RunnableImpl();

        Thread thread=new Thread(ri);

        thread.start();
    }
}
