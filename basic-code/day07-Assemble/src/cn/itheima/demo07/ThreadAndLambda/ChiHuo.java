package cn.itheima.demo07.ThreadAndLambda;

//消费者
public class ChiHuo extends Thread{
    private BaoZi bz;
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run(){
        while (true){
            synchronized(bz){
                if(bz.tag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货开始吃包子"+bz.pi+"皮"+bz.xian+"馅包子");
                bz.tag=false;
                bz.notify();
                System.out.println("吃货已经吃完包子"+bz.pi+"皮"+bz.xian+"馅包子，包子铺可以生产包子了");
                System.out.println("===================");
            }

        }

    }


}
