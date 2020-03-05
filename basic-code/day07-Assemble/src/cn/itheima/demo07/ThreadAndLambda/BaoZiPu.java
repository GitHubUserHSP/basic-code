package cn.itheima.demo07.ThreadAndLambda;
//生产者
public class BaoZiPu extends Thread {

    private BaoZi bz;
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count=0;
        while(true){

            synchronized(bz){
                if (bz.tag==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {//为增加趣味性，交替生产两种包子
                    bz.pi = "薄皮";
                    bz.xian = "猪肉";
                } else {//为增加趣味性，交替生产两种包子
                    bz.pi = "冰皮";
                    bz.xian = "韭菜";
                }
                count++;
                System.out.println("包子铺正在生产包子"+bz.pi+"皮"+bz.xian+"馅包子");
                try {
                    Thread.sleep(1000);//生产包子的时间
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.tag=true;//更改包子状态
                bz.notify();//唤醒消费者(吃货)线程
                System.out.println("包子铺生产好了包子"+bz.pi+"皮"+bz.xian+"馅包子，吃货可以开始吃了");
            }
        }

    }
}
