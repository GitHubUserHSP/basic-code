package cn.itheima.demo03FileUploadOptimize;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*本案列的优化针对
                1.客服端多次访问重名会覆盖，文件命名为时间加上文件名加上随机数即可
                2.当客户端访问一次服务器 服务器响应后就关闭（循环解决）
                3.使用多线程技术优化服务器效率 每次客户端访问分配一个线程 完成文件上传


* */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            //死循环accept方法让服务器一直处理监听状态
            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() { //注意由于重写的接口里面run方法没有声明抛出 所以重写后也不能声明抛出 但可try catch
                    FileOutputStream fos = null;
                    try {//可能会抛出异常的语句
                        InputStream is = socket.getInputStream();
                        long l = System.currentTimeMillis();
                        File file = new File("E:\\optimizedAfterUpload");
                        if (!file.exists()) {
                            file.mkdir();
                        }
                        //命名规则 域名+毫秒值+随机数
                        String filename = "itheima" + System.currentTimeMillis() + new Random().nextInt(9999) + ".txt";
                        fos = new FileOutputStream(file + "\\" + filename);//服务器的本地流
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                    } catch (IOException e) {//异常处理逻辑
                        System.out.println(e);
                    } finally {//一定会执行的代码
                        if(fos!=null){
                            try {
                                fos.close();
                                socket.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }
            }).start();

        /*循环解决服务器被客户端访问一次就关闭的问题，要去掉关闭服务器的语句
        server.close();*/
        }
    }
}