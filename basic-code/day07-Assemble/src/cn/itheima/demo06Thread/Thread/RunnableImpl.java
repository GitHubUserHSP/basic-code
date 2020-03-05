package cn.itheima.demo06Thread.Thread;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了新的线程执行了");
    }
}
