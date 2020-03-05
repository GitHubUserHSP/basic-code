package cn.itheima.demo06Thread.Thread;
/*匿名内部类实现线程的创建
* */
public class NoNameInnerClassThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<5;i++) {
                    System.out.println(Thread.currentThread().getName());

                }
            }
        }.start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i=0;i<5;i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();

    }
}
